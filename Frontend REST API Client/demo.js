fetch('http://localhost:8080/products/findAllProduct')
  .then(response => response.json())
  .then(json => console.log(json))