package shinsegaeTrainning.interfaceseperate.refactor;


public class HappyBank implements PersonFinanceService, EnterpriseFinanceService {
    @Override
    public void doPersonalFinance() {
        System.out.println(this.messageSend(this.getClass().getSimpleName(), Duty.PERSONAL_FINANCE));
    }

    @Override
    public void doEnterpriseFinance() {
        System.out.println(this.messageSend(this.getClass().getSimpleName(), Duty.ENTERPRISE_FINANCE));
    }
}