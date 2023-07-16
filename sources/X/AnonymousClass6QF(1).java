package X;

import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: X.6QF  reason: invalid class name */
public final class AnonymousClass6QF {
    public static final String A00() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        C04220Ms.A06(stackTrace);
        C102556Vq.A00(r6, r6);
        Object[] copyOfRange = Arrays.copyOfRange(stackTrace, 3, r6);
        C04220Ms.A06(copyOfRange);
        ArrayList A0v = AnonymousClass0wJ.A0v();
        for (Object obj : copyOfRange) {
            String className = ((StackTraceElement) obj).getClassName();
            C04220Ms.A06(className);
            C18240wQ.A1N(obj, A0v, AnonymousClass8bP.A0j(className, "IgShowToastEvent", false) ? 1 : 0);
        }
        ArrayList A0v2 = AnonymousClass0wJ.A0v();
        for (Object next : A0v) {
            String className2 = ((StackTraceElement) next).getClassName();
            C04220Ms.A06(className2);
            C18240wQ.A1N(next, A0v2, AnonymousClass8bP.A0j(className2, C18170wI.A00(672), false) ? 1 : 0);
        }
        ArrayList A0v3 = AnonymousClass0wJ.A0v();
        for (Object next2 : A0v2) {
            String className3 = ((StackTraceElement) next2).getClassName();
            C04220Ms.A06(className3);
            C18240wQ.A1N(next2, A0v3, AnonymousClass8bP.A0j(className3, "IgShowSnackBarEvent", false) ? 1 : 0);
        }
        if (A0v3.isEmpty()) {
            return C28174Ezk.A00(810);
        }
        String className4 = ((StackTraceElement) A0v3.get(0)).getClassName();
        C04220Ms.A06(className4);
        String str = (String) AnonymousClass00J.A0E(C81074n3.A07(className4, ".", 0));
        ArrayList<StackTraceElement> A0v4 = AnonymousClass0wJ.A0v();
        for (StackTraceElement stackTraceElement : stackTrace) {
            String className5 = stackTraceElement.getClassName();
            C04220Ms.A06(className5);
            if (AnonymousClass8bP.A0j(className5, str, false)) {
                A0v4.add(stackTraceElement);
            }
        }
        ArrayList A0w = AnonymousClass0wJ.A0w(A0v4);
        for (StackTraceElement methodName : A0v4) {
            A0w.add(methodName.getMethodName());
        }
        return AnonymousClass00U.A0N(str, AnonymousClass00J.A0H("->", (CharSequence) null, (CharSequence) null, AnonymousClass00J.A0L(A0w), (AnonymousClass0YY) null, 62), ':');
    }
}
