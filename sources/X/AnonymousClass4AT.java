package X;

import java.util.Map;

/* renamed from: X.4AT  reason: invalid class name */
public final class AnonymousClass4AT implements C39549KvX {
    public int A00 = 1;
    public String A01;
    public String A02;
    public final Map A03 = AnonymousClass0wJ.A0y();

    public final int A00(BKH bkh) {
        String str = bkh.A0V;
        Map map = this.A03;
        if (map.containsKey(str)) {
            return AnonymousClass0wJ.A04(map.get(str));
        }
        StringBuilder A0s = C18190wL.A0s("could not find displayed index of (");
        A0s.append(str);
        A0s.append(") does not match known reels (");
        A0s.append(map.keySet());
        A0s.append(") which has values of ( ");
        A0s.append(map.values());
        C10450iM.A03("displayed_reel_index_mismatch", C18180wK.A0i(")", A0s));
        return -1;
    }

    public final void AKq(C37284Jnx jnx, C2R c2r) {
        String str;
        String str2 = ((BKH) jnx.A02).A0V;
        Integer BLJ = c2r.BLJ(jnx);
        if (BLJ == AnonymousClass006.A00 && (!AnonymousClass0hA.A0D(this.A01, str2) || AnonymousClass0hA.A0D(jnx.A04, this.A02))) {
            Map map = this.A03;
            int i = this.A00;
            this.A00 = i + 1;
            map.put(str2, Integer.valueOf(i));
            this.A01 = str2;
            str = "";
        } else if (BLJ == AnonymousClass006.A0C) {
            str = jnx.A04;
        } else {
            return;
        }
        this.A02 = str;
    }
}
