// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.CertificateAuthenticationRequest
import aws.sdk.kotlin.services.ec2.model.ClientVpnAuthenticationRequest
import aws.sdk.kotlin.services.ec2.model.ClientVpnAuthenticationType
import aws.sdk.kotlin.services.ec2.model.DirectoryServiceAuthenticationRequest
import aws.sdk.kotlin.services.ec2.model.FederatedAuthenticationRequest
import aws.smithy.kotlin.runtime.serde.SdkFieldDescriptor
import aws.smithy.kotlin.runtime.serde.SdkObjectDescriptor
import aws.smithy.kotlin.runtime.serde.SerialKind
import aws.smithy.kotlin.runtime.serde.Serializer
import aws.smithy.kotlin.runtime.serde.asSdkSerializable
import aws.smithy.kotlin.runtime.serde.deserializeList
import aws.smithy.kotlin.runtime.serde.deserializeMap
import aws.smithy.kotlin.runtime.serde.deserializeStruct
import aws.smithy.kotlin.runtime.serde.field
import aws.smithy.kotlin.runtime.serde.formurl.FormUrlSerialName
import aws.smithy.kotlin.runtime.serde.serializeList
import aws.smithy.kotlin.runtime.serde.serializeMap
import aws.smithy.kotlin.runtime.serde.serializeStruct


internal fun serializeClientVpnAuthenticationRequestDocument(serializer: Serializer, input: ClientVpnAuthenticationRequest) {
    val ACTIVEDIRECTORY_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, FormUrlSerialName("ActiveDirectory"))
    val FEDERATEDAUTHENTICATION_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, FormUrlSerialName("FederatedAuthentication"))
    val MUTUALAUTHENTICATION_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, FormUrlSerialName("MutualAuthentication"))
    val TYPE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("Type"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(FormUrlSerialName("ClientVpnAuthenticationRequest"))
        field(ACTIVEDIRECTORY_DESCRIPTOR)
        field(FEDERATEDAUTHENTICATION_DESCRIPTOR)
        field(MUTUALAUTHENTICATION_DESCRIPTOR)
        field(TYPE_DESCRIPTOR)
    }

    serializer.serializeStruct(OBJ_DESCRIPTOR) {
        input.type?.let { field(TYPE_DESCRIPTOR, it.value) }
        input.activeDirectory?.let { field(ACTIVEDIRECTORY_DESCRIPTOR, it, ::serializeDirectoryServiceAuthenticationRequestDocument) }
        input.mutualAuthentication?.let { field(MUTUALAUTHENTICATION_DESCRIPTOR, it, ::serializeCertificateAuthenticationRequestDocument) }
        input.federatedAuthentication?.let { field(FEDERATEDAUTHENTICATION_DESCRIPTOR, it, ::serializeFederatedAuthenticationRequestDocument) }
    }
}
