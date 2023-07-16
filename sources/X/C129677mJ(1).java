package X;

import com.google.android.gms.auth.blockstore.RetrieveBytesResponse;
import java.util.Collections;
import java.util.Map;

/* renamed from: X.7mJ  reason: invalid class name and case insensitive filesystem */
public final class C129677mJ implements C143878hS {
    public final /* synthetic */ C114936uA A00;
    public final /* synthetic */ AnonymousClass7II A01;
    public final /* synthetic */ Integer A02;
    public final /* synthetic */ String A03;

    public C129677mJ(C114936uA r1, AnonymousClass7II r2, Integer num, String str) {
        this.A00 = r1;
        this.A01 = r2;
        this.A03 = str;
        this.A02 = num;
    }

    public final void BrG(AnonymousClass7HU r7) {
        C107216gN r2;
        byte[] bArr;
        byte[] bArr2;
        C04220Ms.A0B(r7, 0);
        if (r7.A0C()) {
            C114936uA r3 = this.A00;
            Object A04 = r7.A04();
            C04220Ms.A06(A04);
            RetrieveBytesResponse retrieveBytesResponse = (RetrieveBytesResponse) A04;
            String str = this.A03;
            if (this.A02 == AnonymousClass006.A00) {
                Map map = retrieveBytesResponse.A00;
                RetrieveBytesResponse.BlockstoreData blockstoreData = (RetrieveBytesResponse.BlockstoreData) Collections.unmodifiableMap(map).get(str);
                if (blockstoreData == null || blockstoreData.A01 == null) {
                    RetrieveBytesResponse.BlockstoreData blockstoreData2 = (RetrieveBytesResponse.BlockstoreData) Collections.unmodifiableMap(map).get("com.google.android.gms.auth.blockstore.DEFAULT_BYTES_DATA_KEY");
                    if (blockstoreData2 == null || (bArr2 = blockstoreData2.A01) == null) {
                        bArr2 = AnonymousClass7II.A02;
                    }
                    C04220Ms.A09(bArr2);
                    r2 = new C107216gN(bArr2, true);
                    r3.A02(r2);
                    return;
                }
            }
            RetrieveBytesResponse.BlockstoreData blockstoreData3 = (RetrieveBytesResponse.BlockstoreData) Collections.unmodifiableMap(retrieveBytesResponse.A00).get(str);
            if (blockstoreData3 == null || (bArr = blockstoreData3.A01) == null) {
                bArr = AnonymousClass7II.A02;
            }
            C04220Ms.A09(bArr);
            r2 = new C107216gN(bArr, false);
            r3.A02(r2);
            return;
        }
        this.A00.A00();
    }
}
