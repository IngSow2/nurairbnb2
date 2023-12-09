module.exports = {
  '**/*.java': (filenames) => {
    return [`./gradlew :CheckInApi:spotlessApply -Pfiles=${filenames.join(',')}`,
    `./gradlew :CheckIn.Application:spotlessApply -Pfiles=${filenames.join(',')}`];
  },
};