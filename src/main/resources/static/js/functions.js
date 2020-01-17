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
//let products=[];



document.addEventListener('DOMContentLoaded', function() {

let buttonSelectAll = document.querySelectorAll(".lista button.btn.btn-default.select-product-btn");
let buttonPlusAll = document.querySelectorAll(".lista button.btn.plus-product-btn");
let buttonMinustAll = document.querySelectorAll(".lista button.btn.minus-product-btn");
let buttonDeleteAll = document.querySelectorAll(".lista button.btn.btn-danger.delete-product-btn");
//.querySelectorAll('.select-product-btn button');
//console.log(buttonSelectAll);
//console.log(buttonPlusAll);
//console.log(buttonMinustAll);
//console.log(buttonDeleteAll);

//    var produkty = [[${products}]];
//    console.log(produkty);


//console.log(products);
//console.log(products[0]);
//console.log(products[1].id);
//console.log(products[1].name);
//console.log(products[1].category);



    if(optionView) {
        settingStyle.style.display="flex";
    } else {
        settingStyle.style.display="none";
    }

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

//    function(buttonSelect) {
//    console.log("zaznaczamy");
//        buttonSelect.addEventListener('click', function(event) {
//             buttonSelect.classList.toggle('btn-success');
//        })
//    };

//    obsluga zaznaczania produktu
    [].forEach.call(buttonSelectAll, function(buttonSelect) {
        buttonSelect.addEventListener('click', function(event) {
            buttonSelect.classList.toggle('btn-success');
//            console.log(buttonSelect);
            var index = buttonSelect.getAttribute('value');
            listaProd(index,'sel');
//            console.log(products[index-1],index);
        })
     });

//    obsługa zwiększania ilości productów
    [].forEach.call(buttonPlusAll, function(buttonPlus) {
        buttonPlus.addEventListener('click', function(event) {
        var index = buttonPlus.getAttribute('value');
        var valueThis = document.querySelector('#add' + index);
        var state = parseInt(valueThis.getAttribute('value'));
        if (state < 99) {valueThis.setAttribute('value', state + 1);
            listaProd(index,'add');
//            console.log(products[index-1],index);
        }
        })
    });

//    obsługa zmniejszania ilości productów
    [].forEach.call(buttonMinustAll, function(buttonMinus) {
        buttonMinus.addEventListener('click', function(event) {
            var index = buttonMinus.getAttribute('value');
            var valueThis = document.querySelector('#add' + index);
            var state = parseInt(valueThis.getAttribute('value'));
            if (state > 0) {valueThis.setAttribute('value', state - 1);
                listaProd(index,'red');
//                console.log(products[index-1],index);
            }
        })
    });

//    obsługa usuwania produktu
    [].forEach.call(buttonDeleteAll, function(buttonDelete) {
        buttonDelete.addEventListener('click', function(event) {
            var liToDelete = this.closest('li');
            liToDelete.classList.toggle('hidden');
//            console.log(buttonDelete);
            var index = buttonDelete.getAttribute('value');
            listaProd(index,'del');
//            console.log(products[index-1],index);
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

function Product(id,name,quantity,selected,category){
this.id=id;
this.name=name;
this.quantity=quantity;
this.selected=selected;
this.category=category;};

function listaProd(index,option){
oldProduct = products[index-1];
switch (option){
case "add":
products[index-1]=new Product(index,oldProduct.name,oldProduct.quantity+1,oldProduct.selected,oldProduct.category);
break;
case "red":
products[index-1]=new Product(index,oldProduct.name,oldProduct.quantity-1,oldProduct.selected,oldProduct.category);
break;
case "sel":
products[index-1]=new Product(index,oldProduct.name,oldProduct.quantity,!oldProduct.selected,oldProduct.category);
break;
case "del":
products.splice([index-1],1);
break;

};
//products[index-1]=new Product(index-1,'Almette Serek',3,true,'NABIAL');
};

