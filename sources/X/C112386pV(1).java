package X;

import com.facebook.dcp.model.DcpContext;
import com.facebook.dcp.model.Example;
import com.facebook.dcp.model.ExampleContext;
import com.facebook.dcp.model.ServerFeaturesResponse;
import com.facebook.dcp.model.UseCaseMetadata;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.KtLambdaShape4S1210000_I2;

/* renamed from: X.6pV  reason: invalid class name and case insensitive filesystem */
public final class C112386pV {
    public final C121547Gq A00;
    public final AnonymousClass791 A01;
    public final AnonymousClass7DX A02;

    public final void A00(ServerFeaturesResponse serverFeaturesResponse, AnonymousClass68S r17, UseCaseMetadata useCaseMetadata, String str) {
        AnonymousClass68S r4 = r17;
        ServerFeaturesResponse serverFeaturesResponse2 = serverFeaturesResponse;
        AnonymousClass0wJ.A1Q(serverFeaturesResponse2, r4);
        List<Example> list = serverFeaturesResponse2.A00;
        DcpContext dcpContext = useCaseMetadata.A02;
        for (Example example : list) {
            ExampleContext exampleContext = example.A00;
            exampleContext.A03.putAll(dcpContext.A03);
            exampleContext.A02.putAll(dcpContext.A02);
            exampleContext.A04.putAll(dcpContext.A04);
        }
        C121547Gq r2 = this.A00;
        String str2 = str;
        r2.A02(r4, C86134wK.A0N("added_static_context", (String) null, 6, 1), str2);
        if (this.A02.A00.get(str2) != null) {
            HashMap A0y = AnonymousClass0wJ.A0y();
            AnonymousClass0ZV r6 = AnonymousClass0ZV.A00;
            Iterator it = r6.iterator();
            while (it.hasNext()) {
                String A0k = C18180wK.A0k(it);
                AnonymousClass791 r10 = this.A01;
                C04220Ms.A0B(A0k, 0);
                A0y.put(A0k, C98666Gl.A00(AnonymousClass68S.SIGNAL_STORE_EXTRACT, r10.A02, r6, "no_use_case", new KtLambdaShape4S1210000_I2(r10, (Object) null, A0k, 1, false)));
            }
            AnonymousClass00J.A0N(A0y.values());
            r2.A02(r4, C86134wK.A0N("extracted_local_context", AnonymousClass00U.A0J("count: ", C18180wK.A0n(ExampleContext.A05).size()), 4, 1), str2);
            r2.A02(r4, C86134wK.A0N("merged_local_context", (String) null, 6, 1), str2);
            return;
        }
        throw new C89435Ex(AnonymousClass00U.A0L("Cannot find context extractor for ", str2));
    }

    public C112386pV(C121547Gq r1, AnonymousClass791 r2, AnonymousClass7DX r3) {
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
    }
}
