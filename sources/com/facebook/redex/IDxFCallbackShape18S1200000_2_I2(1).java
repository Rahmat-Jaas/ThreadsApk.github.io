package com.facebook.redex;

import X.AnonymousClass006;
import X.AnonymousClass00U;
import X.AnonymousClass01V;
import X.AnonymousClass5E2;
import X.AnonymousClass5E3;
import X.AnonymousClass5xH;
import X.AnonymousClass5z0;
import X.AnonymousClass66K;
import X.AnonymousClass6CW;
import X.AnonymousClass7H6;
import X.AnonymousClass7pX;
import X.AnonymousClass7pY;
import X.AnonymousClass7pZ;
import X.C04220Ms;
import X.C104406bj;
import X.C10450iM;
import X.C112376pT;
import X.C121107Ed;
import X.C125497dM;
import X.C130667qT;
import X.C135597zk;
import X.C1364582u;
import X.C1364682v;
import X.C1366783w;
import X.C1375789c;
import X.C1375889d;
import X.C1376089f;
import X.C143338gY;
import X.C18180wK;
import X.C18210wN;
import X.C18250wR;
import X.C28161tl;
import X.C28174Ezk;
import X.C30321G8s;
import X.C31382Gnx;
import X.C33492Fx;
import X.C61323St;
import X.C685344e;
import X.C83334rD;
import X.C86104wH;
import X.C86204wf;
import X.C97466Bl;
import X.GEZ;
import android.content.SharedPreferences;
import android.view.View;
import com.facebook.android.instantexperiences.autofill.model.BrowserExtensionsAutofillData;
import com.facebook.android.instantexperiences.jscall.InstantExperiencesJSBridgeCall;
import com.facebook.cameracore.ardelivery.scripting.ScriptingPackageMetadata;
import com.facebook.cameracore.ardelivery.xplat.async.XplatAsyncMetadataCompletionCallback;
import com.facebook.cameracore.ardelivery.xplat.scripting.XplatScriptingMetadataCompletionCallback;
import com.facebook.graphql.impls.AREffectBlockFragmentImpl;
import com.facebook.graphql.impls.FetchBlockV5MetadataQueryResponseImpl;
import com.facebook.graphql.impls.ScriptingPackagesLatestVersionQueryResponseImpl;
import com.facebook.pando.TreeJNI;
import com.facebook.privacy.consent.bloks.instagram.InstagramConsentFlowHostActivity;
import com.facebook.proxygen.TraceFieldType;
import com.google.common.collect.ImmutableList;
import com.instagram.barcelona.R;
import com.instagram.business.instantexperiences.IGInstantExperiencesParameters;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class IDxFCallbackShape18S1200000_2_I2 implements C83334rD {
    public Object A00;
    public Object A01;
    public String A02;
    public final int A03;

    public IDxFCallbackShape18S1200000_2_I2(Object obj, Object obj2, String str, int i) {
        this.A03 = i;
        this.A00 = obj2;
        this.A01 = obj;
        this.A02 = str;
    }

    public final void onFailure(Throwable th) {
        String str;
        switch (this.A03) {
            case 0:
                C112376pT r1 = new C112376pT();
                r1.A00 = AnonymousClass006.A08;
                r1.A02 = th;
                AnonymousClass6CW A002 = r1.A00();
                XplatAsyncMetadataCompletionCallback xplatAsyncMetadataCompletionCallback = ((GEZ) this.A01).A00;
                String message = A002.getMessage();
                if (message == null) {
                    message = "Failed to retrieve blockv5 metadata";
                }
                xplatAsyncMetadataCompletionCallback.onFailure(message);
                return;
            case 1:
                C04220Ms.A0B(th, 0);
                C112376pT r12 = new C112376pT();
                r12.A00 = AnonymousClass006.A1L;
                r12.A02 = th;
                AnonymousClass6CW A003 = r12.A00();
                XplatScriptingMetadataCompletionCallback xplatScriptingMetadataCompletionCallback = ((C104406bj) this.A00).A00;
                String message2 = A003.getMessage();
                if (message2 == null) {
                    message2 = "Failed to fetch scripting metadata";
                }
                xplatScriptingMetadataCompletionCallback.onFailure(message2);
                return;
            case 2:
                C04220Ms.A0B(th, 0);
                InstagramConsentFlowHostActivity instagramConsentFlowHostActivity = (InstagramConsentFlowHostActivity) this.A01;
                C86204wf r0 = instagramConsentFlowHostActivity.A00;
                if (r0 == null) {
                    str = "loadingDialog";
                } else {
                    r0.dismiss();
                    C10450iM.A07("ConsentUIFramework-Alaska", new C97466Bl("Error in InstagramConsentFlowHostActivity.launchBloksAction()", th));
                    AnonymousClass01V r2 = instagramConsentFlowHostActivity.A01;
                    if (r2 == null) {
                        str = "quickPerformanceLogger";
                    } else {
                        r2.markerEnd(192756491, 3);
                        C121107Ed.A00.A03(this.A02);
                        return;
                    }
                }
                C04220Ms.A0E(str);
                throw null;
            default:
                return;
        }
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        AnonymousClass7H6 r2;
        InstantExperiencesJSBridgeCall instantExperiencesJSBridgeCall;
        Map map;
        String str;
        TreeJNI A032;
        TreeJNI treeValue;
        IllegalStateException illegalStateException;
        switch (this.A03) {
            case 0:
                C143338gY r15 = (C143338gY) obj;
                try {
                    C31382Gnx gnx = (C31382Gnx) this.A00;
                    String str2 = this.A02;
                    Object obj2 = ((AnonymousClass5z0) r15).A01;
                    if (obj2 != null) {
                        TreeJNI treeJNI = (TreeJNI) obj2;
                        Class<FetchBlockV5MetadataQueryResponseImpl.ArBlockMetadata> cls = FetchBlockV5MetadataQueryResponseImpl.ArBlockMetadata.class;
                        if (treeJNI.getTreeValue("ar_block_metadata(block_ids:$block_ids,device_capabilities:$device_capabilities,effect_id:$effect_id,supported_compression_types:$supported_compression_types,supported_texture_formats:$supported_texture_formats)", cls) != null) {
                            ImmutableList.Builder builder = ImmutableList.builder();
                            C1366783w A0G = C18250wR.A0G(treeJNI.getTreeValue("ar_block_metadata(block_ids:$block_ids,device_capabilities:$device_capabilities,effect_id:$effect_id,supported_compression_types:$supported_compression_types,supported_texture_formats:$supported_texture_formats)", cls), FetchBlockV5MetadataQueryResponseImpl.ArBlockMetadata.Blocks.class, "blocks");
                            while (A0G.hasNext()) {
                                TreeJNI A0G2 = C18210wN.A0G(A0G);
                                if (A0G2.getStringValue("block_id") != null) {
                                    Class<FetchBlockV5MetadataQueryResponseImpl.ArBlockMetadata.Blocks.BestInstance> cls2 = FetchBlockV5MetadataQueryResponseImpl.ArBlockMetadata.Blocks.BestInstance.class;
                                    if (A0G2.getTreeValue("best_instance", cls2) != null) {
                                        TreeJNI reinterpret = A0G2.getTreeValue("best_instance", cls2).reinterpret(AREffectBlockFragmentImpl.class);
                                        if (reinterpret.getStringValue("strong_id__") != null) {
                                            Class<AREffectBlockFragmentImpl.PackagedFile> cls3 = AREffectBlockFragmentImpl.PackagedFile.class;
                                            String A002 = C28174Ezk.A00(241);
                                            if (reinterpret.getTreeValue(A002, cls3) != null) {
                                                TreeJNI treeValue2 = reinterpret.getTreeValue(A002, cls3);
                                                if (treeValue2.getStringValue("cache_key") != null) {
                                                    AnonymousClass66K r10 = AnonymousClass66K.UNSET_OR_UNRECOGNIZED_ENUM_VALUE;
                                                    if (!(C86104wH.A0a(treeValue2, r10, TraceFieldType.CompressionType) == null || treeValue2.getStringValue("uri") == null)) {
                                                        String stringValue = A0G2.getStringValue("block_id");
                                                        reinterpret.getStringValue("strong_id__");
                                                        String stringValue2 = treeValue2.getStringValue("cache_key");
                                                        String stringValue3 = treeValue2.getStringValue("uri");
                                                        String name = ((AnonymousClass66K) C86104wH.A0a(treeValue2, r10, TraceFieldType.CompressionType)).name();
                                                        treeValue2.getStringValue("md5_hash");
                                                        treeValue2.getIntValue("filesize_bytes");
                                                        builder.add((Object) new C30321G8s(stringValue, stringValue2, stringValue3, name));
                                                    }
                                                }
                                                illegalStateException = C18180wK.A0a(AnonymousClass00U.A0L("bestInstance asset fragment is missing critical data. instance id:", reinterpret.getStringValue("strong_id__")));
                                                throw illegalStateException;
                                            }
                                        }
                                        illegalStateException = C18180wK.A0a(AnonymousClass00U.A0L("bestInstance fragment is missing critical data. block id:", A0G2.getStringValue("block_id")));
                                        throw illegalStateException;
                                    }
                                }
                                illegalStateException = C18180wK.A0a(AnonymousClass00U.A0L("block id/metadata is null. requested id:", str2));
                                throw illegalStateException;
                            }
                            ImmutableList build = builder.build();
                            if (!build.isEmpty()) {
                                gnx.A03.put(str2, build.get(0));
                                ((GEZ) this.A01).A00((C30321G8s) build.get(0));
                                return;
                            }
                            onFailure(C18180wK.A0a("server responds with empty blockv5 metadata"));
                            return;
                        }
                    }
                    illegalStateException = C18180wK.A0a(C28174Ezk.A00(749));
                    throw illegalStateException;
                } catch (IllegalStateException e) {
                    onFailure(e);
                    return;
                }
            case 1:
                C143338gY r152 = (C143338gY) obj;
                if (r152 == null || (A032 = C685344e.A03(r152)) == null || (treeValue = A032.getTreeValue("ar_scripting_modules_package_download(package_hash:$package_hash)", ScriptingPackagesLatestVersionQueryResponseImpl.ArScriptingModulesPackageDownload.class)) == null) {
                    onFailure(C18180wK.A0a("Graphql result is null."));
                    return;
                }
                String str3 = this.A02;
                C125497dM r4 = (C125497dM) this.A01;
                C104406bj r3 = (C104406bj) this.A00;
                String stringValue4 = treeValue.getStringValue("cdn_uri");
                if (stringValue4 != null) {
                    ScriptingPackageMetadata scriptingPackageMetadata = new ScriptingPackageMetadata(str3, treeValue.getIntValue("revision"), stringValue4);
                    r4.A01.put(str3, scriptingPackageMetadata);
                    r3.A00.onSuccess(scriptingPackageMetadata);
                    return;
                }
                onFailure(C18180wK.A0a("Graphql result CdnUri is null."));
                return;
            case 2:
                C61323St r153 = (C61323St) obj;
                InstagramConsentFlowHostActivity instagramConsentFlowHostActivity = (InstagramConsentFlowHostActivity) this.A01;
                C86204wf r0 = instagramConsentFlowHostActivity.A00;
                if (r0 == null) {
                    str = "loadingDialog";
                } else {
                    r0.dismiss();
                    if (r153 != null) {
                        C33492Fx.A00((C130667qT) this.A00, r153);
                    }
                    AnonymousClass01V r22 = instagramConsentFlowHostActivity.A01;
                    if (r22 == null) {
                        str = "quickPerformanceLogger";
                    } else {
                        r22.markerEnd(192756491, 2);
                        return;
                    }
                }
                C04220Ms.A0E(str);
                throw null;
            case 3:
                List list = (List) obj;
                if (list == null || list.isEmpty()) {
                    AnonymousClass5E2 r23 = (AnonymousClass5E2) this.A00;
                    r23.A01.A01.A02.A00(false);
                    r2 = AnonymousClass7H6.A01(r23.A02);
                    instantExperiencesJSBridgeCall = (InstantExperiencesJSBridgeCall) this.A01;
                    map = new C1375789c(this);
                    break;
                } else {
                    AnonymousClass5E2 r42 = (AnonymousClass5E2) this.A00;
                    AnonymousClass7H6 A012 = AnonymousClass7H6.A01(r42.A02);
                    InstantExperiencesJSBridgeCall instantExperiencesJSBridgeCall2 = (InstantExperiencesJSBridgeCall) this.A01;
                    A012.A04(instantExperiencesJSBridgeCall2, new C1375889d(this));
                    boolean z = false;
                    Iterator it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((BrowserExtensionsAutofillData) it.next()).ASM().containsKey(instantExperiencesJSBridgeCall2.A00("selectedAutoCompleteTag"))) {
                                z = true;
                            }
                        }
                    }
                    AnonymousClass5xH r5 = r42.A01;
                    AnonymousClass7pX r43 = new AnonymousClass7pX(this);
                    View findViewById = r5.requireView().findViewById(R.id.instant_experiences_autofill_bar);
                    AnonymousClass7pY r24 = r5.A01;
                    r24.A01.post(new C1364582u(findViewById, r24, r43, list));
                    if (z && !r5.A04) {
                        SharedPreferences A04 = C28161tl.A04(r5.A03);
                        if (A04.getInt("ix_autofill_tooltip", 0) < 3) {
                            A04.edit().putInt("ix_autofill_tooltip", A04.getInt("ix_autofill_tooltip", 0) + 1).apply();
                            r5.requireView().postDelayed(new C135597zk(r5), 1000);
                            return;
                        }
                        return;
                    }
                    return;
                }
                break;
            case 4:
                List list2 = (List) obj;
                if (list2 == null || list2.isEmpty()) {
                    r2 = AnonymousClass7H6.A01(((AnonymousClass5E3) this.A00).A02);
                    instantExperiencesJSBridgeCall = (InstantExperiencesJSBridgeCall) this.A01;
                    map = new C1376089f(this);
                    break;
                } else {
                    AnonymousClass5xH r02 = ((AnonymousClass5E3) this.A00).A01;
                    AnonymousClass7pZ r44 = r02.A02;
                    IGInstantExperiencesParameters iGInstantExperiencesParameters = r02.A00;
                    r44.A04.execute(new C1364682v(r02.mView, iGInstantExperiencesParameters, r44, list2));
                    return;
                }
                break;
            default:
                return;
        }
        r2.A04(instantExperiencesJSBridgeCall, map);
    }
}
