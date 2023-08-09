# microservice-propiedades.
Se ha desarrollador el microsevicios de propiedades y tipos de propiedades, en donde una propieda puede estar compuesto:
Id, estado, nombre y precio.
Su proposito es de crear, modificar y eliminar las propiedades que puede tener, ademas de su tipo.
<br>
### Lista de propiedades:
#### - "6c6fc866-8cf6-4f71-a198-91240554fdfa" INHABILITADO Hotel Copacabana 70

## - Tipo de propieades:
#### - "3fa85f64-5717-4562-b3fc-2c963f66afa6"	"Casa" 
#### - "3fa85f64-5717-4578-b3fc-2c897845afa6"	"Condominio" 


## - Funcionalidades
### - Registro de Propiedad
Permite el registro de una propiedad el cual será gestionado por el micro servicio.

### - Listado de propiedades
Permite listar todas las propiedades con sus estados habilitado o inhabilitado

### - Detalle de propiedad
Permite ver el detalle de la propiedad

### - Registro Tipo propiedad
Permite registrar un tipo de propiedad

### - Listado de Tipo de propiedad
Permite listar los tipos de propiedades qué ofrece la aplicacion

### - Detalle de tipo de propiedad
Permite buscar un tipo de propiedad por ID

### - Los servicios expuestos:
### - Propiedades:
#### - Crear
curl --location --request POST 'http://localhost:8082/create-propiedad' \
--header 'Content-Type: application/json' \
--data-raw '{
  "id": "3fa85f64-5717-4562-b3fc-2c963f66afa6",
  "nombre": "Manzana 22",
  "estado": "INHABILITADO",
  "precio": 100
}'

Response:
<br>
Response:
<code>
{
    "id": "486fcb20-5f8a-4d45-bb4d-9325b183793f",
    "nombre": "Manzana 22",
    "estado": "INHABILITADO",
    "precio": 100.0
}
</code>
<br>
<br>

#### - Listar todas las propiedades
curl --location --request GET 'http://localhost:8082/propiedades'
Response:
<br>
Response:
<code>
[
    {
        "id": "28b08bab-eace-4cfe-843d-4b92ce5266d0",
        "nombre": "Hotel Copacabana",
        "estado": "INHABILITADO",
        "precio": 70.0
    },
    {
        "id": "6b96b577-7257-41b7-b971-f4f727675cea",
        "nombre": "Hotel Copacabana 2",
        "estado": "INHABILITADO",
        "precio": 70.0
    },
    {
        "id": "ae1b15a1-5de6-49c9-af7f-f0af68469804",
        "nombre": "Manzana 40",
        "estado": "INHABILITADO",
        "precio": 100.0
    },
    {
        "id": "cd6aa3eb-b720-4cf0-8977-e6508b2207a4",
        "nombre": "Manzana 20",
        "estado": "INHABILITADO",
        "precio": 100.0
    },
    {
        "id": "03548677-a85e-46a6-8fda-bde2caa7e4cb",
        "nombre": "Manzana 22",
        "estado": "INHABILITADO",
        "precio": 100.0
    },
    {
        "id": "8cbb9c6d-1d47-4e83-b1f6-385bc7f6a20f",
        "nombre": "Manzana 22",
        "estado": "INHABILITADO",
        "precio": 100.0
    },
    {
        "id": "9a4ed513-2ddb-41b7-9908-01139b7a465f",
        "nombre": "manzana 23",
        "estado": "INHABILITADO",
        "precio": 200.0
    },
    {
        "id": "70388673-048e-4a1e-a26f-fdb5348650fc",
        "nombre": "Manzana 22",
        "estado": "INHABILITADO",
        "precio": 100.0
    }
]
</code>
<br>
<br>
#### - Listar por ID
curl --location --request GET 'http://localhost:8082/propiedad/ba852751-0c37-4f7e-95af-8933b443c3f7'
Response:
<br>
Response:
<code>
[
    {
        "id": "ba852751-0c37-4f7e-95af-8933b443c3f7",
        "nombre": "manzana 23",
        "estado": "INHABILITADO",
        "precio": 200.0
    }
]
</code>
<br>
<br>
<br>


### - Tipos de propiedades:
#### - Crear
curl --location --request POST 'http://localhost:8082/create' \
--header 'Content-Type: application/json' \
--data-raw '{
  "id": "3fa85f64-5717-4562-b3fc-2c963f66afa6",
  "nombreTipo": "Copacabana 4"
}'

Response:
<br>
Response:
<code>
{
    "id": "3fa85f64-5717-4562-b3fc-2c963f66afa6",
    "nombreTipo": "Copacabana 4"
}
</code>
<br>
<br>

#### - Obtener por ID
curl --location --request GET 'http://localhost:8082/tipo/3fa85f64-5717-4562-b3fc-2c963f66afa6'
Response:
<br>
Response:
<code>
{
    "id": "3fa85f64-5717-4562-b3fc-2c963f66afa6",
    "nombreTipo": "Copacabana 4"
}
</code>
<br>
<br>

