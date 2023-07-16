package X;

/* renamed from: X.4GJ  reason: invalid class name */
public final class AnonymousClass4GJ implements C82884qQ {
    public final AnonymousClass3UU A00;
    public final Integer A01;

    public final boolean CW4(C58743Gz r4) {
        String str = (String) this.A00.A01.get("footer_label_upgrade_feature_type");
        if (str != null) {
            try {
                return Integer.valueOf(Integer.parseInt(str)).equals(this.A01);
            } catch (NumberFormatException e) {
                C10450iM.A03("InteropMessageFooterTypeFilter", C18230wP.A0t("Unable to parse feature type ", e));
            }
        }
        return false;
    }

    public AnonymousClass4GJ(AnonymousClass3UU r1, Integer num) {
        this.A00 = r1;
        this.A01 = num;
    }
}
