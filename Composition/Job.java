class Job{
    String title;
    int salary;

    Job(String title,int salary){
        this.title=title;
        this.salary=salary;
    }

    public String toString(){
        String display="Job Title: "+this.title+"\nSalary: "+this.salary;
        return display;
    }
}