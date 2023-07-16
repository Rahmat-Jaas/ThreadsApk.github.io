package X;

/* renamed from: X.6W8  reason: invalid class name */
public final class AnonymousClass6W8 {
    public static final void A00(String str, AnonymousClass0W7 r4) {
        String A0i;
        StringBuilder A0s = C18190wL.A0s("in the scope of '");
        A0s.append(AnonymousClass0N8.A00(((C02230Ai) r4).A00));
        String A0q = C86114wI.A0q(A0s, '\'');
        if (str == null) {
            A0i = C04220Ms.A01("Class discriminator was missing and no default polymorphic serializers were registered ", A0q);
        } else {
            StringBuilder A0s2 = C18190wL.A0s("Class '");
            A0s2.append(str);
            A0s2.append("' is not registered for polymorphic serialization ");
            A0s2.append(A0q);
            A0i = C18180wK.A0i(".\nMark the base class as 'sealed' or register the serializer explicitly.", A0s2);
        }
        throw new C97616Cb(A0i);
    }
}
