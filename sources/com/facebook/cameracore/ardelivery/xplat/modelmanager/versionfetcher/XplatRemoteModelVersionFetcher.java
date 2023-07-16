package com.facebook.cameracore.ardelivery.xplat.modelmanager.versionfetcher;

import X.AnonymousClass006;
import X.AnonymousClass00U;
import X.AnonymousClass0IB;
import X.AnonymousClass0wJ;
import X.AnonymousClass721;
import com.facebook.cameracore.ardelivery.model.VersionedCapability;
import java.util.ArrayList;
import java.util.List;

public final class XplatRemoteModelVersionFetcher {
    public final AnonymousClass0IB errorReporter;
    public final RemoteModelVersionFetcher modelVersionFetcher;

    public final void fetchServerPreferredVersions(List list, XplatRemoteModelVersionFetchCompletionCallback xplatRemoteModelVersionFetchCompletionCallback) {
        String str;
        AnonymousClass0wJ.A1N(list, xplatRemoteModelVersionFetchCompletionCallback);
        ArrayList A0v = AnonymousClass0wJ.A0v();
        for (Object A04 : list) {
            VersionedCapability fromXplatValue = VersionedCapability.fromXplatValue(AnonymousClass0wJ.A04(A04));
            if (fromXplatValue != null) {
                A0v.add(fromXplatValue);
            }
        }
        try {
            this.modelVersionFetcher.fetchServerPreferredVersions(A0v, xplatRemoteModelVersionFetchCompletionCallback);
        } catch (IllegalStateException e) {
            this.errorReporter.Ccz("ArDelivery", AnonymousClass006.A00, AnonymousClass00U.A0L("XplatRemoteModelVersionFetcher hits illegal state exception: ", AnonymousClass721.A00(e)));
            str = "XplatRemoteModelVersionFetcher hits illegal state exception";
            xplatRemoteModelVersionFetchCompletionCallback.onFailure(str);
        } catch (IllegalArgumentException e2) {
            this.errorReporter.Ccz("ArDelivery", AnonymousClass006.A00, AnonymousClass00U.A0L("XplatRemoteModelVersionFetcher hits illegal argument exception: ", AnonymousClass721.A00(e2)));
            str = "XplatRemoteModelVersionFetcher hits illegal argument exception";
            xplatRemoteModelVersionFetchCompletionCallback.onFailure(str);
        } catch (Exception e3) {
            this.errorReporter.Ccz("ArDelivery", AnonymousClass006.A00, AnonymousClass00U.A0L("XplatRemoteModelVersionFetcher hits exception: ", AnonymousClass721.A00(e3)));
            str = "XplatRemoteModelVersionFetcher hits exception";
            xplatRemoteModelVersionFetchCompletionCallback.onFailure(str);
        }
    }

    public XplatRemoteModelVersionFetcher(RemoteModelVersionFetcher remoteModelVersionFetcher, AnonymousClass0IB r2) {
        AnonymousClass0wJ.A1O(remoteModelVersionFetcher, r2);
        this.modelVersionFetcher = remoteModelVersionFetcher;
        this.errorReporter = r2;
    }
}
