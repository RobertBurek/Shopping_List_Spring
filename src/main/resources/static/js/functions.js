let productsContainer = document.querySelector('.products-container ul');
let categoriesContainer = document.querySelector('.family-container ul');
let saveListProductsForm = document.querySelector('.save-new-product-container form');
let makeListProductsForm = document.querySelector('.make-new-product-container form');
let newProductForm = document.querySelector('#addProduct form');
let newCategoryForm = document.querySelector('#addCategory form');
let upOptionAll = document.querySelectorAll('.up button');
let divUp = document.querySelector('.up');
let downOptionAll = document.querySelectorAll('.down button');
let divDown = document.querySelector('.down');
let headerStyle = document.querySelector('header');
let settingStyle = document.querySelector('.setting');
let h2 = document.querySelector('h2');
let textH2 = 'Lista towarów, kategoria: ';
let swapAll = document.querySelectorAll('.btn--swap');
let cleanList = document.querySelector('#cleanList');
let cleanAll = document.querySelector('#cleanAll');
let buttonListhopping = document.querySelector('#making');

let buttonSelectAll = document.querySelectorAll(".lista button.btn.btn-default.select-product-btn");
let buttonPlusAll = document.querySelectorAll(".lista button.btn.plus-product-btn");
let buttonMinustAll = document.querySelectorAll(".lista button.btn.minus-product-btn");
let buttonDeleteAll = document.querySelectorAll(".lista button.btn.btn-danger.delete-product-btn");
let inputQuantityAll = document.querySelectorAll(".lista input.form-control.quantity");

//let numberForList;

function toIndex(index){
    let i=0;
    for(i;i<products.length;i++){
        if(products[i].id==index) {
//        oldProduct = products[i];
//        numberForList=i;
        break;
        };
    };
    return i;
};

document.addEventListener('DOMContentLoaded', function() {

    console.log(inputQuantityAll);
    console.log(categories);
    console.log(products);

    if(optionView) {
        settingStyle.style.display="flex";
    } else {
        settingStyle.style.display="none";
    };

    [].forEach.call(swapAll, function(swap) {
        swap.addEventListener('mouseover', () => {
            swap.disabled = true;
            setTimeout( () => {
                swap.disabled = false;
            }, 2500 );
        });
    });

    // czyszczenie listy zakupów
//    cleanListProducts();

    // czyszczenie wszystkich danych w app
//    cleanAllApp();

    // rozwijany header
    upOptionList();
    downOptionList();

    // Listener dla elementu 'pozostałe'
    //wyświetla produkty nie przypisane do katedorii
    // document.querySelector("#other").addEventListener("click",function(event){
    //     event.preventDefault();
    //     showProductsOther();
    // });

    h2.innerHTML = textH2 + categoryName;
    if (optionView) {
        divDown.classList.add("hidden");
        divUp.classList.remove("hidden");
        headerStyle.classList.add("optionYes");
        headerStyle.classList.remove("optionNo");
        settingStyle.style.display = "flex";
    }

//    obsluga zaznaczania produktu
    [].forEach.call(buttonSelectAll, function(buttonSelect) {
        buttonSelect.addEventListener('click', function(event) {
            let index = toIndex(buttonSelect.getAttribute('value'));
            if ((!products[index].selected)&&(products[index].quantity==0)){
                changeProductList(index,'add');
            }
            changeProductList(index,'sel');
        sendProduct(index);
     })
     });

//    obsługa zwiększania ilości productów
    [].forEach.call(buttonPlusAll, function(buttonPlus) {
        buttonPlus.addEventListener('click', function(event) {
        let index = toIndex(buttonPlus.getAttribute('value'));
//        let state = parseInt(inputQuantityAll[index-1].getAttribute('value'));
        if (products[index].quantity == 0){
            changeProductList(index,'sel');
        }
        if (products[index].quantity < 99) {
            changeProductList(index,'add');
            if (!products[index].selected) changeProductList(index,'sel');
        }
        sendProduct(index);
        })
    });

//    obsługa zmniejszania ilości productów
    [].forEach.call(buttonMinustAll, function(buttonMinus) {
        buttonMinus.addEventListener('click', function(event) {
            let index = toIndex(buttonMinus.getAttribute('value'));
//            let state = parseInt(inputQuantityAll[index-1].getAttribute('value'));
            if (products[index].quantity > 0) {
                changeProductList(index,'red');
            if (!products[index].selected) changeProductList(index,'sel');
            }
            if ((products[index].quantity == 0)&&(products[index].selected)){
                changeProductList(index,'sel');
            }
            sendProduct(index);
        })
    });

//    obsługa usuwania produktu
    [].forEach.call(buttonDeleteAll, function(buttonDelete) {
        buttonDelete.addEventListener('click', function(event) {
            let liToDelete = this.closest('li');
            liToDelete.classList.toggle('hidden');
            let index = toIndex(buttonDelete.getAttribute('value'));
            changeProductList(index,'del');
            sendProduct(index);
        })
    });

console.log("Załadowałem functions.js");
});


