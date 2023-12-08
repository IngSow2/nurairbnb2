module.exports = {
  '**/*.java': (filenames) => {
    return [`./gradlew :CheckInApi:spotlessApply -Pfiles=${filenames.join(',')}`];
  },
};