package X;

import ch.boye.httpclientandroidlib.message.BasicHeaderValueParser;

/* renamed from: X.0jD  reason: invalid class name and case insensitive filesystem */
public final class C10940jD implements AnonymousClass0WE {
    public boolean A00 = true;
    public final /* synthetic */ AnonymousClass01V A01;
    public final /* synthetic */ StringBuilder A02;

    public C10940jD(AnonymousClass01V r2, StringBuilder sb) {
        this.A01 = r2;
        this.A02 = sb;
    }

    public final void DAa(AnonymousClass0WQ r9, AnonymousClass0Jz r10, String str, int i, long j, long j2) {
        if (!this.A00) {
            this.A02.append(BasicHeaderValueParser.ELEM_DELIMITER);
        } else {
            this.A00 = false;
        }
        StringBuilder sb = this.A02;
        sb.append("{\"name\":\"");
        sb.append(AnonymousClass01V.A08(str));
        sb.append('\"');
        sb.append(",\"value\":");
        sb.append(j);
        if (r9 != null) {
            sb.append(",\"data\":{");
            C10930jC r5 = new C10930jC(this);
            int i2 = 0;
            int i3 = 0;
            while (i2 < r9.A00) {
                String[] strArr = r9.A02;
                r5.DAn(strArr[i3], strArr[i3 + 1], r9.A01[i2]);
                i2++;
                i3 += 2;
            }
            sb.append("}");
        }
        sb.append("}");
    }
}
