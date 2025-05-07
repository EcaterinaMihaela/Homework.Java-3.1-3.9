interface ShapeInterface
{
    public double area();
}
//sparge interfata ShapeInterface in doua:
//      -muta metoda volum in alta interfata pt ca
//          nu toate formele au volum

//ISP spune să nu obligi clasele să implementeze metode inutile.
// Descompune interfețele mari în unele mai mici, specializate.

//o clasa nu ar trebui sa fie obligata sa fol interfete pe care nu le foloseste
//mai multe interfet mici cu scopuri clare