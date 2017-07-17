window.onscroll = changePos;
var nav = document.querySelector("nav");
var aside = document.querySelector("aside");

function changePos() {
    if (window.pageYOffset > 100) {
        nav.classList.add("fixed-nav");
        aside.classList.add("fixed-aside");
    } else {
        nav.classList.remove("fixed-nav");
        aside.classList.remove("fixed-aside");
    }
}