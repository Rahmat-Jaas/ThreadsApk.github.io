package com.facebook.redex;

import X.AnonymousClass0LU;
import X.AnonymousClass0wJ;
import X.AnonymousClass5z0;
import X.AnonymousClass68Y;
import X.C107066g5;
import X.C125517dO;
import X.C1366783w;
import X.C143338gY;
import X.C18200wM;
import X.C18210wN;
import X.C40302Lc8;
import X.C83334rD;
import X.C86104wH;
import X.C86144wL;
import android.content.SharedPreferences;
import ch.boye.httpclientandroidlib.cookie.ClientCookie;
import com.facebook.cameracore.ardelivery.model.VersionedCapability;
import com.facebook.cameracore.ardelivery.xplat.modelmanager.versionfetcher.ARDRemoteModelVersionFetcher;
import com.facebook.cameracore.ardelivery.xplat.modelmanager.versionfetcher.XplatModelVersionResponse;
import com.facebook.cameracore.ardelivery.xplat.modelmanager.versionfetcher.XplatRemoteModelVersionFetchCompletionCallback;
import com.facebook.graphql.impls.CapabilityLatestVersionQueryResponseImpl;
import com.facebook.graphql.impls.NMLMLCapabilityLatestAimVersionQueryResponseImpl;
import com.facebook.pando.TreeJNI;
import com.google.common.collect.ImmutableList;
import com.instagram.debug.devoptions.FXPFAccessLibraryDebugFragment;
import java.util.ArrayList;
import java.util.List;

public class IDxFCallbackShape35S0400000_2_I2 implements C83334rD {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;

    public IDxFCallbackShape35S0400000_2_I2(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        this.A04 = i;
        this.A00 = obj;
        this.A01 = obj2;
        this.A02 = obj3;
        this.A03 = obj4;
    }

