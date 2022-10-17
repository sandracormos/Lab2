public class Student {

    private Integer Note;

    public Integer getNote() {
        return Note;
    }

    public void setNote(Integer note) throws Exception {
        if (note < 0 && note>100){
            throw new Exception("Nota nu incape in parametri");
        }
        Note = note;
    }
}
