# L-nBeregner
Roden på Android projektet ligger her:
https://github.com/PalleV/L-nBeregner/tree/master/app/src/main/java/dk/appsome/lnberegner

Appen's funktionelle design bliver udviklet efter diverse Gang of Four og GRASP design patterns hvilket er grunden til undermapper.
Disse designprincipper gør det nemmere og hurtigere at opdatere, opgradere m.v. på appen.

tech mappen:
Alt data skabes, gemmes og hentes på dette niveau. 
Settings.java og Workday.java er objekter.
WorkdayDataStructure.java er specialisten i at få information ud fra databasen ang. Workday.
SQLHelper.java bliver broen mellem SQLite databasen og vores app.

Controller.java:
Det midterste parti. Samler data - det er her beregninger vil blive lavet.

HovedMenu.java:
Vores UI, som ikke er blevet ændret endnu. Men den repræsenterer de beregninger vi får fra Controlleren.

res mappen:
activity_hoved_menu.xml:
Svarer til HTML'ens CSS.
