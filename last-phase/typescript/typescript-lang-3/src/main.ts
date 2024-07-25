console.log("Hello Typescript!");


try{
    if (Math.random() <0.5){
        throw 5;
    }else{
        throw new Error('Something went wrong')
    }

}catch (e){
    if (e instanceof Error)
    console.log(e.message)
    else
        console.log("A number")
}