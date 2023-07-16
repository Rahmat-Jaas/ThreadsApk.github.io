package com.facebook.cameracore.ardelivery.xplat.scripting;

import X.AnonymousClass0wJ;
import X.AnonymousClass7f2;
import X.C04220Ms;
import X.C104406bj;
import X.C116716xQ;
import X.C125497dM;
import X.C142008de;
import X.C146418mD;
import X.C86104wH;
import X.C86114wI;
import com.facebook.cameracore.ardelivery.scripting.ScriptingPackageMetadata;
import com.facebook.redex.IDxFCallbackShape18S1200000_2_I2;
import java.lang.reflect.InvocationTargetException;

public final class XplatScriptingMetadataFetcher {
    public C142008de metadataDownloader;

    public XplatScriptingMetadataFetcher(C142008de r2) {
        C04220Ms.A0B(r2, 1);
        this.metadataDownloader = r2;
    }

    public final void setMetadataDownloader(C142008de r2) {
        C04220Ms.A0B(r2, 0);
        this.metadataDownloader = r2;
    }

    public final C142008de getMetadataDownloader() {
        return this.metadataDownloader;
    }

    public final void fetchMetadata(String str, XplatScriptingMetadataCompletionCallback xplatScriptingMetadataCompletionCallback) {
        boolean A1Z = AnonymousClass0wJ.A1Z(str, xplatScriptingMetadataCompletionCallback);
        C142008de r3 = this.metadataDownloader;
        C104406bj r4 = new C104406bj(xplatScriptingMetadataCompletionCallback);
        C125497dM r32 = (C125497dM) r3;
        synchronized (r32) {
            ScriptingPackageMetadata scriptingPackageMetadata = (ScriptingPackageMetadata) r32.A01.get(str);
            if (scriptingPackageMetadata != null) {
                r4.A00.onSuccess(scriptingPackageMetadata);
            }
            try {
                AnonymousClass7f2 r2 = (AnonymousClass7f2) C86104wH.A0p("create", C116716xQ.class);
                r2.A00.A05("package_hash", str);
                r2.A02 = A1Z;
                C146418mD build = r2.build();
                C04220Ms.A06(build);
                r32.A00.AMA(build, new IDxFCallbackShape18S1200000_2_I2(r32, r4, str, A1Z ? 1 : 0));
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                throw C86114wI.A0k(e);
            }
        }
    }
}
