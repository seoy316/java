package shinsegaeTrainning.interfaceseperate.before;


public class UnhappyBank implements PersonFinanceService, EnterpriseFinanceService, PrivateBankingService {
    @Override
    public void doPersonalFinance() {
        System.out.println(this.msg(this.getClass().getSimpleName(), Duty.PERSONAL_FINANCE));
    }

    @Override
    public void doEnterpriseFinance() {
        System.out.println(this.msg(this.getClass().getSimpleName(), Duty.ENTERPRISE_FINANCE));
    }

    @Override
    public void doPrivateBanking() {
        System.out.println(this.msg(this.getClass().getSimpleName(), Duty.PB));
    }
}