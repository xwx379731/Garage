require.config(
    {
     baseUrl:"js/lib",
     paths:
         {
             jquery:["jquery-3.2.1"]
         }
    }
);
require(["jquery"],function ($){
    $("#nav").click(function (){
        window.location.href="http://www.requirejs.org/docs/api.html";
    });
})