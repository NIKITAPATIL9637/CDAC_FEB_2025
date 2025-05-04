function forEachElement(arr, callback){
    for(let i=0; i<arr.length; i++){
        callback(arr[i], i);
    }
}

forEachElement([1,2,3,4,5], function(element, index){
    console,log(`Index ${index} : element ${element}`);
})