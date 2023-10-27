JG.repeat (5, 10, {
id: JG.objectId(),email() {
  return (

__.snakeCase(this.profile.name) +

'@gnu.ac.in'

).toLowerCase();

},
  phone(){
    return '+91' +`${JG. integer(5, 9)}${JG.integer(0, 9)}${JG.integer(0, 9)}${JG.integer(0, 9)}${JG. integer(0, 9)}${JG.integer(0, 9)}${JG.integer(0, 9)}${JG.integer(0, 9)}${JG.integer(0, 9)}${JG.integer(0, 9)}`;

},

profile: {

name: ${JG.firstName()} ${JG.lastName()}`,

address: `${JG.integer(1, 100)} ${JG.street()}, ${JG.city()},

${JG.state()},

location: {

lat: JG.floating(10, 30, 6), long: JG.floating(70, 90, 6),

Generated Link https://api.isone Cokidata

},

},

});
