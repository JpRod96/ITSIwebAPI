class App{
	constructor(){
        this.addEventHandlers();
    }

    addEventHandlers(){
        let element = document.querySelector("#left-div");
        element.addEventListener("mouseenter", () => {
            $("#left-div h1").textillate('in')
        });

        element = document.querySelector("#right-div");
        element.addEventListener("mouseenter", () => {
            $("#right-div h1").textillate('in')
        });
    }
}