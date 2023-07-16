package X;

import com.facebook.cameracore.ardelivery.model.VersionedCapability;
import com.facebook.cameracore.ardelivery.xplat.modelmanager.versionfetcher.RemoteModelVersionFetcher;
import com.facebook.cameracore.ardelivery.xplat.modelmanager.versionfetcher.XplatRemoteModelVersionFetchCompletionCallback;
import com.facebook.redex.IDxFCallbackShape35S0400000_2_I2;
import com.google.common.collect.ImmutableList;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.7dO  reason: invalid class name and case insensitive filesystem */
public final class C125517dO implements RemoteModelVersionFetcher {
    public final C143258gN A00;
    public final C107066g5 A01;
    public final C83304rA A02;

    public C125517dO(C143258gN r1, C107066g5 r2, C83304rA r3) {
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void fetchServerPreferredVersions(List list, XplatRemoteModelVersionFetchCompletionCallback xplatRemoteModelVersionFetchCompletionCallback) {
        ArrayList A0v = AnonymousClass0wJ.A0v();
        List list2 = list;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A0v.add(((VersionedCapability) it.next()).toServerValue());
        }
        try {
            C126327ey r3 = (C126327ey) C86104wH.A0p("create", C116606xF.class);
            ImmutableList copyOf = ImmutableList.copyOf((Collection) A0v);
            r3.A00.A06("models", copyOf);
            r3.A02 = AnonymousClass0wJ.A1W(copyOf);
            this.A02.AMA(r3.build(), new IDxFCallbackShape35S0400000_2_I2(1, this, xplatRemoteModelVersionFetchCompletionCallback, list2, A0v));
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            throw C86114wI.A0k(e);
        }
    }
}
