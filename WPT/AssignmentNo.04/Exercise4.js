function fetchData(url, callback) {
    console.log(`Fetching data from ${url}...`);
  
    setTimeout(function() {
      const isError = url.includes("facebook");
  
      if (isError) {
        callback("Error: Unable to fetch data from Facebook.", null);
      } else {
        const response = `Response from ${url}`;
        callback(null, response); 
      }
    }, 2000);
  }
  
fetchData("https://www.facebook.com/profile", function(error, response) {
    if (error) {
      console.error("Fetch failed:", error);
    } else {
      console.log("Received:", response);
    }
  });
  