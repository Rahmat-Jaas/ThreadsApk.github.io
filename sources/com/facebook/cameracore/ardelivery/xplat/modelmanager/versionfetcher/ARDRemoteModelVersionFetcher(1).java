package com.facebook.cameracore.ardelivery.xplat.modelmanager.versionfetcher;

import X.AnonymousClass0wJ;
import X.C116226wd;
import X.C126247eq;
import X.C143258gN;
import X.C83304rA;
import X.C86104wH;
import X.C86114wI;
import com.facebook.cameracore.ardelivery.model.VersionedCapability;
import com.facebook.redex.IDxFCallbackShape35S0400000_2_I2;
import com.google.common.collect.ImmutableList;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class ARDRemoteModelVersionFetcher implements RemoteModelVersionFetcher {
    public static final int REQUEST_CACHE_TTL_SECONDS = 3600;
    public static final String TAG = "ARDRemoteModelVersionFetcher";
    public final C143258gN mForceDownloadFlagHandler;
    public final C83304rA mGraphQLQueryExecutor;

    public ARDRemoteModelVersionFetcher(C83304rA r1, C143258gN r2) {
        this.mGraphQLQueryExecutor = r1;
        this.mForceDownloadFlagHandler = r2;
    }

    public void fetchServerPreferredVersions(List list, XplatRemoteModelVersionFetchCompletionCallback xplatRemoteModelVersionFetchCompletionCallback) {
        ArrayList A0v = AnonymousClass0wJ.A0v();
        List list2 = list;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A0v.add(((VersionedCapability) it.next()).toServerValue());
        }
        try {
            C126247eq r3 = (C126247eq) C86104wH.A0p("create", C116226wd.class);
            ImmutableList copyOf = ImmutableList.copyOf((Collection) A0v);
            r3.A00.A06("capability_types", copyOf);
            r3.A02 = AnonymousClass0wJ.A1W(copyOf);
            this.mGraphQLQueryExecutor.AMA(r3.build(), new IDxFCallbackShape35S0400000_2_I2(0, this, xplatRemoteModelVersionFetchCompletionCallback, list2, A0v));
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            throw C86114wI.A0k(e);
        }
    }
}
