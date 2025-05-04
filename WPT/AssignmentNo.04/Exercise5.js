function fetchData(url, callback) {
  console.log(`Fetching data from ${url}...`);

  setTimeout(function () {
    const isError = url.includes("facebook");
    if (isError) {
      callback("Error: Unable to fetch data from Facebook.", null);
    } else {
      const response = `Response from ${url}`;
      callback(null, response);
    }
  }, 2000);
}

function processData(data, callback) {
  setTimeout(function () {
    const processed = `${data} — processed successfully.`;
    callback(processed);
  }, 1000);
}

fetchData("https://www.example.com/data", function (error, response) {
  if (error) {
    console.error("Fetch failed:", error);
  } else {
    processData(response, function (processedData) {
      console.log("Final Result:", processedData);
    });
  }
});
