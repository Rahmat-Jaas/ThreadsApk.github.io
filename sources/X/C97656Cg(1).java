package X;

/* renamed from: X.6Cg  reason: invalid class name and case insensitive filesystem */
public final class C97656Cg extends IllegalStateException {
    public C97656Cg(Throwable th) {
        super(AnonymousClass0wJ.A0t("The exception could not be delivered to the consumer because it has already canceled/disposed the flow or the exception has nowhere to go to begin with. Further reading: https://github.com/ReactiveX/RxJava/wiki/What's-different-in-2.0#error-handling | ", th), th);
    }
}
