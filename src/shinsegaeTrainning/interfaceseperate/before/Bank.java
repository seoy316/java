package shinsegaeTrainning.interfaceseperate.before;


public interface Bank {
    default String msg(String bankName, Duty duty) {
        return String.format("%s는 %s를 합니다.", bankName, duty.description());
    }
}
