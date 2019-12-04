package unibe.edu.ec.matricula.dtos;

import unibe.edu.ec.matricula.entities.Parallel;
import unibe.edu.ec.matricula.entities.Student;

import java.util.List;

public class ParallelDto {
    private int id;

    private String name;

    private SubjectDto subjectDto;

    private List<StudentsDto> studentsDtos;

    public ParallelDto() {

    }

    public ParallelDto(int id, String name, SubjectDto subjectDto, List<StudentsDto> studentsDtos) {
        this.id = id;
        this.name = name;
        this.subjectDto = subjectDto;
        this.studentsDtos = studentsDtos;
    }

    public ParallelDto(Parallel parallel) {
        this.id = parallel.getId();
        this.name = parallel.getName();
        this.subjectDto = new SubjectDto(parallel.getSubject());
        for (Student student :
                parallel.getStudents()) {
            StudentsDto studentsDto = new StudentsDto(student);
            this.studentsDtos.add(studentsDto);
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SubjectDto getSubjectDto() {
        return subjectDto;
    }

    public void setSubjectDto(SubjectDto subjectDto) {
        this.subjectDto = subjectDto;
    }

    public List<StudentsDto> getStudentsDtos() {
        return studentsDtos;
    }

    public void setStudentsDtos(List<StudentsDto> studentsDtos) {
        this.studentsDtos = studentsDtos;
    }

    @Override
    public String toString() {
        return "ParallelDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", subjectDto=" + subjectDto +
                ", studentsDtos=" + studentsDtos +
                '}';
    }
}
