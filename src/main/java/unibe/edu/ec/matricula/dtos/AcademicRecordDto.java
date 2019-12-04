package unibe.edu.ec.matricula.dtos;

import unibe.edu.ec.matricula.entities.AcademicRecord;
import unibe.edu.ec.matricula.entities.Subject;

public class AcademicRecordDto {
    private int id;

    private double note;

    private StudentsDto studentsDto;

    private SubjectDto subjectDto;

    public AcademicRecordDto() {

    }

    public AcademicRecordDto(int id, double note, StudentsDto studentsDto, SubjectDto subjectDto) {
        this.id = id;
        this.note = note;
        this.studentsDto = studentsDto;
        this.subjectDto = subjectDto;
    }

    public AcademicRecordDto(AcademicRecord academicRecord) {
        this.id = academicRecord.getId();
        this.note = academicRecord.getNote();
        this.studentsDto = new StudentsDto(academicRecord.getStudent());
        this.subjectDto = new SubjectDto(academicRecord.getSubject());
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getNote() {
        return note;
    }

    public void setNote(double note) {
        this.note = note;
    }

    public StudentsDto getStudentsDto() {
        return studentsDto;
    }

    public void setStudentsDto(StudentsDto studentsDto) {
        this.studentsDto = studentsDto;
    }

    public SubjectDto getSubjectDto() {
        return subjectDto;
    }

    public void setSubjectDto(SubjectDto subjectDto) {
        this.subjectDto = subjectDto;
    }

    @Override
    public String toString() {
        return "AcademicRecordDto{" +
                "id=" + id +
                ", note=" + note +
                ", studentsDto=" + studentsDto +
                ", subjectDto=" + subjectDto +
                '}';
    }
}
