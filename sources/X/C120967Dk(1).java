package X;

import com.facebook.graphql.impls.FBPayAuthTicketFragmentImpl;
import com.facebook.pando.TreeJNI;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: X.7Dk  reason: invalid class name and case insensitive filesystem */
public final class C120967Dk {
    public final long A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final Map A08;

    public C120967Dk(String str, String str2, String str3, String str4, String str5, String str6, String str7, Map map, int i, long j) {
        this.A06 = str;
        this.A03 = str2;
        this.A04 = str3;
        this.A05 = str4;
        this.A08 = map;
        this.A01 = str5;
        this.A07 = str6;
        this.A02 = str7;
        this.A00 = (j + TimeUnit.SECONDS.toMillis((long) i)) - 10000;
    }

    public static C120967Dk A00(FBPayAuthTicketFragmentImpl fBPayAuthTicketFragmentImpl, String str, String str2, long j) {
        HashMap A0y = AnonymousClass0wJ.A0y();
        C1366783w A0G = C18250wR.A0G(fBPayAuthTicketFragmentImpl, FBPayAuthTicketFragmentImpl.AuthTicketCapabilities.class, "auth_ticket_capabilities");
        while (true) {
            long j2 = j;
            if (A0G.hasNext()) {
                TreeJNI A0G2 = C18210wN.A0G(A0G);
                String stringValue = A0G2.getStringValue("cap_name");
                stringValue.getClass();
                A0y.put(stringValue, new C104976cg(A0G2.getIntValue("ttl"), j2));
            } else {
                String A0m = C18220wO.A0m(fBPayAuthTicketFragmentImpl);
                A0m.getClass();
                AnonymousClass66N r0 = (AnonymousClass66N) C86104wH.A0a(fBPayAuthTicketFragmentImpl, AnonymousClass66N.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, "auth_ticket_type");
                r0.getClass();
                String name = r0.name();
                AnonymousClass66M r02 = (AnonymousClass66M) C86104wH.A0a(fBPayAuthTicketFragmentImpl, AnonymousClass66M.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, "auth_ticket_status");
                r02.getClass();
                String name2 = r02.name();
                String stringValue2 = fBPayAuthTicketFragmentImpl.getStringValue("fingerprint");
                stringValue2.getClass();
                return new C120967Dk(A0m, name, name2, stringValue2, str, str2, fBPayAuthTicketFragmentImpl.getStringValue("associated_credential_id"), A0y, fBPayAuthTicketFragmentImpl.getIntValue("ttl"), j2);
            }
        }
    }

    public static C120967Dk A01(String str, String str2, String str3, String str4, List list) {
        HashMap A0y = AnonymousClass0wJ.A0y();
        for (Object put : list) {
            A0y.put(put, new C104976cg(Integer.MAX_VALUE, System.currentTimeMillis()));
        }
        return new C120967Dk("", str, "LOCAL", str2, str4, str3, (String) null, A0y, Integer.MAX_VALUE, System.currentTimeMillis());
    }
}
