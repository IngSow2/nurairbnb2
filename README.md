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

### Los servicios expuestos:

localhost:8087/api/order/COD1/MIERCOLES

`curl --location --request GET 'localhost:8087/api/order/COD1/MIERCOLES' \
--data-raw ''`
<br>
Response:
<code>
{
    "promocion": "Se aplico la promocion 2x1",
    "pizza": "Se preparó una pizza Margarita!"
}
</code>
<br>
<br>


localhost:8087/api/order/COD3/JUEVES

`curl --location --request GET 'localhost:8087/api/order/COD3/JUEVES' \
--data-raw ''`
<br>
<code>
{
    "promocion": "Se aplico la promocion Entrega gratis",
    "pizza": "Se preparó una pizza Personalizada!"
}
</code>