function upOptionList(){
    [].forEach.call(upOptionAll, function(upOption) {
        upOption.addEventListener('click', function(event) {
        divUp.classList.add("hidden");
        divDown.classList.remove("hidden");
        headerStyle.classList.add("optionNo");
        headerStyle.classList.remove("optionYes");
        settingStyle.style.display = "none";
        optionView = false;
      })
    })
};

function downOptionList(){
    [].forEach.call(downOptionAll, function(downOption) {
        downOption.addEventListener('click', function(event) {
            divDown.classList.add("hidden");
            divUp.classList.remove("hidden");
            headerStyle.classList.add("optionYes");
            headerStyle.classList.remove("optionNo");
            settingStyle.style.display = "flex";
            divUp.style.display = "flex";
            optionView = true;
        })
    })
};

function trim(text){
    temp = "";
    while(text.indexOf(" ")==0){
        for (j=1; j<text.length; j++) temp += text[j];
        text = temp;
        temp = "";
    }
    text = text.toUpperCase().charAt(0) + text.substr(1, text.length);
    return text;
};

function sendProduct(index){
            fetch("/shoppingList", {
                    method: "put",
                     headers: {
                        'Accept': 'application/json',
                        'Content-Type': 'application/json'
                      },
                    body: JSON.stringify(products[index])
                }).then(res => {
                          console.log(products[index]);
                        })
};

function Product(id,name,quantity,selected,category){
    this.id=id;
    this.name=name;
    this.quantity=quantity;
    this.selected=selected;
    this.category=category;
};

function changeProductList(index, option){
let oldProduct = products[index];
console.log(oldProduct);
        let inputSelected = document.querySelector('#inputAmount'+oldProduct.id);
        console.log(inputSelected);
    switch (option){
        case "add":
        products[index]=new Product(oldProduct.id,oldProduct.name,oldProduct.quantity+1,oldProduct.selected,oldProduct.category);
        inputSelected.setAttribute('value', oldProduct.quantity + 1);
        break;
        case "red":
        products[index]=new Product(oldProduct.id,oldProduct.name,oldProduct.quantity-1,oldProduct.selected,oldProduct.category);
        inputSelected.setAttribute('value', oldProduct.quantity - 1);
        break;
        case "sel":
        products[index]=new Product(oldProduct.id,oldProduct.name,oldProduct.quantity,!oldProduct.selected,oldProduct.category);
        let buttonSelected = document.querySelector('#btnSelect'+oldProduct.id);
        buttonSelected.classList.toggle('btn-success');
        break;
        case "del":
        deleteProduct=new Product(oldProduct.id,null,null,null,null);
        products.splice(index,1,deleteProduct);
        break;
    };
};

