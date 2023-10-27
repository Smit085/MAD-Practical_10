# MAD-Practical_10
JG.repeat (5, 10, {

id: JG.objectId(),

email() {

return (

__.snakeCase(this.profile.name) +

'@gnu.ac.in'

).toLowerCase();

},

phone(){

return '+91 +`${JG. integer(5, 9)}${36.integer(0, 9)}${36.integer(0, 9)}${36.integer(0, 9)}${36. integer(0, 9)}${36.integer(0, 9)}${36.integer(0, 9)}${36.integer(0, 9)}${JG.integer(0, 9)}${36.integer(0, 9)};

},

profile: {

name: ${36.firstName()} ${36.lastName()}`,

address: "${36.integer(1, 100)} ${36.street()}, ${36.city()},

${JG.state()},

location: {

lat: 36.floating(10, 30, 6), long: JG.floating(70, 90, 6),

Generated Link https://api.isone Cokidata

},

},

});
