class Worker 
{
    String name;
    double salaryRate;

    Worker(String name, double salaryRate) 
    {
        this.name = name;
        this.salaryRate = salaryRate;
    }

    double computePay(int hours) 
    {
        return hours * salaryRate;
    }
}

class DailyWorker extends Worker 
{
    DailyWorker(String name, double salaryRate) 
    {
        super(name, salaryRate);
    }

    
    double computePay(int hours) 
    {
        return super.computePay(hours); // Daily worker is paid based on the number of hours worked
    }
}

class SalariedWorker extends Worker 
{
    SalariedWorker(String name, double salaryRate) 
    {
        super(name, salaryRate);
    }

   
    double computePay(int hours) 
    {
        if (hours >= 40) 
        {
            // Salaried worker gets paid for 40 hours if working 40 hours or more
            return 40 * salaryRate;
        } else 
        {
            // Otherwise, salary will be calculated on an hourly basis
            return super.computePay(hours);
        }
    }
}

class TestWorkers 
{
    public static void main(String[] args) 
    {
        DailyWorker dailyWorker = new DailyWorker("John", 15.0);
        SalariedWorker salariedWorker = new SalariedWorker("Jane", 20.0);

        int hoursWorked1 = 45;
        int hoursWorked2 = 35;

        System.out.println("Weekly pay for " + dailyWorker.name + ": $" + dailyWorker.computePay(hoursWorked1));
        System.out.println("Weekly pay for " + salariedWorker.name + ": $" + salariedWorker.computePay(hoursWorked2));
    }
}
