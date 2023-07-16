package X;

/* renamed from: X.70C  reason: invalid class name */
public final class AnonymousClass70C {
    public static AnonymousClass7A1 A00(AnonymousClass601 r1) {
        AnonymousClass3HX r0;
        AnonymousClass7A1 r02 = r1.A01;
        if (r02 != null || ((r0 = r1.A00) != null && (r02 = AnonymousClass7K7.A01(r0).A03()) != null)) {
            return r02;
        }
        throw C18210wN.A0W("No tree resources available in the Scripting Environment. This is an infra error that you should post in the Bloks Q&A group about.");
    }

    public static C1194175f A01(AnonymousClass601 r1, String str) {
        C1194175f r0 = (C1194175f) A00(r1).A03.get(str);
        if (r0 != null) {
            return r0;
        }
        throw C18190wL.A0a(AnonymousClass00U.A0L(AnonymousClass00U.A0V("Payload for referenced embedded payload id ", str, " not found!"), "\n\nYou are running parseEmbedded without the parent Bloks Context needed to process the data manifests. If you are implementing a new feature, check to makesure you're not calling evaluateWithoutTreeDANGEROUSLY on your signature. Otherwise, this is an infra error that you should post in the Bloks Q&A group about."));
    }
}
