var data_json =
  '[\
    {\
      "ciudad": "Medellin",\
      "almacen": "La 30",\
      "mes": "Enero",\
      "venta": 1000\
    },\
    {\
      "ciudad": "Medellin",\
      "almacen": "La 30",\
      "mes": "Febrero",\
      "venta": 800\
    },\
    {\
      "ciudad": "Medellin",\
      "almacen": "Los alpes",\
      "mes": "Enero",\
      "venta": 1200\
    },\
    {\
      "ciudad": "Medellin",\
      "almacen": "Los alpes",\
      "mes": "Febrero",\
      "venta": 1000\
    },\
    {\
     "ciudad": "Medellin",\
     "almacen": "Los alpes",\
     "mes": "Marzo",\
     "venta": 2000\
    },\
    {\
      "ciudad": "Cali",\
      "almacen": "La 30",\
      "mes": "Enero",\
      "venta": 500\
    },\
    {\
      "ciudad": "Cali",\
      "almacen": "La 30",\
      "mes": "Febrero",\
      "venta": 400\
    },\
    {\
      "ciudad": "Cali",\
      "almacen": "Los alpes",\
      "mes": "Enero",\
      "venta": 800\
    },\
    {\
      "ciudad": "Cali",\
      "almacen": "Los alpes",\
      "mes": "Febrero",\
      "venta": 700\
    },\
    {\
      "ciudad": "Cali",\
      "almacen": "Los alpes",\
      "mes": "Marzo",\
      "venta": 600\
    }\
  ]';

const obj = JSON.parse(data_json);

const ciudades = ["Medellin", "Cali"];
const meses = ["Enero", "Febrero", "Marzo"];

const filter = (obj, ciudad, mes) => {
  return obj.filter((object) => {
    return object.ciudad === ciudad && object.mes === mes;
  });
};

function addElement(ciudad, mes, valor) {
  // crea un nuevo div
  // y añade contenido
  var newDiv = document.createElement("div");
  var newContent = document.createTextNode(
    "El mes de " +
      mes +
      " " +
      "en la Ciudad de  " +
      ciudad +
      " " +
      "se vendió: $" +
      valor
  );
  newDiv.appendChild(newContent); //añade texto al div creado.

  // añade el elemento creado y su contenido al DOM
  var currentDiv = document.getElementById("father");
  document.body.insertBefore(newDiv, currentDiv);
}
ciudades.forEach((ciudad) => {
  meses.forEach((mes) => {
    const ciudadFil = filter(obj, ciudad, mes);
    console.log(ciudadFil);
    var values = 0;
    ciudadFil.forEach((ciudad) => {
      values += ciudad.venta;
    });
    addElement(ciudad, mes, values);
    console.log(values);
  });
});
