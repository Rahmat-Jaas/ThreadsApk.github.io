package com.facebook.cameracore.ardelivery.xplat.modelmanager.versionfetcher;

import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C18200wM;
import com.facebook.cameracore.ardelivery.model.VersionedCapability;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class XplatModelVersionResponse {
    public final List forcedDownloadFlags;
    public final List jVersionedCapabilities;
    public final List versionedCapabilities;
    public final List versions;

    public final List getForcedDownloadFlags() {
        return this.forcedDownloadFlags;
    }

    public final List getVersionedCapabilities() {
        return this.versionedCapabilities;
    }

    public final List getVersions() {
        return this.versions;
    }

    public XplatModelVersionResponse(List list, List list2, List list3) {
        AnonymousClass0wJ.A1O(list, list2);
        C04220Ms.A0B(list3, 3);
        this.forcedDownloadFlags = list;
        this.jVersionedCapabilities = list2;
        this.versions = list3;
        ArrayList A0w = AnonymousClass0wJ.A0w(list2);
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            C18200wM.A1U(A0w, ((VersionedCapability) it.next()).getXplatValue());
        }
        this.versionedCapabilities = A0w;
    }
}
