package X;

/* renamed from: X.31Z  reason: invalid class name */
public final class AnonymousClass31Z {
    public static final C134697yC A00;

    static {
        StringBuilder A0s = C18190wL.A0s("(");
        A0s.append("(\\p{Digit}+)");
        A0s.append("(\\.)?(");
        A0s.append("(\\p{Digit}+)");
        A0s.append("?)(");
        A0s.append("[eE][+-]?(\\p{Digit}+)");
        A0s.append(")?)|(\\.(");
        A0s.append("(\\p{Digit}+)");
        A0s.append(")(");
        A0s.append("[eE][+-]?(\\p{Digit}+)");
        A0s.append(")?)|((");
        A0s.append("(0[xX](\\p{XDigit}+)(\\.)?)|(0[xX](\\p{XDigit}+)?(\\.)(\\p{XDigit}+))");
        A0s.append(")[pP][+-]?");
        A0s.append("(\\p{Digit}+)");
        A00 = C18250wR.A0h(AnonymousClass00U.A0V("[\\x00-\\x20]*[+-]?(NaN|Infinity|((", AnonymousClass0wJ.A0u(A0s), ")[fFdD]?))[\\x00-\\x20]*"));
    }
}