    public final void onFailure(Throwable th) {
        String message;
        int i = this.A04;
        XplatRemoteModelVersionFetchCompletionCallback xplatRemoteModelVersionFetchCompletionCallback = (XplatRemoteModelVersionFetchCompletionCallback) this.A01;
        String message2 = th.getMessage();
        if (i != 0) {
            if (message2 == null) {
                message = "Failed to receive model version from nmlml";
            }
            message = th.getMessage();
        } else {
            if (message2 == null) {
                message = "";
            }
            message = th.getMessage();
        }
        xplatRemoteModelVersionFetchCompletionCallback.onFailure(message);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        String str;
        Object obj2;
        Object[] objArr;
        String str2;
        VersionedCapability fromServerValue;
        AnonymousClass68Y r3;
        C143338gY r12 = (C143338gY) obj;
        if (this.A04 != 0) {
            Object obj3 = ((AnonymousClass5z0) r12).A01;
            if (obj3 == null) {
                str = "graphql response is empty";
                AnonymousClass0LU.A0D("NMLMLRemoteModelVersionFetcher", str);
            } else {
                TreeJNI treeJNI = (TreeJNI) obj3;
                Class<NMLMLCapabilityLatestAimVersionQueryResponseImpl.AimModelVersionManifest> cls = NMLMLCapabilityLatestAimVersionQueryResponseImpl.AimModelVersionManifest.class;
                if (treeJNI.getTreeValue("aim_model_version_manifest(models:$models)", cls) == null) {
                    AnonymousClass0LU.A0D("NMLMLRemoteModelVersionFetcher", "Received Null model versions");
                    return;
                }
                ImmutableList treeList = treeJNI.getTreeValue("aim_model_version_manifest(models:$models)", cls).getTreeList("models", NMLMLCapabilityLatestAimVersionQueryResponseImpl.AimModelVersionManifest.Models.class);
                if (treeList.size() != C86144wL.A08(this.A02)) {
                    AnonymousClass0LU.A0P("NMLMLRemoteModelVersionFetcher", "# of models requested and received are different. requested %d . received %d", C18210wN.A1Y(Integer.valueOf(C86144wL.A08(this.A03)), treeList.size()));
                }
                arrayList = AnonymousClass0wJ.A0v();
                arrayList2 = AnonymousClass0wJ.A0v();
                arrayList3 = AnonymousClass0wJ.A0v();
                C1366783w it = treeList.iterator();
                while (it.hasNext()) {
                    TreeJNI A0G = C18210wN.A0G(it);
                    if (A0G.getStringValue(FXPFAccessLibraryDebugFragment.NAME) == null || (fromServerValue = VersionedCapability.fromServerValue(A0G.getStringValue(FXPFAccessLibraryDebugFragment.NAME))) == null) {
                        AnonymousClass0LU.A0P("NMLMLRemoteModelVersionFetcher", "Not able to convert to VersionedCapability. This should never happen. type: %s", A0G.getStringValue(FXPFAccessLibraryDebugFragment.NAME));
                    } else {
                        arrayList.add(fromServerValue);
                        C18200wM.A1U(arrayList3, A0G.getIntValue(ClientCookie.VERSION_ATTR));
                        C125517dO r2 = (C125517dO) this.A00;
                        arrayList2.add(Boolean.valueOf(r2.A00.ACg(fromServerValue, A0G.getStringValue("force_download_group_identifier"))));
                        C107066g5 r7 = r2.A01;
                        if (A0G.getBooleanValue("is_ard_version")) {
                            r3 = AnonymousClass68Y.ARD;
                        } else {
                            r3 = AnonymousClass68Y.NMLML;
                        }
                        SharedPreferences.Editor edit = r7.A00.edit();
                        edit.putString(fromServerValue.toServerValue(), r3.toString());
                        r7.A01.put(fromServerValue, r3);
                        edit.apply();
                    }
                }
                ((XplatRemoteModelVersionFetchCompletionCallback) this.A01).onSuccess(new XplatModelVersionResponse(arrayList2, arrayList, arrayList3));
                return;
            }
        } else if (r12 == null || (obj2 = ((AnonymousClass5z0) r12).A01) == null) {
            str = "graphql response is empty";
            AnonymousClass0LU.A0D(ARDRemoteModelVersionFetcher.TAG, str);
        } else {
            ImmutableList treeList2 = ((TreeJNI) obj2).getTreeList("latest_versioned_capabilities(capability_types:$capability_types,supported_compressions:$supported_compressions)", CapabilityLatestVersionQueryResponseImpl.LatestVersionedCapabilities.class);
            if (treeList2.size() != C86144wL.A08(this.A02)) {
                AnonymousClass0LU.A0P(ARDRemoteModelVersionFetcher.TAG, "# of models requested and received are different. requested %s. received %s", (List) this.A03, treeList2);
            }
            arrayList = AnonymousClass0wJ.A0v();
            arrayList2 = AnonymousClass0wJ.A0v();
            arrayList3 = AnonymousClass0wJ.A0v();
            C1366783w it2 = treeList2.iterator();
            while (it2.hasNext()) {
                TreeJNI A0G2 = C18210wN.A0G(it2);
                C40302Lc8 lc8 = C40302Lc8.A01;
                if (C86104wH.A0a(A0G2, lc8, "type") == null) {
                    objArr = new Object[]{A0G2};
                    str2 = "Capability type is null. This should never happen. data: %s";
                } else {
                    VersionedCapability fromServerValue2 = VersionedCapability.fromServerValue(((C40302Lc8) C86104wH.A0a(A0G2, lc8, "type")).name());
                    if (fromServerValue2 == null) {
                        objArr = new Object[]{C86104wH.A0a(A0G2, lc8, "type")};
                        str2 = "Not able to convert to VersionedCapability. This should never happen. type: %s";
                    } else {
                        arrayList.add(fromServerValue2);
                        C18200wM.A1U(arrayList3, A0G2.getIntValue(ClientCookie.VERSION_ATTR));
                        arrayList2.add(Boolean.valueOf(((ARDRemoteModelVersionFetcher) this.A00).mForceDownloadFlagHandler.ACg(fromServerValue2, A0G2.getStringValue("force_download_group_identifier"))));
                    }
                }
                AnonymousClass0LU.A0P(ARDRemoteModelVersionFetcher.TAG, str2, objArr);
            }
            ((XplatRemoteModelVersionFetchCompletionCallback) this.A01).onSuccess(new XplatModelVersionResponse(arrayList2, arrayList, arrayList3));
            return;
        }
        ((XplatRemoteModelVersionFetchCompletionCallback) this.A01).onFailure(str);
    }
}
