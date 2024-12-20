class Human {
    private String firstName;    
    private String lastName;


public Human (String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
}

public String getFName() {
    return firstName;
}

public String getLName() {
    return lastName;
}
}

class Worker extends Human {
    private String jobTitle;

    public Worker (String firstName, String lastName, String jobTitle) {
        super(firstName, lastName);
        this.jobTitle = jobTitle;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public String getLName() {
        return super.getLName()+", "+jobTitle;
    }
}