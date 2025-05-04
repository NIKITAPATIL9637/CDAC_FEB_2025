function fetchData(url, callback) {
  console.log(`Fetching data from ${url}...`);

  setTimeout(function () {
    const response = `Response from ${url}`;
    callback(response);
  }, 2000);
}

fetchData("https://www.facebook.com/profile", function (response) {
  console.log("Received:", response);
});
