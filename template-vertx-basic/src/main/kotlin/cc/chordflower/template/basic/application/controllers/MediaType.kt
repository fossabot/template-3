package cc.chordflower.template.basic.application.controllers

enum class MediaType(val description: String, val mediaType: String) {

  /**
   * Represents any media type.
   */
  ANY_ANY("Any mediatype", "*/*"),

  /**
   * Represents any application media type.
   */
  APPLICATION_ANY("Any application mediatype", "application/*"),

  /**
   * Represents any audio media type.
   */
  AUDIO_ANY("Any audio mediatype", "audio/*"),

  /**
   * Represents any font media type.
   */
  FONT_ANY("Any font mediatype", "font/*"),

  /**
   * Represents any example media type.
   */
  EXAMPLE_ANY("Any example mediatype", "example/*"),

  /**
   * Represents any image media type.
   */
  IMAGE_ANY("Any image mediatype", "image/*"),

  /**
   * Represents any message media type.
   */
  MESSAGE_ANY("Any message mediatype", "message/*"),

  /**
   * Represents any model media type.
   */
  MODEL_ANY("Any model mediatype", "model/*"),

  /**
   * Represents any multipart media type.
   */
  MULTIPART_ANY("Any multipart mediatype", "multipart/*"),

  /**
   * Represents any text media type.
   */
  TEXT_ANY("Any text mediatype", "text/*"),

  /**
   * Represents any video media type.
   */
  VIDEO_ANY("Any video mediatype", "video/*"),

  /**
   * 1d-interleaved-parityfec
   */
  APPLICATION_1D_INTERLEAVED_PARITYFEC( "1d-interleaved-parityfec", "application/1d-interleaved-parityfec"),

  /**
   * Binary JSON or BSON as used in mongoDB
   */
  APPLICATION_BSON( "Bson", "application/bson" ),

  /**
   * 3gpdash-qoe-report+xml
   */
  APPLICATION_3GPDASH_QOE_REPORT_XML( "3gpdash-qoe-report+xml", "application/3gpdash-qoe-report+xml"),

  /**
   * 3gpp-ims+xml
   */
  APPLICATION_3GPP_IMS_XML( "3gpp-ims+xml", "application/3gpp-ims+xml"),

  /**
   * A2L
   */
  APPLICATION_A2L( "A2L", "application/A2L"),

  /**
   * AML
   */
  APPLICATION_AML( "AML", "application/AML"),

  /**
   * ATF
   */
  APPLICATION_ATF( "ATF", "application/ATF"),

  /**
   * ATFX
   */
  APPLICATION_ATFX( "ATFX", "application/ATFX"),

  /**
   * ATXML
   */
  APPLICATION_ATXML( "ATXML", "application/ATXML"),

  /**
   * CALS-1840
   */
  APPLICATION_CALS_1840( "CALS-1840", "application/CALS-1840"),

  /**
   * CDFX+XML
   */
  APPLICATION_CDFX_XML( "CDFX+XML", "application/CDFX+XML"),

  /**
   * CEA
   */
  APPLICATION_CEA( "CEA", "application/CEA"),

  /**
   * CSTAdata+xml
   */
  APPLICATION_CSTADATA_XML( "CSTAdata+xml", "application/CSTAdata+xml"),

  /**
   * DCD
   */
  APPLICATION_DCD( "DCD", "application/DCD"),

  /**
   * DII
   */
  APPLICATION_DII( "DII", "application/DII"),

  /**
   * DIT
   */
  APPLICATION_DIT( "DIT", "application/DIT"),

  /**
   * EDI-X12
   */
  APPLICATION_EDI_X12( "EDI-X12", "application/EDI-X12"),

  /**
   * EDI-consent
   */
  APPLICATION_EDI_CONSENT( "EDI-consent", "application/EDI-consent"),

  /**
   * EDIFACT
   */
  APPLICATION_EDIFACT( "EDIFACT", "application/EDIFACT"),

  /**
   * EmergencyCallData.Comment+xml
   */
  APPLICATION_EMERGENCYCALLDATA_COMMENT_XML( "EmergencyCallData.Comment+xml", "application/EmergencyCallData.Comment+xml"),

  /**
   * EmergencyCallData.Control+xml
   */
  APPLICATION_EMERGENCYCALLDATA_CONTROL_XML( "EmergencyCallData.Control+xml", "application/EmergencyCallData.Control+xml"),

  /**
   * EmergencyCallData.DeviceInfo+xml
   */
  APPLICATION_EMERGENCYCALLDATA_DEVICEINFO_XML( "EmergencyCallData.DeviceInfo+xml", "application/EmergencyCallData.DeviceInfo+xml"),

  /**
   * EmergencyCallData.ProviderInfo+xml
   */
  APPLICATION_EMERGENCYCALLDATA_PROVIDERINFO_XML( "EmergencyCallData.ProviderInfo+xml", "application/EmergencyCallData.ProviderInfo+xml"),

  /**
   * EmergencyCallData.ServiceInfo+xml
   */
  APPLICATION_EMERGENCYCALLDATA_SERVICEINFO_XML( "EmergencyCallData.ServiceInfo+xml", "application/EmergencyCallData.ServiceInfo+xml"),

  /**
   * EmergencyCallData.SubscriberInfo+xml
   */
  APPLICATION_EMERGENCYCALLDATA_SUBSCRIBERINFO_XML( "EmergencyCallData.SubscriberInfo+xml", "application/EmergencyCallData.SubscriberInfo+xml"),

  /**
   * EmergencyCallData.VEDS+xml
   */
  APPLICATION_EMERGENCYCALLDATA_VEDS_XML( "EmergencyCallData.VEDS+xml", "application/EmergencyCallData.VEDS+xml"),

  /**
   * EmergencyCallData.cap+xml
   */
  APPLICATION_EMERGENCYCALLDATA_CAP_XML( "EmergencyCallData.cap+xml", "application/EmergencyCallData.cap+xml"),

  /**
   * EmergencyCallData.eCall.MSD
   */
  APPLICATION_EMERGENCYCALLDATA_ECALL_MSD( "EmergencyCallData.eCall.MSD", "application/EmergencyCallData.eCall.MSD"),

  /**
   * H224
   */
  APPLICATION_H224( "H224", "application/H224"),

  /**
   * IOTP
   */
  APPLICATION_IOTP( "IOTP", "application/IOTP"),

  /**
   * ISUP
   */
  APPLICATION_ISUP( "ISUP", "application/ISUP"),

  /**
   * LXF
   */
  APPLICATION_LXF( "LXF", "application/LXF"),

  /**
   * MF4
   */
  APPLICATION_MF4( "MF4", "application/MF4"),

  /**
   * ODX
   */
  APPLICATION_ODX( "ODX", "application/ODX"),

  /**
   * PDX
   */
  APPLICATION_PDX( "PDX", "application/PDX"),

  /**
   * QSIG
   */
  APPLICATION_QSIG( "QSIG", "application/QSIG"),

  /**
   * SGML
   */
  APPLICATION_SGML( "SGML", "application/SGML"),

  /**
   * Message pack
   */
  APPLICATION_X_MSGPACK("Message pack", "application/x-msgpack"),

  /**
   * TETRA_ISI
   */
  APPLICATION_TETRA_ISI( "TETRA_ISI", "application/TETRA_ISI"),

  /**
   * activemessage
   */
  APPLICATION_ACTIVEMESSAGE( "activemessage", "application/activemessage"),

  /**
   * activity+json
   */
  APPLICATION_ACTIVITY_JSON( "activity+json", "application/activity+json"),

  /**
   * alto-costmap+json
   */
  APPLICATION_ALTO_COSTMAP_JSON( "alto-costmap+json", "application/alto-costmap+json"),

  /**
   * alto-costmapfilter+json
   */
  APPLICATION_ALTO_COSTMAPFILTER_JSON( "alto-costmapfilter+json", "application/alto-costmapfilter+json"),

  /**
   * alto-directory+json
   */
  APPLICATION_ALTO_DIRECTORY_JSON( "alto-directory+json", "application/alto-directory+json"),

  /**
   * alto-endpointcost+json
   */
  APPLICATION_ALTO_ENDPOINTCOST_JSON( "alto-endpointcost+json", "application/alto-endpointcost+json"),

  /**
   * alto-endpointcostparams+json
   */
  APPLICATION_ALTO_ENDPOINTCOSTPARAMS_JSON( "alto-endpointcostparams+json", "application/alto-endpointcostparams+json"),

  /**
   * alto-endpointprop+json
   */
  APPLICATION_ALTO_ENDPOINTPROP_JSON( "alto-endpointprop+json", "application/alto-endpointprop+json"),

  /**
   * alto-endpointpropparams+json
   */
  APPLICATION_ALTO_ENDPOINTPROPPARAMS_JSON( "alto-endpointpropparams+json", "application/alto-endpointpropparams+json"),

  /**
   * alto-error+json
   */
  APPLICATION_ALTO_ERROR_JSON( "alto-error+json", "application/alto-error+json"),

  /**
   * alto-networkmap+json
   */
  APPLICATION_ALTO_NETWORKMAP_JSON( "alto-networkmap+json", "application/alto-networkmap+json"),

  /**
   * alto-networkmapfilter+json
   */
  APPLICATION_ALTO_NETWORKMAPFILTER_JSON( "alto-networkmapfilter+json", "application/alto-networkmapfilter+json"),

  /**
   * alto-updatestreamcontrol+json
   */
  APPLICATION_ALTO_UPDATESTREAMCONTROL_JSON( "alto-updatestreamcontrol+json", "application/alto-updatestreamcontrol+json"),

  /**
   * alto-updatestreamparams+json
   */
  APPLICATION_ALTO_UPDATESTREAMPARAMS_JSON( "alto-updatestreamparams+json", "application/alto-updatestreamparams+json"),

  /**
   * Andrew Toolkit
   */
  APPLICATION_ANDREW_INSET( "Andrew Toolkit", "application/andrew-inset"),

  /**
   * applefile
   */
  APPLICATION_APPLEFILE( "applefile", "application/applefile"),

  /**
   * Applixware
   */
  APPLICATION_APPLIXWARE( "Applixware", "application/applixware"),

  /**
   * Atom Syndication Format
   */
  APPLICATION_ATOM_XML( "Atom Syndication Format", "application/atom+xml"),

  /**
   * Atom Publishing Protocol
   */
  APPLICATION_ATOMCAT_XML( "Atom Publishing Protocol", "application/atomcat+xml"),

  /**
   * atomdeleted+xml
   */
  APPLICATION_ATOMDELETED_XML( "atomdeleted+xml", "application/atomdeleted+xml"),

  /**
   * atomicmail
   */
  APPLICATION_ATOMICMAIL( "atomicmail", "application/atomicmail"),

  /**
   * Atom Publishing Protocol Service Document
   */
  APPLICATION_ATOMSVC_XML( "Atom Publishing Protocol Service Document", "application/atomsvc+xml"),

  /**
   * atsc-dwd+xml
   */
  APPLICATION_ATSC_DWD_XML( "atsc-dwd+xml", "application/atsc-dwd+xml"),

  /**
   * atsc-dynamic-event-message
   */
  APPLICATION_ATSC_DYNAMIC_EVENT_MESSAGE( "atsc-dynamic-event-message", "application/atsc-dynamic-event-message"),

  /**
   * atsc-held+xml
   */
  APPLICATION_ATSC_HELD_XML( "atsc-held+xml", "application/atsc-held+xml"),

  /**
   * atsc-rdt+json
   */
  APPLICATION_ATSC_RDT_JSON( "atsc-rdt+json", "application/atsc-rdt+json"),

  /**
   * atsc-rsat+xml
   */
  APPLICATION_ATSC_RSAT_XML( "atsc-rsat+xml", "application/atsc-rsat+xml"),

  /**
   * auth-policy+xml
   */
  APPLICATION_AUTH_POLICY_XML( "auth-policy+xml", "application/auth-policy+xml"),

  /**
   * bacnet-xdd+zip
   */
  APPLICATION_BACNET_XDD_ZIP( "bacnet-xdd+zip", "application/bacnet-xdd+zip"),

  /**
   * batch-SMTP
   */
  APPLICATION_BATCH_SMTP( "batch-SMTP", "application/batch-SMTP"),

  /**
   * beep+xml
   */
  APPLICATION_BEEP_XML( "beep+xml", "application/beep+xml"),

  /**
   * calendar+json
   */
  APPLICATION_CALENDAR_JSON( "calendar+json", "application/calendar+json"),

  /**
   * calendar+xml
   */
  APPLICATION_CALENDAR_XML( "calendar+xml", "application/calendar+xml"),

  /**
   * call-completion
   */
  APPLICATION_CALL_COMPLETION( "call-completion", "application/call-completion"),

  /**
   * captive+json
   */
  APPLICATION_CAPTIVE_JSON( "captive+json", "application/captive+json"),

  /**
   * cbor
   */
  APPLICATION_CBOR( "cbor", "application/cbor"),

  /**
   * cbor-seq
   */
  APPLICATION_CBOR_SEQ( "cbor-seq", "application/cbor-seq"),

  /**
   * cccex
   */
  APPLICATION_CCCEX( "cccex", "application/cccex"),

  /**
   * ccmp+xml
   */
  APPLICATION_CCMP_XML( "ccmp+xml", "application/ccmp+xml"),

  /**
   * Voice Browser Call Control
   */
  APPLICATION_CCXML_XML( "Voice Browser Call Control", "application/ccxml+xml"),

  /**
   * Cloud Data Management Interface (CDMI) - Capability
   */
  APPLICATION_CDMI_CAPABILITY( "Cloud Data Management Interface (CDMI) - Capability", "application/cdmi-capability"),

  /**
   * Cloud Data Management Interface (CDMI) - Contaimer
   */
  APPLICATION_CDMI_CONTAINER( "Cloud Data Management Interface (CDMI) - Contaimer", "application/cdmi-container"),

  /**
   * Cloud Data Management Interface (CDMI) - Domain
   */
  APPLICATION_CDMI_DOMAIN( "Cloud Data Management Interface (CDMI) - Domain", "application/cdmi-domain"),

  /**
   * Cloud Data Management Interface (CDMI) - Object
   */
  APPLICATION_CDMI_OBJECT( "Cloud Data Management Interface (CDMI) - Object", "application/cdmi-object"),

  /**
   * Cloud Data Management Interface (CDMI) - Queue
   */
  APPLICATION_CDMI_QUEUE( "Cloud Data Management Interface (CDMI) - Queue", "application/cdmi-queue"),

  /**
   * cdni
   */
  APPLICATION_CDNI( "cdni", "application/cdni"),

  /**
   * cea-2018+xml
   */
  APPLICATION_CEA_2018_XML( "cea-2018+xml", "application/cea-2018+xml"),

  /**
   * cellml+xml
   */
  APPLICATION_CELLML_XML( "cellml+xml", "application/cellml+xml"),

  /**
   * cfw
   */
  APPLICATION_CFW( "cfw", "application/cfw"),

  /**
   * clr
   */
  APPLICATION_CLR( "clr", "application/clr"),

  /**
   * clue+xml
   */
  APPLICATION_CLUE_XML( "clue+xml", "application/clue+xml"),

  /**
   * clue_info+xml
   */
  APPLICATION_CLUE_INFO_XML( "clue_info+xml", "application/clue_info+xml"),

  /**
   * cms
   */
  APPLICATION_CMS( "cms", "application/cms"),

  /**
   * cnrp+xml
   */
  APPLICATION_CNRP_XML( "cnrp+xml", "application/cnrp+xml"),

  /**
   * coap-group+json
   */
  APPLICATION_COAP_GROUP_JSON( "coap-group+json", "application/coap-group+json"),

  /**
   * coap-payload
   */
  APPLICATION_COAP_PAYLOAD( "coap-payload", "application/coap-payload"),

  /**
   * commonground
   */
  APPLICATION_COMMONGROUND( "commonground", "application/commonground"),

  /**
   * conference-info+xml
   */
  APPLICATION_CONFERENCE_INFO_XML( "conference-info+xml", "application/conference-info+xml"),

  /**
   * cose
   */
  APPLICATION_COSE( "cose", "application/cose"),

  /**
   * cose-key
   */
  APPLICATION_COSE_KEY( "cose-key", "application/cose-key"),

  /**
   * cose-key-set
   */
  APPLICATION_COSE_KEY_SET( "cose-key-set", "application/cose-key-set"),

  /**
   * cpl+xml
   */
  APPLICATION_CPL_XML( "cpl+xml", "application/cpl+xml"),

  /**
   * csrattrs
   */
  APPLICATION_CSRATTRS( "csrattrs", "application/csrattrs"),

  /**
   * csta+xml
   */
  APPLICATION_CSTA_XML( "csta+xml", "application/csta+xml"),

  /**
   * csvm+json
   */
  APPLICATION_CSVM_JSON( "csvm+json", "application/csvm+json"),

  /**
   * CU-SeeMe
   */
  APPLICATION_CU_SEEME( "CU-SeeMe", "application/cu-seeme"),

  /**
   * cwt
   */
  APPLICATION_CWT( "cwt", "application/cwt"),

  /**
   * cybercash
   */
  APPLICATION_CYBERCASH( "cybercash", "application/cybercash"),

  /**
   * dash+xml
   */
  APPLICATION_DASH_XML( "dash+xml", "application/dash+xml"),

  /**
   * dashdelta
   */
  APPLICATION_DASHDELTA( "dashdelta", "application/dashdelta"),

  /**
   * Web Distributed Authoring and Versioning
   */
  APPLICATION_DAVMOUNT_XML( "Web Distributed Authoring and Versioning", "application/davmount+xml"),

  /**
   * dca-rft
   */
  APPLICATION_DCA_RFT( "dca-rft", "application/dca-rft"),

  /**
   * dec-dx
   */
  APPLICATION_DEC_DX( "dec-dx", "application/dec-dx"),

  /**
   * dialog-info+xml
   */
  APPLICATION_DIALOG_INFO_XML( "dialog-info+xml", "application/dialog-info+xml"),

  /**
   * dicom
   */
  APPLICATION_DICOM( "dicom", "application/dicom"),

  /**
   * dicom+json
   */
  APPLICATION_DICOM_JSON( "dicom+json", "application/dicom+json"),

  /**
   * dicom+xml
   */
  APPLICATION_DICOM_XML( "dicom+xml", "application/dicom+xml"),

  /**
   * dns
   */
  APPLICATION_DNS( "dns", "application/dns"),

  /**
   * dns+json
   */
  APPLICATION_DNS_JSON( "dns+json", "application/dns+json"),

  /**
   * dns-message
   */
  APPLICATION_DNS_MESSAGE( "dns-message", "application/dns-message"),

  /**
   * dots+cbor
   */
  APPLICATION_DOTS_CBOR( "dots+cbor", "application/dots+cbor"),

  /**
   * dskpp+xml
   */
  APPLICATION_DSKPP_XML( "dskpp+xml", "application/dskpp+xml"),

  /**
   * Data Structure for the Security Suitability of Cryptographic Algorithms
   */
  APPLICATION_DSSC_DER( "Data Structure for the Security Suitability of Cryptographic Algorithms", "application/dssc+der"),

  /**
   * Data Structure for the Security Suitability of Cryptographic Algorithms
   */
  APPLICATION_DSSC_XML( "Data Structure for the Security Suitability of Cryptographic Algorithms", "application/dssc+xml"),

  /**
   * dvcs
   */
  APPLICATION_DVCS( "dvcs", "application/dvcs"),

  /**
   * ECMAScript
   */
  APPLICATION_ECMASCRIPT( "ECMAScript", "application/ecmascript"),

  /**
   * efi
   */
  APPLICATION_EFI( "efi", "application/efi"),

  /**
   * elm+json
   */
  APPLICATION_ELM_JSON( "elm+json", "application/elm+json"),

  /**
   * elm+xml
   */
  APPLICATION_ELM_XML( "elm+xml", "application/elm+xml"),

  /**
   * Extensible MultiModal Annotation
   */
  APPLICATION_EMMA_XML( "Extensible MultiModal Annotation", "application/emma+xml"),

  /**
   * emotionml+xml
   */
  APPLICATION_EMOTIONML_XML( "emotionml+xml", "application/emotionml+xml"),

  /**
   * encaprtp
   */
  APPLICATION_ENCAPRTP( "encaprtp", "application/encaprtp"),

  /**
   * epp+xml
   */
  APPLICATION_EPP_XML( "epp+xml", "application/epp+xml"),

  /**
   * Electronic Publication
   */
  APPLICATION_EPUB_ZIP( "Electronic Publication", "application/epub+zip"),

  /**
   * eshop
   */
  APPLICATION_ESHOP( "eshop", "application/eshop"),

  /**
   * example
   */
  APPLICATION_EXAMPLE( "example", "application/example"),

  /**
   * Efficient XML Interchange
   */
  APPLICATION_EXI( "Efficient XML Interchange", "application/exi"),

  /**
   * expect-ct-report+json
   */
  APPLICATION_EXPECT_CT_REPORT_JSON( "expect-ct-report+json", "application/expect-ct-report+json"),

  /**
   * fastinfoset
   */
  APPLICATION_FASTINFOSET( "fastinfoset", "application/fastinfoset"),

  /**
   * fastsoap
   */
  APPLICATION_FASTSOAP( "fastsoap", "application/fastsoap"),

  /**
   * fdt+xml
   */
  APPLICATION_FDT_XML( "fdt+xml", "application/fdt+xml"),

  /**
   * fhir+json
   */
  APPLICATION_FHIR_JSON( "fhir+json", "application/fhir+json"),

  /**
   * fhir+xml
   */
  APPLICATION_FHIR_XML( "fhir+xml", "application/fhir+xml"),

  /**
   * fits
   */
  APPLICATION_FITS( "fits", "application/fits"),

  /**
   * flexfec
   */
  APPLICATION_FLEXFEC( "flexfec", "application/flexfec"),

  /**
   * font-sfnt - DEPRECATED in favor of font/sfnt
   */
  APPLICATION_FONT_SFNT( "font-sfnt - DEPRECATED in favor of font/sfnt", "application/font-sfnt"),

  /**
   * Portable Font Resource
   */
  APPLICATION_FONT_TDPFR( "Portable Font Resource", "application/font-tdpfr"),

  /**
   * font-woff - DEPRECATED in favor of font/woff
   */
  APPLICATION_FONT_WOFF( "font-woff - DEPRECATED in favor of font/woff", "application/font-woff"),

  /**
   * framework-attributes+xml
   */
  APPLICATION_FRAMEWORK_ATTRIBUTES_XML( "framework-attributes+xml", "application/framework-attributes+xml"),

  /**
   * geo+json
   */
  APPLICATION_GEO_JSON( "geo+json", "application/geo+json"),

  /**
   * geo+json-seq
   */
  APPLICATION_GEO_JSON_SEQ( "geo+json-seq", "application/geo+json-seq"),

  /**
   * geopackage+sqlite3
   */
  APPLICATION_GEOPACKAGE_SQLITE3( "geopackage+sqlite3", "application/geopackage+sqlite3"),

  /**
   * geoxacml+xml
   */
  APPLICATION_GEOXACML_XML( "geoxacml+xml", "application/geoxacml+xml"),

  /**
   * gltf-buffer
   */
  APPLICATION_GLTF_BUFFER( "gltf-buffer", "application/gltf-buffer"),

  /**
   * gml+xml
   */
  APPLICATION_GML_XML( "gml+xml", "application/gml+xml"),

  /**
   * GPS eXchange Format
   */
  APPLICATION_GPX_XML( "GPS eXchange Format", "application/gpx+xml"),

  /**
   * gzip
   */
  APPLICATION_GZIP( "gzip", "application/gzip"),

  /**
   * held+xml
   */
  APPLICATION_HELD_XML( "held+xml", "application/held+xml"),

  /**
   * http
   */
  APPLICATION_HTTP( "http", "application/http"),

  /**
   * Hyperstudio
   */
  APPLICATION_HYPERSTUDIO( "Hyperstudio", "application/hyperstudio"),

  /**
   * ibe-key-request+xml
   */
  APPLICATION_IBE_KEY_REQUEST_XML( "ibe-key-request+xml", "application/ibe-key-request+xml"),

  /**
   * ibe-pkg-reply+xml
   */
  APPLICATION_IBE_PKG_REPLY_XML( "ibe-pkg-reply+xml", "application/ibe-pkg-reply+xml"),

  /**
   * ibe-pp-data
   */
  APPLICATION_IBE_PP_DATA( "ibe-pp-data", "application/ibe-pp-data"),

  /**
   * iges
   */
  APPLICATION_IGES( "iges", "application/iges"),

  /**
   * im-iscomposing+xml
   */
  APPLICATION_IM_ISCOMPOSING_XML( "im-iscomposing+xml", "application/im-iscomposing+xml"),

  /**
   * index
   */
  APPLICATION_INDEX( "index", "application/index"),

  /**
   * index.cmd
   */
  APPLICATION_INDEX_CMD( "index.cmd", "application/index.cmd"),

  /**
   * index.obj
   */
  APPLICATION_INDEX_OBJ( "index.obj", "application/index.obj"),

  /**
   * index.response
   */
  APPLICATION_INDEX_RESPONSE( "index.response", "application/index.response"),

  /**
   * index.vnd
   */
  APPLICATION_INDEX_VND( "index.vnd", "application/index.vnd"),

  /**
   * inkml+xml
   */
  APPLICATION_INKML_XML( "inkml+xml", "application/inkml+xml"),

  /**
   * Internet Protocol Flow Information Export
   */
  APPLICATION_IPFIX( "Internet Protocol Flow Information Export", "application/ipfix"),

  /**
   * ipp
   */
  APPLICATION_IPP( "ipp", "application/ipp"),

  /**
   * its+xml
   */
  APPLICATION_ITS_XML( "its+xml", "application/its+xml"),

  /**
   * Java Archive
   */
  APPLICATION_JAVA_ARCHIVE( "Java Archive", "application/java-archive"),

  /**
   * Java Serialized Object
   */
  APPLICATION_JAVA_SERIALIZED_OBJECT( "Java Serialized Object", "application/java-serialized-object"),

  /**
   * Java Bytecode File
   */
  APPLICATION_JAVA_VM( "Java Bytecode File", "application/java-vm"),

  /**
   * JavaScript
   */
  APPLICATION_JAVASCRIPT( "JavaScript", "application/javascript"),

  /**
   * jf2feed+json
   */
  APPLICATION_JF2FEED_JSON( "jf2feed+json", "application/jf2feed+json"),

  /**
   * jose
   */
  APPLICATION_JOSE( "jose", "application/jose"),

  /**
   * jose+json
   */
  APPLICATION_JOSE_JSON( "jose+json", "application/jose+json"),

  /**
   * jrd+json
   */
  APPLICATION_JRD_JSON( "jrd+json", "application/jrd+json"),

  /**
   * jscalendar+json
   */
  APPLICATION_JSCALENDAR_JSON( "jscalendar+json", "application/jscalendar+json"),

  /**
   * JavaScript Object Notation (JSON)
   */
  APPLICATION_JSON( "JavaScript Object Notation (JSON)", "application/json"),

  /**
   * json-patch+json
   */
  APPLICATION_JSON_PATCH_JSON( "json-patch+json", "application/json-patch+json"),

  /**
   * json-seq
   */
  APPLICATION_JSON_SEQ( "json-seq", "application/json-seq"),

  /**
   * jwk+json
   */
  APPLICATION_JWK_JSON( "jwk+json", "application/jwk+json"),

  /**
   * jwk-set+json
   */
  APPLICATION_JWK_SET_JSON( "jwk-set+json", "application/jwk-set+json"),

  /**
   * jwt
   */
  APPLICATION_JWT( "jwt", "application/jwt"),

  /**
   * kpml-request+xml
   */
  APPLICATION_KPML_REQUEST_XML( "kpml-request+xml", "application/kpml-request+xml"),

  /**
   * kpml-response+xml
   */
  APPLICATION_KPML_RESPONSE_XML( "kpml-response+xml", "application/kpml-response+xml"),

  /**
   * ld+json
   */
  APPLICATION_LD_JSON( "ld+json", "application/ld+json"),

  /**
   * lgr+xml
   */
  APPLICATION_LGR_XML( "lgr+xml", "application/lgr+xml"),

  /**
   * link-format
   */
  APPLICATION_LINK_FORMAT( "link-format", "application/link-format"),

  /**
   * load-control+xml
   */
  APPLICATION_LOAD_CONTROL_XML( "load-control+xml", "application/load-control+xml"),

  /**
   * lost+xml
   */
  APPLICATION_LOST_XML( "lost+xml", "application/lost+xml"),

  /**
   * lostsync+xml
   */
  APPLICATION_LOSTSYNC_XML( "lostsync+xml", "application/lostsync+xml"),

  /**
   * lpf+zip
   */
  APPLICATION_LPF_ZIP( "lpf+zip", "application/lpf+zip"),

  /**
   * Macintosh BinHex 4.0
   */
  APPLICATION_MAC_BINHEX40( "Macintosh BinHex 4.0", "application/mac-binhex40"),

  /**
   * Compact Pro
   */
  APPLICATION_MAC_COMPACTPRO( "Compact Pro", "application/mac-compactpro"),

  /**
   * macwriteii
   */
  APPLICATION_MACWRITEII( "macwriteii", "application/macwriteii"),

  /**
   * Metadata Authority  Description Schema
   */
  APPLICATION_MADS_XML( "Metadata Authority  Description Schema", "application/mads+xml"),

  /**
   * MARC Formats
   */
  APPLICATION_MARC( "MARC Formats", "application/marc"),

  /**
   * MARC21 XML Schema
   */
  APPLICATION_MARCXML_XML( "MARC21 XML Schema", "application/marcxml+xml"),

  /**
   * Mathematica Notebooks
   */
  APPLICATION_MATHEMATICA( "Mathematica Notebooks", "application/mathematica"),

  /**
   * Mathematical Markup Language
   */
  APPLICATION_MATHML_XML( "Mathematical Markup Language", "application/mathml+xml"),

  /**
   * mathml-content+xml
   */
  APPLICATION_MATHML_CONTENT_XML( "mathml-content+xml", "application/mathml-content+xml"),

  /**
   * mathml-presentation+xml
   */
  APPLICATION_MATHML_PRESENTATION_XML( "mathml-presentation+xml", "application/mathml-presentation+xml"),

  /**
   * mbms-associated-procedure-description+xml
   */
  APPLICATION_MBMS_ASSOCIATED_PROCEDURE_DESCRIPTION_XML( "mbms-associated-procedure-description+xml", "application/mbms-associated-procedure-description+xml"),

  /**
   * mbms-deregister+xml
   */
  APPLICATION_MBMS_DEREGISTER_XML( "mbms-deregister+xml", "application/mbms-deregister+xml"),

  /**
   * mbms-envelope+xml
   */
  APPLICATION_MBMS_ENVELOPE_XML( "mbms-envelope+xml", "application/mbms-envelope+xml"),

  /**
   * mbms-msk+xml
   */
  APPLICATION_MBMS_MSK_XML( "mbms-msk+xml", "application/mbms-msk+xml"),

  /**
   * mbms-msk-response+xml
   */
  APPLICATION_MBMS_MSK_RESPONSE_XML( "mbms-msk-response+xml", "application/mbms-msk-response+xml"),

  /**
   * mbms-protection-description+xml
   */
  APPLICATION_MBMS_PROTECTION_DESCRIPTION_XML( "mbms-protection-description+xml", "application/mbms-protection-description+xml"),

  /**
   * mbms-reception-report+xml
   */
  APPLICATION_MBMS_RECEPTION_REPORT_XML( "mbms-reception-report+xml", "application/mbms-reception-report+xml"),

  /**
   * mbms-register+xml
   */
  APPLICATION_MBMS_REGISTER_XML( "mbms-register+xml", "application/mbms-register+xml"),

  /**
   * mbms-register-response+xml
   */
  APPLICATION_MBMS_REGISTER_RESPONSE_XML( "mbms-register-response+xml", "application/mbms-register-response+xml"),

  /**
   * mbms-schedule+xml
   */
  APPLICATION_MBMS_SCHEDULE_XML( "mbms-schedule+xml", "application/mbms-schedule+xml"),

  /**
   * mbms-user-service-description+xml
   */
  APPLICATION_MBMS_USER_SERVICE_DESCRIPTION_XML( "mbms-user-service-description+xml", "application/mbms-user-service-description+xml"),

  /**
   * Mbox database files
   */
  APPLICATION_MBOX( "Mbox database files", "application/mbox"),

  /**
   * media-policy-dataset+xml
   */
  APPLICATION_MEDIA_POLICY_DATASET_XML( "media-policy-dataset+xml", "application/media-policy-dataset+xml"),

  /**
   * media_control+xml
   */
  APPLICATION_MEDIA_CONTROL_XML( "media_control+xml", "application/media_control+xml"),

  /**
   * Media Server Control Markup Language
   */
  APPLICATION_MEDIASERVERCONTROL_XML( "Media Server Control Markup Language", "application/mediaservercontrol+xml"),

  /**
   * merge-patch+json
   */
  APPLICATION_MERGE_PATCH_JSON( "merge-patch+json", "application/merge-patch+json"),

  /**
   * Metalink
   */
  APPLICATION_METALINK4_XML( "Metalink", "application/metalink4+xml"),

  /**
   * Metadata Encoding and Transmission Standard
   */
  APPLICATION_METS_XML( "Metadata Encoding and Transmission Standard", "application/mets+xml"),

  /**
   * mikey
   */
  APPLICATION_MIKEY( "mikey", "application/mikey"),

  /**
   * mipc
   */
  APPLICATION_MIPC( "mipc", "application/mipc"),

  /**
   * mmt-aei+xml
   */
  APPLICATION_MMT_AEI_XML( "mmt-aei+xml", "application/mmt-aei+xml"),

  /**
   * mmt-usd+xml
   */
  APPLICATION_MMT_USD_XML( "mmt-usd+xml", "application/mmt-usd+xml"),

  /**
   * Metadata Object Description Schema
   */
  APPLICATION_MODS_XML( "Metadata Object Description Schema", "application/mods+xml"),

  /**
   * moss-keys
   */
  APPLICATION_MOSS_KEYS( "moss-keys", "application/moss-keys"),

  /**
   * moss-signature
   */
  APPLICATION_MOSS_SIGNATURE( "moss-signature", "application/moss-signature"),

  /**
   * mosskey-data
   */
  APPLICATION_MOSSKEY_DATA( "mosskey-data", "application/mosskey-data"),

  /**
   * mosskey-request
   */
  APPLICATION_MOSSKEY_REQUEST( "mosskey-request", "application/mosskey-request"),

  /**
   * MPEG-21
   */
  APPLICATION_MP21( "MPEG-21", "application/mp21"),

  /**
   * MPEG4
   */
  APPLICATION_MP4( "MPEG4", "application/mp4"),

  /**
   * mpeg4-generic
   */
  APPLICATION_MPEG4_GENERIC( "mpeg4-generic", "application/mpeg4-generic"),

  /**
   * mpeg4-iod
   */
  APPLICATION_MPEG4_IOD( "mpeg4-iod", "application/mpeg4-iod"),

  /**
   * mpeg4-iod-xmt
   */
  APPLICATION_MPEG4_IOD_XMT( "mpeg4-iod-xmt", "application/mpeg4-iod-xmt"),

  /**
   * mrb-consumer+xml
   */
  APPLICATION_MRB_CONSUMER_XML( "mrb-consumer+xml", "application/mrb-consumer+xml"),

  /**
   * mrb-publish+xml
   */
  APPLICATION_MRB_PUBLISH_XML( "mrb-publish+xml", "application/mrb-publish+xml"),

  /**
   * msc-ivr+xml
   */
  APPLICATION_MSC_IVR_XML( "msc-ivr+xml", "application/msc-ivr+xml"),

  /**
   * msc-mixer+xml
   */
  APPLICATION_MSC_MIXER_XML( "msc-mixer+xml", "application/msc-mixer+xml"),

  /**
   * Microsoft Word
   */
  APPLICATION_MSWORD( "Microsoft Word", "application/msword"),

  /**
   * mud+json
   */
  APPLICATION_MUD_JSON( "mud+json", "application/mud+json"),

  /**
   * multipart-core
   */
  APPLICATION_MULTIPART_CORE( "multipart-core", "application/multipart-core"),

  /**
   * Material Exchange Format
   */
  APPLICATION_MXF( "Material Exchange Format", "application/mxf"),

  /**
   * n-quads
   */
  APPLICATION_N_QUADS( "n-quads", "application/n-quads"),

  /**
   * n-triples
   */
  APPLICATION_N_TRIPLES( "n-triples", "application/n-triples"),

  /**
   * nasdata
   */
  APPLICATION_NASDATA( "nasdata", "application/nasdata"),

  /**
   * news-checkgroups
   */
  APPLICATION_NEWS_CHECKGROUPS( "news-checkgroups", "application/news-checkgroups"),

  /**
   * news-groupinfo
   */
  APPLICATION_NEWS_GROUPINFO( "news-groupinfo", "application/news-groupinfo"),

  /**
   * news-transmission
   */
  APPLICATION_NEWS_TRANSMISSION( "news-transmission", "application/news-transmission"),

  /**
   * nlsml+xml
   */
  APPLICATION_NLSML_XML( "nlsml+xml", "application/nlsml+xml"),

  /**
   * node
   */
  APPLICATION_NODE( "node", "application/node"),

  /**
   * nss
   */
  APPLICATION_NSS( "nss", "application/nss"),

  /**
   * ocsp-request
   */
  APPLICATION_OCSP_REQUEST( "ocsp-request", "application/ocsp-request"),

  /**
   * ocsp-response
   */
  APPLICATION_OCSP_RESPONSE( "ocsp-response", "application/ocsp-response"),

  /**
   * Binary Data
   */
  APPLICATION_OCTET_STREAM( "Binary Data", "application/octet-stream"),

  /**
   * Office Document Architecture
   */
  APPLICATION_ODA( "Office Document Architecture", "application/oda"),

  /**
   * odm+xml
   */
  APPLICATION_ODM_XML( "odm+xml", "application/odm+xml"),

  /**
   * Open eBook Publication Structure
   */
  APPLICATION_OEBPS_PACKAGE_XML( "Open eBook Publication Structure", "application/oebps-package+xml"),

  /**
   * Ogg
   */
  APPLICATION_OGG( "Ogg", "application/ogg"),

  /**
   * Microsoft OneNote
   */
  APPLICATION_ONENOTE( "Microsoft OneNote", "application/onenote"),

  /**
   * opc-nodeset+xml
   */
  APPLICATION_OPC_NODESET_XML( "opc-nodeset+xml", "application/opc-nodeset+xml"),

  /**
   * oscore
   */
  APPLICATION_OSCORE( "oscore", "application/oscore"),

  /**
   * oxps
   */
  APPLICATION_OXPS( "oxps", "application/oxps"),

  /**
   * p2p-overlay+xml
   */
  APPLICATION_P2P_OVERLAY_XML( "p2p-overlay+xml", "application/p2p-overlay+xml"),

  /**
   * parityfec
   */
  APPLICATION_PARITYFEC( "parityfec", "application/parityfec"),

  /**
   * passport
   */
  APPLICATION_PASSPORT( "passport", "application/passport"),

  /**
   * XML Patch Framework
   */
  APPLICATION_PATCH_OPS_ERROR_XML( "XML Patch Framework", "application/patch-ops-error+xml"),

  /**
   * Adobe Portable Document Format
   */
  APPLICATION_PDF( "Adobe Portable Document Format", "application/pdf"),

  /**
   * pem-certificate-chain
   */
  APPLICATION_PEM_CERTIFICATE_CHAIN( "pem-certificate-chain", "application/pem-certificate-chain"),

  /**
   * Pretty Good Privacy
   */
  APPLICATION_PGP_ENCRYPTED( "Pretty Good Privacy", "application/pgp-encrypted"),

  /**
   * pgp-keys
   */
  APPLICATION_PGP_KEYS( "pgp-keys", "application/pgp-keys"),

  /**
   * Pretty Good Privacy - Signature
   */
  APPLICATION_PGP_SIGNATURE( "Pretty Good Privacy - Signature", "application/pgp-signature"),

  /**
   * PICSRules
   */
  APPLICATION_PICS_RULES( "PICSRules", "application/pics-rules"),

  /**
   * pidf+xml
   */
  APPLICATION_PIDF_XML( "pidf+xml", "application/pidf+xml"),

  /**
   * pidf-diff+xml
   */
  APPLICATION_PIDF_DIFF_XML( "pidf-diff+xml", "application/pidf-diff+xml"),

  /**
   * PKCS #10 - Certification Request Standard
   */
  APPLICATION_PKCS10( "PKCS #10 - Certification Request Standard", "application/pkcs10"),

  /**
   * pkcs12
   */
  APPLICATION_PKCS12( "pkcs12", "application/pkcs12"),

  /**
   * PKCS #7 - Cryptographic Message Syntax Standard
   */
  APPLICATION_PKCS7_MIME( "PKCS #7 - Cryptographic Message Syntax Standard", "application/pkcs7-mime"),

  /**
   * PKCS #7 - Cryptographic Message Syntax Standard
   */
  APPLICATION_PKCS7_SIGNATURE( "PKCS #7 - Cryptographic Message Syntax Standard", "application/pkcs7-signature"),

  /**
   * PKCS #8 - Private-Key Information Syntax Standard
   */
  APPLICATION_PKCS8( "PKCS #8 - Private-Key Information Syntax Standard", "application/pkcs8"),

  /**
   * pkcs8-encrypted
   */
  APPLICATION_PKCS8_ENCRYPTED( "pkcs8-encrypted", "application/pkcs8-encrypted"),

  /**
   * Attribute Certificate
   */
  APPLICATION_PKIX_ATTR_CERT( "Attribute Certificate", "application/pkix-attr-cert"),

  /**
   * Internet Public Key Infrastructure - Certificate
   */
  APPLICATION_PKIX_CERT( "Internet Public Key Infrastructure - Certificate", "application/pkix-cert"),

  /**
   * Internet Public Key Infrastructure - Certificate Revocation Lists
   */
  APPLICATION_PKIX_CRL( "Internet Public Key Infrastructure - Certificate Revocation Lists", "application/pkix-crl"),

  /**
   * Internet Public Key Infrastructure - Certification Path
   */
  APPLICATION_PKIX_PKIPATH( "Internet Public Key Infrastructure - Certification Path", "application/pkix-pkipath"),

  /**
   * Internet Public Key Infrastructure - Certificate Management Protocole
   */
  APPLICATION_PKIXCMP( "Internet Public Key Infrastructure - Certificate Management Protocole", "application/pkixcmp"),

  /**
   * Pronunciation Lexicon Specification
   */
  APPLICATION_PLS_XML( "Pronunciation Lexicon Specification", "application/pls+xml"),

  /**
   * poc-settings+xml
   */
  APPLICATION_POC_SETTINGS_XML( "poc-settings+xml", "application/poc-settings+xml"),

  /**
   * PostScript
   */
  APPLICATION_POSTSCRIPT( "PostScript", "application/postscript"),

  /**
   * ppsp-tracker+json
   */
  APPLICATION_PPSP_TRACKER_JSON( "ppsp-tracker+json", "application/ppsp-tracker+json"),

  /**
   * problem+json
   */
  APPLICATION_PROBLEM_JSON( "problem+json", "application/problem+json"),

  /**
   * problem+xml
   */
  APPLICATION_PROBLEM_XML( "problem+xml", "application/problem+xml"),

  /**
   * provenance+xml
   */
  APPLICATION_PROVENANCE_XML( "provenance+xml", "application/provenance+xml"),

  /**
   * prs.alvestrand.titrax-sheet
   */
  APPLICATION_PRS_ALVESTRAND_TITRAX_SHEET( "prs.alvestrand.titrax-sheet", "application/prs.alvestrand.titrax-sheet"),

  /**
   * CU-Writer
   */
  APPLICATION_PRS_CWW( "CU-Writer", "application/prs.cww"),

  /**
   * prs.cyn
   */
  APPLICATION_PRS_CYN( "prs.cyn", "application/prs.cyn"),

  /**
   * prs.hpub+zip
   */
  APPLICATION_PRS_HPUB_ZIP( "prs.hpub+zip", "application/prs.hpub+zip"),

  /**
   * prs.nprend
   */
  APPLICATION_PRS_NPREND( "prs.nprend", "application/prs.nprend"),

  /**
   * prs.plucker
   */
  APPLICATION_PRS_PLUCKER( "prs.plucker", "application/prs.plucker"),

  /**
   * prs.rdf-xml-crypt
   */
  APPLICATION_PRS_RDF_XML_CRYPT( "prs.rdf-xml-crypt", "application/prs.rdf-xml-crypt"),

  /**
   * prs.xsf+xml
   */
  APPLICATION_PRS_XSF_XML( "prs.xsf+xml", "application/prs.xsf+xml"),

  /**
   * Portable Symmetric Key Container
   */
  APPLICATION_PSKC_XML( "Portable Symmetric Key Container", "application/pskc+xml"),

  /**
   * pvd+json
   */
  APPLICATION_PVD_JSON( "pvd+json", "application/pvd+json"),

  /**
   * raptorfec
   */
  APPLICATION_RAPTORFEC( "raptorfec", "application/raptorfec"),

  /**
   * rdap+json
   */
  APPLICATION_RDAP_JSON( "rdap+json", "application/rdap+json"),

  /**
   * Resource Description Framework
   */
  APPLICATION_RDF_XML( "Resource Description Framework", "application/rdf+xml"),

  /**
   * IMS Networks
   */
  APPLICATION_REGINFO_XML( "IMS Networks", "application/reginfo+xml"),

  /**
   * Relax NG Compact Syntax
   */
  APPLICATION_RELAX_NG_COMPACT_SYNTAX( "Relax NG Compact Syntax", "application/relax-ng-compact-syntax"),

  /**
   * remote-printing
   */
  APPLICATION_REMOTE_PRINTING( "remote-printing", "application/remote-printing"),

  /**
   * reputon+json
   */
  APPLICATION_REPUTON_JSON( "reputon+json", "application/reputon+json"),

  /**
   * XML Resource Lists
   */
  APPLICATION_RESOURCE_LISTS_XML( "XML Resource Lists", "application/resource-lists+xml"),

  /**
   * XML Resource Lists Diff
   */
  APPLICATION_RESOURCE_LISTS_DIFF_XML( "XML Resource Lists Diff", "application/resource-lists-diff+xml"),

  /**
   * rfc+xml
   */
  APPLICATION_RFC_XML( "rfc+xml", "application/rfc+xml"),

  /**
   * riscos
   */
  APPLICATION_RISCOS( "riscos", "application/riscos"),

  /**
   * rlmi+xml
   */
  APPLICATION_RLMI_XML( "rlmi+xml", "application/rlmi+xml"),

  /**
   * XML Resource Lists
   */
  APPLICATION_RLS_SERVICES_XML( "XML Resource Lists", "application/rls-services+xml"),

  /**
   * route-apd+xml
   */
  APPLICATION_ROUTE_APD_XML( "route-apd+xml", "application/route-apd+xml"),

  /**
   * route-s-tsid+xml
   */
  APPLICATION_ROUTE_S_TSID_XML( "route-s-tsid+xml", "application/route-s-tsid+xml"),

  /**
   * route-usd+xml
   */
  APPLICATION_ROUTE_USD_XML( "route-usd+xml", "application/route-usd+xml"),

  /**
   * rpki-ghostbusters
   */
  APPLICATION_RPKI_GHOSTBUSTERS( "rpki-ghostbusters", "application/rpki-ghostbusters"),

  /**
   * rpki-manifest
   */
  APPLICATION_RPKI_MANIFEST( "rpki-manifest", "application/rpki-manifest"),

  /**
   * rpki-publication
   */
  APPLICATION_RPKI_PUBLICATION( "rpki-publication", "application/rpki-publication"),

  /**
   * rpki-roa
   */
  APPLICATION_RPKI_ROA( "rpki-roa", "application/rpki-roa"),

  /**
   * rpki-updown
   */
  APPLICATION_RPKI_UPDOWN( "rpki-updown", "application/rpki-updown"),

  /**
   * Really Simple Discovery
   */
  APPLICATION_RSD_XML( "Really Simple Discovery", "application/rsd+xml"),

  /**
   * RSS - Really Simple Syndication
   */
  APPLICATION_RSS_XML( "RSS - Really Simple Syndication", "application/rss+xml"),

  /**
   * Rich Text Format
   */
  APPLICATION_RTF( "Rich Text Format", "application/rtf"),

  /**
   * rtploopback
   */
  APPLICATION_RTPLOOPBACK( "rtploopback", "application/rtploopback"),

  /**
   * rtx
   */
  APPLICATION_RTX( "rtx", "application/rtx"),

  /**
   * samlassertion+xml
   */
  APPLICATION_SAMLASSERTION_XML( "samlassertion+xml", "application/samlassertion+xml"),

  /**
   * samlmetadata+xml
   */
  APPLICATION_SAMLMETADATA_XML( "samlmetadata+xml", "application/samlmetadata+xml"),

  /**
   * sarif+json
   */
  APPLICATION_SARIF_JSON( "sarif+json", "application/sarif+json"),

  /**
   * sbe
   */
  APPLICATION_SBE( "sbe", "application/sbe"),

  /**
   * Systems Biology Markup Language
   */
  APPLICATION_SBML_XML( "Systems Biology Markup Language", "application/sbml+xml"),

  /**
   * scaip+xml
   */
  APPLICATION_SCAIP_XML( "scaip+xml", "application/scaip+xml"),

  /**
   * scim+json
   */
  APPLICATION_SCIM_JSON( "scim+json", "application/scim+json"),

  /**
   * Server-Based Certificate Validation Protocol - Validation Request
   */
  APPLICATION_SCVP_CV_REQUEST( "Server-Based Certificate Validation Protocol - Validation Request", "application/scvp-cv-request"),

  /**
   * Server-Based Certificate Validation Protocol - Validation Response
   */
  APPLICATION_SCVP_CV_RESPONSE( "Server-Based Certificate Validation Protocol - Validation Response", "application/scvp-cv-response"),

  /**
   * Server-Based Certificate Validation Protocol - Validation Policies - Request
   */
  APPLICATION_SCVP_VP_REQUEST( "Server-Based Certificate Validation Protocol - Validation Policies - Request", "application/scvp-vp-request"),

  /**
   * Server-Based Certificate Validation Protocol - Validation Policies - Response
   */
  APPLICATION_SCVP_VP_RESPONSE( "Server-Based Certificate Validation Protocol - Validation Policies - Response", "application/scvp-vp-response"),

  /**
   * Session Description Protocol
   */
  APPLICATION_SDP( "Session Description Protocol", "application/sdp"),

  /**
   * secevent+jwt
   */
  APPLICATION_SECEVENT_JWT( "secevent+jwt", "application/secevent+jwt"),

  /**
   * senml+cbor
   */
  APPLICATION_SENML_CBOR( "senml+cbor", "application/senml+cbor"),

  /**
   * senml+json
   */
  APPLICATION_SENML_JSON( "senml+json", "application/senml+json"),

  /**
   * senml+xml
   */
  APPLICATION_SENML_XML( "senml+xml", "application/senml+xml"),

  /**
   * senml-etch+cbor
   */
  APPLICATION_SENML_ETCH_CBOR( "senml-etch+cbor", "application/senml-etch+cbor"),

  /**
   * senml-etch+json
   */
  APPLICATION_SENML_ETCH_JSON( "senml-etch+json", "application/senml-etch+json"),

  /**
   * senml-exi
   */
  APPLICATION_SENML_EXI( "senml-exi", "application/senml-exi"),

  /**
   * sensml+cbor
   */
  APPLICATION_SENSML_CBOR( "sensml+cbor", "application/sensml+cbor"),

  /**
   * sensml+json
   */
  APPLICATION_SENSML_JSON( "sensml+json", "application/sensml+json"),

  /**
   * sensml+xml
   */
  APPLICATION_SENSML_XML( "sensml+xml", "application/sensml+xml"),

  /**
   * sensml-exi
   */
  APPLICATION_SENSML_EXI( "sensml-exi", "application/sensml-exi"),

  /**
   * sep+xml
   */
  APPLICATION_SEP_XML( "sep+xml", "application/sep+xml"),

  /**
   * sep-exi
   */
  APPLICATION_SEP_EXI( "sep-exi", "application/sep-exi"),

  /**
   * session-info
   */
  APPLICATION_SESSION_INFO( "session-info", "application/session-info"),

  /**
   * set-payment
   */
  APPLICATION_SET_PAYMENT( "set-payment", "application/set-payment"),

  /**
   * Secure Electronic Transaction - Payment
   */
  APPLICATION_SET_PAYMENT_INITIATION( "Secure Electronic Transaction - Payment", "application/set-payment-initiation"),

  /**
   * set-registration
   */
  APPLICATION_SET_REGISTRATION( "set-registration", "application/set-registration"),

  /**
   * Secure Electronic Transaction - Registration
   */
  APPLICATION_SET_REGISTRATION_INITIATION( "Secure Electronic Transaction - Registration", "application/set-registration-initiation"),

  /**
   * sgml-open-catalog
   */
  APPLICATION_SGML_OPEN_CATALOG( "sgml-open-catalog", "application/sgml-open-catalog"),

  /**
   * S Hexdump Format
   */
  APPLICATION_SHF_XML( "S Hexdump Format", "application/shf+xml"),

  /**
   * sieve
   */
  APPLICATION_SIEVE( "sieve", "application/sieve"),

  /**
   * simple-filter+xml
   */
  APPLICATION_SIMPLE_FILTER_XML( "simple-filter+xml", "application/simple-filter+xml"),

  /**
   * simple-message-summary
   */
  APPLICATION_SIMPLE_MESSAGE_SUMMARY( "simple-message-summary", "application/simple-message-summary"),

  /**
   * simpleSymbolContainer
   */
  APPLICATION_SIMPLESYMBOLCONTAINER( "simpleSymbolContainer", "application/simpleSymbolContainer"),

  /**
   * sipc
   */
  APPLICATION_SIPC( "sipc", "application/sipc"),

  /**
   * slate
   */
  APPLICATION_SLATE( "slate", "application/slate"),

  /**
   * smil - OBSOLETED in favor of application/smil+xml
   */
  APPLICATION_SMIL( "smil - OBSOLETED in favor of application/smil+xml", "application/smil"),

  /**
   * Synchronized Multimedia Integration Language
   */
  APPLICATION_SMIL_XML( "Synchronized Multimedia Integration Language", "application/smil+xml"),

  /**
   * smpte336m
   */
  APPLICATION_SMPTE336M( "smpte336m", "application/smpte336m"),

  /**
   * soap+fastinfoset
   */
  APPLICATION_SOAP_FASTINFOSET( "soap+fastinfoset", "application/soap+fastinfoset"),

  /**
   * soap+xml
   */
  APPLICATION_SOAP_XML( "soap+xml", "application/soap+xml"),

  /**
   * SPARQL - Query
   */
  APPLICATION_SPARQL_QUERY( "SPARQL - Query", "application/sparql-query"),

  /**
   * SPARQL - Results
   */
  APPLICATION_SPARQL_RESULTS_XML( "SPARQL - Results", "application/sparql-results+xml"),

  /**
   * spirits-event+xml
   */
  APPLICATION_SPIRITS_EVENT_XML( "spirits-event+xml", "application/spirits-event+xml"),

  /**
   * sql
   */
  APPLICATION_SQL( "sql", "application/sql"),

  /**
   * Speech Recognition Grammar Specification
   */
  APPLICATION_SRGS( "Speech Recognition Grammar Specification", "application/srgs"),

  /**
   * Speech Recognition Grammar Specification - XML
   */
  APPLICATION_SRGS_XML( "Speech Recognition Grammar Specification - XML", "application/srgs+xml"),

  /**
   * Search/Retrieve via URL Response Format
   */
  APPLICATION_SRU_XML( "Search/Retrieve via URL Response Format", "application/sru+xml"),

  /**
   * Speech Synthesis Markup Language
   */
  APPLICATION_SSML_XML( "Speech Synthesis Markup Language", "application/ssml+xml"),

  /**
   * stix+json
   */
  APPLICATION_STIX_JSON( "stix+json", "application/stix+json"),

  /**
   * swid+xml
   */
  APPLICATION_SWID_XML( "swid+xml", "application/swid+xml"),

  /**
   * tamp-apex-update
   */
  APPLICATION_TAMP_APEX_UPDATE( "tamp-apex-update", "application/tamp-apex-update"),

  /**
   * tamp-apex-update-confirm
   */
  APPLICATION_TAMP_APEX_UPDATE_CONFIRM( "tamp-apex-update-confirm", "application/tamp-apex-update-confirm"),

  /**
   * tamp-community-update
   */
  APPLICATION_TAMP_COMMUNITY_UPDATE( "tamp-community-update", "application/tamp-community-update"),

  /**
   * tamp-community-update-confirm
   */
  APPLICATION_TAMP_COMMUNITY_UPDATE_CONFIRM( "tamp-community-update-confirm", "application/tamp-community-update-confirm"),

  /**
   * tamp-error
   */
  APPLICATION_TAMP_ERROR( "tamp-error", "application/tamp-error"),

  /**
   * tamp-sequence-adjust
   */
  APPLICATION_TAMP_SEQUENCE_ADJUST( "tamp-sequence-adjust", "application/tamp-sequence-adjust"),

  /**
   * tamp-sequence-adjust-confirm
   */
  APPLICATION_TAMP_SEQUENCE_ADJUST_CONFIRM( "tamp-sequence-adjust-confirm", "application/tamp-sequence-adjust-confirm"),

  /**
   * tamp-status-query
   */
  APPLICATION_TAMP_STATUS_QUERY( "tamp-status-query", "application/tamp-status-query"),

  /**
   * tamp-status-response
   */
  APPLICATION_TAMP_STATUS_RESPONSE( "tamp-status-response", "application/tamp-status-response"),

  /**
   * tamp-update
   */
  APPLICATION_TAMP_UPDATE( "tamp-update", "application/tamp-update"),

  /**
   * tamp-update-confirm
   */
  APPLICATION_TAMP_UPDATE_CONFIRM( "tamp-update-confirm", "application/tamp-update-confirm"),

  /**
   * taxii+json
   */
  APPLICATION_TAXII_JSON( "taxii+json", "application/taxii+json"),

  /**
   * td+json
   */
  APPLICATION_TD_JSON( "td+json", "application/td+json"),

  /**
   * Text Encoding and Interchange
   */
  APPLICATION_TEI_XML( "Text Encoding and Interchange", "application/tei+xml"),

  /**
   * Sharing Transaction Fraud Data
   */
  APPLICATION_THRAUD_XML( "Sharing Transaction Fraud Data", "application/thraud+xml"),

  /**
   * timestamp-query
   */
  APPLICATION_TIMESTAMP_QUERY( "timestamp-query", "application/timestamp-query"),

  /**
   * timestamp-reply
   */
  APPLICATION_TIMESTAMP_REPLY( "timestamp-reply", "application/timestamp-reply"),

  /**
   * Time Stamped Data Envelope
   */
  APPLICATION_TIMESTAMPED_DATA( "Time Stamped Data Envelope", "application/timestamped-data"),

  /**
   * tlsrpt+gzip
   */
  APPLICATION_TLSRPT_GZIP( "tlsrpt+gzip", "application/tlsrpt+gzip"),

  /**
   * tlsrpt+json
   */
  APPLICATION_TLSRPT_JSON( "tlsrpt+json", "application/tlsrpt+json"),

  /**
   * tnauthlist
   */
  APPLICATION_TNAUTHLIST( "tnauthlist", "application/tnauthlist"),

  /**
   * trickle-ice-sdpfrag
   */
  APPLICATION_TRICKLE_ICE_SDPFRAG( "trickle-ice-sdpfrag", "application/trickle-ice-sdpfrag"),

  /**
   * trig
   */
  APPLICATION_TRIG( "trig", "application/trig"),

  /**
   * ttml+xml
   */
  APPLICATION_TTML_XML( "ttml+xml", "application/ttml+xml"),

  /**
   * tve-trigger
   */
  APPLICATION_TVE_TRIGGER( "tve-trigger", "application/tve-trigger"),

  /**
   * tzif
   */
  APPLICATION_TZIF( "tzif", "application/tzif"),

  /**
   * tzif-leap
   */
  APPLICATION_TZIF_LEAP( "tzif-leap", "application/tzif-leap"),

  /**
   * ulpfec
   */
  APPLICATION_ULPFEC( "ulpfec", "application/ulpfec"),

  /**
   * urc-grpsheet+xml
   */
  APPLICATION_URC_GRPSHEET_XML( "urc-grpsheet+xml", "application/urc-grpsheet+xml"),

  /**
   * urc-ressheet+xml
   */
  APPLICATION_URC_RESSHEET_XML( "urc-ressheet+xml", "application/urc-ressheet+xml"),

  /**
   * urc-targetdesc+xml
   */
  APPLICATION_URC_TARGETDESC_XML( "urc-targetdesc+xml", "application/urc-targetdesc+xml"),

  /**
   * urc-uisocketdesc+xml
   */
  APPLICATION_URC_UISOCKETDESC_XML( "urc-uisocketdesc+xml", "application/urc-uisocketdesc+xml"),

  /**
   * vcard+json
   */
  APPLICATION_VCARD_JSON( "vcard+json", "application/vcard+json"),

  /**
   * vcard+xml
   */
  APPLICATION_VCARD_XML( "vcard+xml", "application/vcard+xml"),

  /**
   * vemmi
   */
  APPLICATION_VEMMI( "vemmi", "application/vemmi"),

  /**
   * vnd.1000minds.decision-model+xml
   */
  APPLICATION_VND_1000MINDS_DECISION_MODEL_XML( "vnd.1000minds.decision-model+xml", "application/vnd.1000minds.decision-model+xml"),

  /**
   * vnd.3gpp-prose+xml
   */
  APPLICATION_VND_3GPP_PROSE_XML( "vnd.3gpp-prose+xml", "application/vnd.3gpp-prose+xml"),

  /**
   * vnd.3gpp-prose-pc3ch+xml
   */
  APPLICATION_VND_3GPP_PROSE_PC3CH_XML( "vnd.3gpp-prose-pc3ch+xml", "application/vnd.3gpp-prose-pc3ch+xml"),

  /**
   * vnd.3gpp-v2x-local-service-information
   */
  APPLICATION_VND_3GPP_V2X_LOCAL_SERVICE_INFORMATION( "vnd.3gpp-v2x-local-service-information", "application/vnd.3gpp-v2x-local-service-information"),

  /**
   * vnd.3gpp.GMOP+xml
   */
  APPLICATION_VND_3GPP_GMOP_XML( "vnd.3gpp.GMOP+xml", "application/vnd.3gpp.GMOP+xml"),

  /**
   * vnd.3gpp.SRVCC-info+xml
   */
  APPLICATION_VND_3GPP_SRVCC_INFO_XML( "vnd.3gpp.SRVCC-info+xml", "application/vnd.3gpp.SRVCC-info+xml"),

  /**
   * vnd.3gpp.access-transfer-events+xml
   */
  APPLICATION_VND_3GPP_ACCESS_TRANSFER_EVENTS_XML( "vnd.3gpp.access-transfer-events+xml", "application/vnd.3gpp.access-transfer-events+xml"),

  /**
   * vnd.3gpp.bsf+xml
   */
  APPLICATION_VND_3GPP_BSF_XML( "vnd.3gpp.bsf+xml", "application/vnd.3gpp.bsf+xml"),

  /**
   * vnd.3gpp.interworking-data
   */
  APPLICATION_VND_3GPP_INTERWORKING_DATA( "vnd.3gpp.interworking-data", "application/vnd.3gpp.interworking-data"),

  /**
   * vnd.3gpp.mc-signalling-ear
   */
  APPLICATION_VND_3GPP_MC_SIGNALLING_EAR( "vnd.3gpp.mc-signalling-ear", "application/vnd.3gpp.mc-signalling-ear"),

  /**
   * vnd.3gpp.mcdata-affiliation-command+xml
   */
  APPLICATION_VND_3GPP_MCDATA_AFFILIATION_COMMAND_XML( "vnd.3gpp.mcdata-affiliation-command+xml", "application/vnd.3gpp.mcdata-affiliation-command+xml"),

  /**
   * vnd.3gpp.mcdata-info+xml
   */
  APPLICATION_VND_3GPP_MCDATA_INFO_XML( "vnd.3gpp.mcdata-info+xml", "application/vnd.3gpp.mcdata-info+xml"),

  /**
   * vnd.3gpp.mcdata-payload
   */
  APPLICATION_VND_3GPP_MCDATA_PAYLOAD( "vnd.3gpp.mcdata-payload", "application/vnd.3gpp.mcdata-payload"),

  /**
   * vnd.3gpp.mcdata-service-config+xml
   */
  APPLICATION_VND_3GPP_MCDATA_SERVICE_CONFIG_XML( "vnd.3gpp.mcdata-service-config+xml", "application/vnd.3gpp.mcdata-service-config+xml"),

  /**
   * vnd.3gpp.mcdata-signalling
   */
  APPLICATION_VND_3GPP_MCDATA_SIGNALLING( "vnd.3gpp.mcdata-signalling", "application/vnd.3gpp.mcdata-signalling"),

  /**
   * vnd.3gpp.mcdata-ue-config+xml
   */
  APPLICATION_VND_3GPP_MCDATA_UE_CONFIG_XML( "vnd.3gpp.mcdata-ue-config+xml", "application/vnd.3gpp.mcdata-ue-config+xml"),

  /**
   * vnd.3gpp.mcdata-user-profile+xml
   */
  APPLICATION_VND_3GPP_MCDATA_USER_PROFILE_XML( "vnd.3gpp.mcdata-user-profile+xml", "application/vnd.3gpp.mcdata-user-profile+xml"),

  /**
   * vnd.3gpp.mcptt-affiliation-command+xml
   */
  APPLICATION_VND_3GPP_MCPTT_AFFILIATION_COMMAND_XML( "vnd.3gpp.mcptt-affiliation-command+xml", "application/vnd.3gpp.mcptt-affiliation-command+xml"),

  /**
   * vnd.3gpp.mcptt-floor-request+xml
   */
  APPLICATION_VND_3GPP_MCPTT_FLOOR_REQUEST_XML( "vnd.3gpp.mcptt-floor-request+xml", "application/vnd.3gpp.mcptt-floor-request+xml"),

  /**
   * vnd.3gpp.mcptt-info+xml
   */
  APPLICATION_VND_3GPP_MCPTT_INFO_XML( "vnd.3gpp.mcptt-info+xml", "application/vnd.3gpp.mcptt-info+xml"),

  /**
   * vnd.3gpp.mcptt-location-info+xml
   */
  APPLICATION_VND_3GPP_MCPTT_LOCATION_INFO_XML( "vnd.3gpp.mcptt-location-info+xml", "application/vnd.3gpp.mcptt-location-info+xml"),

  /**
   * vnd.3gpp.mcptt-mbms-usage-info+xml
   */
  APPLICATION_VND_3GPP_MCPTT_MBMS_USAGE_INFO_XML( "vnd.3gpp.mcptt-mbms-usage-info+xml", "application/vnd.3gpp.mcptt-mbms-usage-info+xml"),

  /**
   * vnd.3gpp.mcptt-service-config+xml
   */
  APPLICATION_VND_3GPP_MCPTT_SERVICE_CONFIG_XML( "vnd.3gpp.mcptt-service-config+xml", "application/vnd.3gpp.mcptt-service-config+xml"),

  /**
   * vnd.3gpp.mcptt-signed+xml
   */
  APPLICATION_VND_3GPP_MCPTT_SIGNED_XML( "vnd.3gpp.mcptt-signed+xml", "application/vnd.3gpp.mcptt-signed+xml"),

  /**
   * vnd.3gpp.mcptt-ue-config+xml
   */
  APPLICATION_VND_3GPP_MCPTT_UE_CONFIG_XML( "vnd.3gpp.mcptt-ue-config+xml", "application/vnd.3gpp.mcptt-ue-config+xml"),

  /**
   * vnd.3gpp.mcptt-ue-init-config+xml
   */
  APPLICATION_VND_3GPP_MCPTT_UE_INIT_CONFIG_XML( "vnd.3gpp.mcptt-ue-init-config+xml", "application/vnd.3gpp.mcptt-ue-init-config+xml"),

  /**
   * vnd.3gpp.mcptt-user-profile+xml
   */
  APPLICATION_VND_3GPP_MCPTT_USER_PROFILE_XML( "vnd.3gpp.mcptt-user-profile+xml", "application/vnd.3gpp.mcptt-user-profile+xml"),

  /**
   * vnd.3gpp.mcvideo-affiliation-command+xml
   */
  APPLICATION_VND_3GPP_MCVIDEO_AFFILIATION_COMMAND_XML( "vnd.3gpp.mcvideo-affiliation-command+xml", "application/vnd.3gpp.mcvideo-affiliation-command+xml"),

  /**
   * vnd.3gpp.mcvideo-affiliation-info+xml - OBSOLETED in favor of application/vnd.3gpp.mcvideo-info+xml
   */
  APPLICATION_VND_3GPP_MCVIDEO_AFFILIATION_INFO_XML( "vnd.3gpp.mcvideo-affiliation-info+xml - OBSOLETED in favor of application/vnd.3gpp.mcvideo-info+xml", "application/vnd.3gpp.mcvideo-affiliation-info+xml"),

  /**
   * vnd.3gpp.mcvideo-info+xml
   */
  APPLICATION_VND_3GPP_MCVIDEO_INFO_XML( "vnd.3gpp.mcvideo-info+xml", "application/vnd.3gpp.mcvideo-info+xml"),

  /**
   * vnd.3gpp.mcvideo-location-info+xml
   */
  APPLICATION_VND_3GPP_MCVIDEO_LOCATION_INFO_XML( "vnd.3gpp.mcvideo-location-info+xml", "application/vnd.3gpp.mcvideo-location-info+xml"),

  /**
   * vnd.3gpp.mcvideo-mbms-usage-info+xml
   */
  APPLICATION_VND_3GPP_MCVIDEO_MBMS_USAGE_INFO_XML( "vnd.3gpp.mcvideo-mbms-usage-info+xml", "application/vnd.3gpp.mcvideo-mbms-usage-info+xml"),

  /**
   * vnd.3gpp.mcvideo-service-config+xml
   */
  APPLICATION_VND_3GPP_MCVIDEO_SERVICE_CONFIG_XML( "vnd.3gpp.mcvideo-service-config+xml", "application/vnd.3gpp.mcvideo-service-config+xml"),

  /**
   * vnd.3gpp.mcvideo-transmission-request+xml
   */
  APPLICATION_VND_3GPP_MCVIDEO_TRANSMISSION_REQUEST_XML( "vnd.3gpp.mcvideo-transmission-request+xml", "application/vnd.3gpp.mcvideo-transmission-request+xml"),

  /**
   * vnd.3gpp.mcvideo-ue-config+xml
   */
  APPLICATION_VND_3GPP_MCVIDEO_UE_CONFIG_XML( "vnd.3gpp.mcvideo-ue-config+xml", "application/vnd.3gpp.mcvideo-ue-config+xml"),

  /**
   * vnd.3gpp.mcvideo-user-profile+xml
   */
  APPLICATION_VND_3GPP_MCVIDEO_USER_PROFILE_XML( "vnd.3gpp.mcvideo-user-profile+xml", "application/vnd.3gpp.mcvideo-user-profile+xml"),

  /**
   * vnd.3gpp.mid-call+xml
   */
  APPLICATION_VND_3GPP_MID_CALL_XML( "vnd.3gpp.mid-call+xml", "application/vnd.3gpp.mid-call+xml"),

  /**
   * 3rd Generation Partnership Project - Pic Large
   */
  APPLICATION_VND_3GPP_PIC_BW_LARGE( "3rd Generation Partnership Project - Pic Large", "application/vnd.3gpp.pic-bw-large"),

  /**
   * 3rd Generation Partnership Project - Pic Small
   */
  APPLICATION_VND_3GPP_PIC_BW_SMALL( "3rd Generation Partnership Project - Pic Small", "application/vnd.3gpp.pic-bw-small"),

  /**
   * 3rd Generation Partnership Project - Pic Var
   */
  APPLICATION_VND_3GPP_PIC_BW_VAR( "3rd Generation Partnership Project - Pic Var", "application/vnd.3gpp.pic-bw-var"),

  /**
   * vnd.3gpp.sms
   */
  APPLICATION_VND_3GPP_SMS( "vnd.3gpp.sms", "application/vnd.3gpp.sms"),

  /**
   * vnd.3gpp.sms+xml
   */
  APPLICATION_VND_3GPP_SMS_XML( "vnd.3gpp.sms+xml", "application/vnd.3gpp.sms+xml"),

  /**
   * vnd.3gpp.srvcc-ext+xml
   */
  APPLICATION_VND_3GPP_SRVCC_EXT_XML( "vnd.3gpp.srvcc-ext+xml", "application/vnd.3gpp.srvcc-ext+xml"),

  /**
   * vnd.3gpp.state-and-event-info+xml
   */
  APPLICATION_VND_3GPP_STATE_AND_EVENT_INFO_XML( "vnd.3gpp.state-and-event-info+xml", "application/vnd.3gpp.state-and-event-info+xml"),

  /**
   * vnd.3gpp.ussd+xml
   */
  APPLICATION_VND_3GPP_USSD_XML( "vnd.3gpp.ussd+xml", "application/vnd.3gpp.ussd+xml"),

  /**
   * vnd.3gpp2.bcmcsinfo+xml
   */
  APPLICATION_VND_3GPP2_BCMCSINFO_XML( "vnd.3gpp2.bcmcsinfo+xml", "application/vnd.3gpp2.bcmcsinfo+xml"),

  /**
   * vnd.3gpp2.sms
   */
  APPLICATION_VND_3GPP2_SMS( "vnd.3gpp2.sms", "application/vnd.3gpp2.sms"),

  /**
   * 3rd Generation Partnership Project - Transaction Capabilities Application Part
   */
  APPLICATION_VND_3GPP2_TCAP( "3rd Generation Partnership Project - Transaction Capabilities Application Part", "application/vnd.3gpp2.tcap"),

  /**
   * vnd.3lightssoftware.imagescal
   */
  APPLICATION_VND_3LIGHTSSOFTWARE_IMAGESCAL( "vnd.3lightssoftware.imagescal", "application/vnd.3lightssoftware.imagescal"),

  /**
   * 3M Post It Notes
   */
  APPLICATION_VND_3M_POST_IT_NOTES( "3M Post It Notes", "application/vnd.3m.post-it-notes"),

  /**
   * vnd.RenLearn.rlprint
   */
  APPLICATION_VND_RENLEARN_RLPRINT( "vnd.RenLearn.rlprint", "application/vnd.RenLearn.rlprint"),

  /**
   * Simply Accounting
   */
  APPLICATION_VND_ACCPAC_SIMPLY_ASO( "Simply Accounting", "application/vnd.accpac.simply.aso"),

  /**
   * Simply Accounting - Data Import
   */
  APPLICATION_VND_ACCPAC_SIMPLY_IMP( "Simply Accounting - Data Import", "application/vnd.accpac.simply.imp"),

  /**
   * ACU Cobol
   */
  APPLICATION_VND_ACUCOBOL( "ACU Cobol", "application/vnd.acucobol"),

  /**
   * ACU Cobol
   */
  APPLICATION_VND_ACUCORP( "ACU Cobol", "application/vnd.acucorp"),

  /**
   * Adobe AIR Application
   */
  APPLICATION_VND_ADOBE_AIR_APPLICATION_INSTALLER_PACKAGE_ZIP( "Adobe AIR Application", "application/vnd.adobe.air-application-installer-package+zip"),

  /**
   * vnd.adobe.flash.movie
   */
  APPLICATION_VND_ADOBE_FLASH_MOVIE( "vnd.adobe.flash.movie", "application/vnd.adobe.flash.movie"),

  /**
   * vnd.adobe.formscentral.fcdt
   */
  APPLICATION_VND_ADOBE_FORMSCENTRAL_FCDT( "vnd.adobe.formscentral.fcdt", "application/vnd.adobe.formscentral.fcdt"),

  /**
   * Adobe Flex Project
   */
  APPLICATION_VND_ADOBE_FXP( "Adobe Flex Project", "application/vnd.adobe.fxp"),

  /**
   * vnd.adobe.partial-upload
   */
  APPLICATION_VND_ADOBE_PARTIAL_UPLOAD( "vnd.adobe.partial-upload", "application/vnd.adobe.partial-upload"),

  /**
   * Adobe XML Data Package
   */
  APPLICATION_VND_ADOBE_XDP_XML( "Adobe XML Data Package", "application/vnd.adobe.xdp+xml"),

  /**
   * Adobe XML Forms Data Format
   */
  APPLICATION_VND_ADOBE_XFDF( "Adobe XML Forms Data Format", "application/vnd.adobe.xfdf"),

  /**
   * vnd.aether.imp
   */
  APPLICATION_VND_AETHER_IMP( "vnd.aether.imp", "application/vnd.aether.imp"),

  /**
   * vnd.afpc.afplinedata
   */
  APPLICATION_VND_AFPC_AFPLINEDATA( "vnd.afpc.afplinedata", "application/vnd.afpc.afplinedata"),

  /**
   * vnd.afpc.afplinedata-pagedef
   */
  APPLICATION_VND_AFPC_AFPLINEDATA_PAGEDEF( "vnd.afpc.afplinedata-pagedef", "application/vnd.afpc.afplinedata-pagedef"),

  /**
   * vnd.afpc.cmoca-cmresource
   */
  APPLICATION_VND_AFPC_CMOCA_CMRESOURCE( "vnd.afpc.cmoca-cmresource", "application/vnd.afpc.cmoca-cmresource"),

  /**
   * vnd.afpc.foca-charset
   */
  APPLICATION_VND_AFPC_FOCA_CHARSET( "vnd.afpc.foca-charset", "application/vnd.afpc.foca-charset"),

  /**
   * vnd.afpc.foca-codedfont
   */
  APPLICATION_VND_AFPC_FOCA_CODEDFONT( "vnd.afpc.foca-codedfont", "application/vnd.afpc.foca-codedfont"),

  /**
   * vnd.afpc.foca-codepage
   */
  APPLICATION_VND_AFPC_FOCA_CODEPAGE( "vnd.afpc.foca-codepage", "application/vnd.afpc.foca-codepage"),

  /**
   * vnd.afpc.modca
   */
  APPLICATION_VND_AFPC_MODCA( "vnd.afpc.modca", "application/vnd.afpc.modca"),

  /**
   * vnd.afpc.modca-cmtable
   */
  APPLICATION_VND_AFPC_MODCA_CMTABLE( "vnd.afpc.modca-cmtable", "application/vnd.afpc.modca-cmtable"),

  /**
   * vnd.afpc.modca-formdef
   */
  APPLICATION_VND_AFPC_MODCA_FORMDEF( "vnd.afpc.modca-formdef", "application/vnd.afpc.modca-formdef"),

  /**
   * vnd.afpc.modca-mediummap
   */
  APPLICATION_VND_AFPC_MODCA_MEDIUMMAP( "vnd.afpc.modca-mediummap", "application/vnd.afpc.modca-mediummap"),

  /**
   * vnd.afpc.modca-objectcontainer
   */
  APPLICATION_VND_AFPC_MODCA_OBJECTCONTAINER( "vnd.afpc.modca-objectcontainer", "application/vnd.afpc.modca-objectcontainer"),

  /**
   * vnd.afpc.modca-overlay
   */
  APPLICATION_VND_AFPC_MODCA_OVERLAY( "vnd.afpc.modca-overlay", "application/vnd.afpc.modca-overlay"),

  /**
   * vnd.afpc.modca-pagesegment
   */
  APPLICATION_VND_AFPC_MODCA_PAGESEGMENT( "vnd.afpc.modca-pagesegment", "application/vnd.afpc.modca-pagesegment"),

  /**
   * vnd.ah-barcode
   */
  APPLICATION_VND_AH_BARCODE( "vnd.ah-barcode", "application/vnd.ah-barcode"),

  /**
   * Ahead AIR Application
   */
  APPLICATION_VND_AHEAD_SPACE( "Ahead AIR Application", "application/vnd.ahead.space"),

  /**
   * AirZip FileSECURE
   */
  APPLICATION_VND_AIRZIP_FILESECURE_AZF( "AirZip FileSECURE", "application/vnd.airzip.filesecure.azf"),

  /**
   * AirZip FileSECURE
   */
  APPLICATION_VND_AIRZIP_FILESECURE_AZS( "AirZip FileSECURE", "application/vnd.airzip.filesecure.azs"),

  /**
   * vnd.amadeus+json
   */
  APPLICATION_VND_AMADEUS_JSON( "vnd.amadeus+json", "application/vnd.amadeus+json"),

  /**
   * Amazon Kindle eBook format
   */
  APPLICATION_VND_AMAZON_EBOOK( "Amazon Kindle eBook format", "application/vnd.amazon.ebook"),

  /**
   * vnd.amazon.mobi8-ebook
   */
  APPLICATION_VND_AMAZON_MOBI8_EBOOK( "vnd.amazon.mobi8-ebook", "application/vnd.amazon.mobi8-ebook"),

  /**
   * Active Content Compression
   */
  APPLICATION_VND_AMERICANDYNAMICS_ACC( "Active Content Compression", "application/vnd.americandynamics.acc"),

  /**
   * AmigaDE
   */
  APPLICATION_VND_AMIGA_AMI( "AmigaDE", "application/vnd.amiga.ami"),

  /**
   * vnd.amundsen.maze+xml
   */
  APPLICATION_VND_AMUNDSEN_MAZE_XML( "vnd.amundsen.maze+xml", "application/vnd.amundsen.maze+xml"),

  /**
   * vnd.android.ota
   */
  APPLICATION_VND_ANDROID_OTA( "vnd.android.ota", "application/vnd.android.ota"),

  /**
   * Android Package Archive
   */
  APPLICATION_VND_ANDROID_PACKAGE_ARCHIVE( "Android Package Archive", "application/vnd.android.package-archive"),

  /**
   * vnd.anki
   */
  APPLICATION_VND_ANKI( "vnd.anki", "application/vnd.anki"),

  /**
   * ANSER-WEB Terminal Client - Certificate Issue
   */
  APPLICATION_VND_ANSER_WEB_CERTIFICATE_ISSUE_INITIATION( "ANSER-WEB Terminal Client - Certificate Issue", "application/vnd.anser-web-certificate-issue-initiation"),

  /**
   * ANSER-WEB Terminal Client - Web Funds Transfer
   */
  APPLICATION_VND_ANSER_WEB_FUNDS_TRANSFER_INITIATION( "ANSER-WEB Terminal Client - Web Funds Transfer", "application/vnd.anser-web-funds-transfer-initiation"),

  /**
   * Antix Game Player
   */
  APPLICATION_VND_ANTIX_GAME_COMPONENT( "Antix Game Player", "application/vnd.antix.game-component"),

  /**
   * vnd.apache.thrift.binary
   */
  APPLICATION_VND_APACHE_THRIFT_BINARY( "vnd.apache.thrift.binary", "application/vnd.apache.thrift.binary"),

  /**
   * vnd.apache.thrift.compact
   */
  APPLICATION_VND_APACHE_THRIFT_COMPACT( "vnd.apache.thrift.compact", "application/vnd.apache.thrift.compact"),

  /**
   * vnd.apache.thrift.json
   */
  APPLICATION_VND_APACHE_THRIFT_JSON( "vnd.apache.thrift.json", "application/vnd.apache.thrift.json"),

  /**
   * vnd.api+json
   */
  APPLICATION_VND_API_JSON( "vnd.api+json", "application/vnd.api+json"),

  /**
   * vnd.aplextor.warrp+json
   */
  APPLICATION_VND_APLEXTOR_WARRP_JSON( "vnd.aplextor.warrp+json", "application/vnd.aplextor.warrp+json"),

  /**
   * vnd.apothekende.reservation+json
   */
  APPLICATION_VND_APOTHEKENDE_RESERVATION_JSON( "vnd.apothekende.reservation+json", "application/vnd.apothekende.reservation+json"),

  /**
   * Apple Installer Package
   */
  APPLICATION_VND_APPLE_INSTALLER_XML( "Apple Installer Package", "application/vnd.apple.installer+xml"),

  /**
   * vnd.apple.keynote
   */
  APPLICATION_VND_APPLE_KEYNOTE( "vnd.apple.keynote", "application/vnd.apple.keynote"),

  /**
   * Multimedia Playlist Unicode
   */
  APPLICATION_VND_APPLE_MPEGURL( "Multimedia Playlist Unicode", "application/vnd.apple.mpegurl"),

  /**
   * vnd.apple.numbers
   */
  APPLICATION_VND_APPLE_NUMBERS( "vnd.apple.numbers", "application/vnd.apple.numbers"),

  /**
   * vnd.apple.pages
   */
  APPLICATION_VND_APPLE_PAGES( "vnd.apple.pages", "application/vnd.apple.pages"),

  /**
   * vnd.arastra.swi - OBSOLETED in favor of application/vnd.aristanetworks.swi
   */
  APPLICATION_VND_ARASTRA_SWI( "vnd.arastra.swi - OBSOLETED in favor of application/vnd.aristanetworks.swi", "application/vnd.arastra.swi"),

  /**
   * Arista Networks Software Image
   */
  APPLICATION_VND_ARISTANETWORKS_SWI( "Arista Networks Software Image", "application/vnd.aristanetworks.swi"),

  /**
   * vnd.artisan+json
   */
  APPLICATION_VND_ARTISAN_JSON( "vnd.artisan+json", "application/vnd.artisan+json"),

  /**
   * vnd.artsquare
   */
  APPLICATION_VND_ARTSQUARE( "vnd.artsquare", "application/vnd.artsquare"),

  /**
   * vnd.astraea-software.iota
   */
  APPLICATION_VND_ASTRAEA_SOFTWARE_IOTA( "vnd.astraea-software.iota", "application/vnd.astraea-software.iota"),

  /**
   * Audiograph
   */
  APPLICATION_VND_AUDIOGRAPH( "Audiograph", "application/vnd.audiograph"),

  /**
   * vnd.autopackage
   */
  APPLICATION_VND_AUTOPACKAGE( "vnd.autopackage", "application/vnd.autopackage"),

  /**
   * vnd.avalon+json
   */
  APPLICATION_VND_AVALON_JSON( "vnd.avalon+json", "application/vnd.avalon+json"),

  /**
   * vnd.avistar+xml
   */
  APPLICATION_VND_AVISTAR_XML( "vnd.avistar+xml", "application/vnd.avistar+xml"),

  /**
   * vnd.balsamiq.bmml+xml
   */
  APPLICATION_VND_BALSAMIQ_BMML_XML( "vnd.balsamiq.bmml+xml", "application/vnd.balsamiq.bmml+xml"),

  /**
   * vnd.balsamiq.bmpr
   */
  APPLICATION_VND_BALSAMIQ_BMPR( "vnd.balsamiq.bmpr", "application/vnd.balsamiq.bmpr"),

  /**
   * vnd.banana-accounting
   */
  APPLICATION_VND_BANANA_ACCOUNTING( "vnd.banana-accounting", "application/vnd.banana-accounting"),

  /**
   * vnd.bbf.usp.error
   */
  APPLICATION_VND_BBF_USP_ERROR( "vnd.bbf.usp.error", "application/vnd.bbf.usp.error"),

  /**
   * vnd.bbf.usp.msg
   */
  APPLICATION_VND_BBF_USP_MSG( "vnd.bbf.usp.msg", "application/vnd.bbf.usp.msg"),

  /**
   * vnd.bbf.usp.msg+json
   */
  APPLICATION_VND_BBF_USP_MSG_JSON( "vnd.bbf.usp.msg+json", "application/vnd.bbf.usp.msg+json"),

  /**
   * vnd.bekitzur-stech+json
   */
  APPLICATION_VND_BEKITZUR_STECH_JSON( "vnd.bekitzur-stech+json", "application/vnd.bekitzur-stech+json"),

  /**
   * vnd.bint.med-content
   */
  APPLICATION_VND_BINT_MED_CONTENT( "vnd.bint.med-content", "application/vnd.bint.med-content"),

  /**
   * vnd.biopax.rdf+xml
   */
  APPLICATION_VND_BIOPAX_RDF_XML( "vnd.biopax.rdf+xml", "application/vnd.biopax.rdf+xml"),

  /**
   * vnd.blink-idb-value-wrapper
   */
  APPLICATION_VND_BLINK_IDB_VALUE_WRAPPER( "vnd.blink-idb-value-wrapper", "application/vnd.blink-idb-value-wrapper"),

  /**
   * Blueice Research Multipass
   */
  APPLICATION_VND_BLUEICE_MULTIPASS( "Blueice Research Multipass", "application/vnd.blueice.multipass"),

  /**
   * vnd.bluetooth.ep.oob
   */
  APPLICATION_VND_BLUETOOTH_EP_OOB( "vnd.bluetooth.ep.oob", "application/vnd.bluetooth.ep.oob"),

  /**
   * vnd.bluetooth.le.oob
   */
  APPLICATION_VND_BLUETOOTH_LE_OOB( "vnd.bluetooth.le.oob", "application/vnd.bluetooth.le.oob"),

  /**
   * BMI Drawing Data Interchange
   */
  APPLICATION_VND_BMI( "BMI Drawing Data Interchange", "application/vnd.bmi"),

  /**
   * vnd.bpf
   */
  APPLICATION_VND_BPF( "vnd.bpf", "application/vnd.bpf"),

  /**
   * vnd.bpf3
   */
  APPLICATION_VND_BPF3( "vnd.bpf3", "application/vnd.bpf3"),

  /**
   * BusinessObjects
   */
  APPLICATION_VND_BUSINESSOBJECTS( "BusinessObjects", "application/vnd.businessobjects"),

  /**
   * vnd.byu.uapi+json
   */
  APPLICATION_VND_BYU_UAPI_JSON( "vnd.byu.uapi+json", "application/vnd.byu.uapi+json"),

  /**
   * vnd.cab-jscript
   */
  APPLICATION_VND_CAB_JSCRIPT( "vnd.cab-jscript", "application/vnd.cab-jscript"),

  /**
   * vnd.canon-cpdl
   */
  APPLICATION_VND_CANON_CPDL( "vnd.canon-cpdl", "application/vnd.canon-cpdl"),

  /**
   * vnd.canon-lips
   */
  APPLICATION_VND_CANON_LIPS( "vnd.canon-lips", "application/vnd.canon-lips"),

  /**
   * vnd.capasystems-pg+json
   */
  APPLICATION_VND_CAPASYSTEMS_PG_JSON( "vnd.capasystems-pg+json", "application/vnd.capasystems-pg+json"),

  /**
   * vnd.cendio.thinlinc.clientconf
   */
  APPLICATION_VND_CENDIO_THINLINC_CLIENTCONF( "vnd.cendio.thinlinc.clientconf", "application/vnd.cendio.thinlinc.clientconf"),

  /**
   * vnd.century-systems.tcp_stream
   */
  APPLICATION_VND_CENTURY_SYSTEMS_TCP_STREAM( "vnd.century-systems.tcp_stream", "application/vnd.century-systems.tcp_stream"),

  /**
   * CambridgeSoft Chem Draw
   */
  APPLICATION_VND_CHEMDRAW_XML( "CambridgeSoft Chem Draw", "application/vnd.chemdraw+xml"),

  /**
   * vnd.chess-pgn
   */
  APPLICATION_VND_CHESS_PGN( "vnd.chess-pgn", "application/vnd.chess-pgn"),

  /**
   * Karaoke on Chipnuts Chipsets
   */
  APPLICATION_VND_CHIPNUTS_KARAOKE_MMD( "Karaoke on Chipnuts Chipsets", "application/vnd.chipnuts.karaoke-mmd"),

  /**
   * vnd.ciedi
   */
  APPLICATION_VND_CIEDI( "vnd.ciedi", "application/vnd.ciedi"),

  /**
   * Interactive Geometry Software Cinderella
   */
  APPLICATION_VND_CINDERELLA( "Interactive Geometry Software Cinderella", "application/vnd.cinderella"),

  /**
   * vnd.cirpack.isdn-ext
   */
  APPLICATION_VND_CIRPACK_ISDN_EXT( "vnd.cirpack.isdn-ext", "application/vnd.cirpack.isdn-ext"),

  /**
   * vnd.citationstyles.style+xml
   */
  APPLICATION_VND_CITATIONSTYLES_STYLE_XML( "vnd.citationstyles.style+xml", "application/vnd.citationstyles.style+xml"),

  /**
   * Claymore Data Files
   */
  APPLICATION_VND_CLAYMORE( "Claymore Data Files", "application/vnd.claymore"),

  /**
   * RetroPlatform Player
   */
  APPLICATION_VND_CLOANTO_RP9( "RetroPlatform Player", "application/vnd.cloanto.rp9"),

  /**
   * Clonk Game
   */
  APPLICATION_VND_CLONK_C4GROUP( "Clonk Game", "application/vnd.clonk.c4group"),

  /**
   * ClueTrust CartoMobile - Config
   */
  APPLICATION_VND_CLUETRUST_CARTOMOBILE_CONFIG( "ClueTrust CartoMobile - Config", "application/vnd.cluetrust.cartomobile-config"),

  /**
   * ClueTrust CartoMobile - Config Package
   */
  APPLICATION_VND_CLUETRUST_CARTOMOBILE_CONFIG_PKG( "ClueTrust CartoMobile - Config Package", "application/vnd.cluetrust.cartomobile-config-pkg"),

  /**
   * vnd.coffeescript
   */
  APPLICATION_VND_COFFEESCRIPT( "vnd.coffeescript", "application/vnd.coffeescript"),

  /**
   * vnd.collabio.xodocuments.document
   */
  APPLICATION_VND_COLLABIO_XODOCUMENTS_DOCUMENT( "vnd.collabio.xodocuments.document", "application/vnd.collabio.xodocuments.document"),

  /**
   * vnd.collabio.xodocuments.document-template
   */
  APPLICATION_VND_COLLABIO_XODOCUMENTS_DOCUMENT_TEMPLATE( "vnd.collabio.xodocuments.document-template", "application/vnd.collabio.xodocuments.document-template"),

  /**
   * vnd.collabio.xodocuments.presentation
   */
  APPLICATION_VND_COLLABIO_XODOCUMENTS_PRESENTATION( "vnd.collabio.xodocuments.presentation", "application/vnd.collabio.xodocuments.presentation"),

  /**
   * vnd.collabio.xodocuments.presentation-template
   */
  APPLICATION_VND_COLLABIO_XODOCUMENTS_PRESENTATION_TEMPLATE( "vnd.collabio.xodocuments.presentation-template", "application/vnd.collabio.xodocuments.presentation-template"),

  /**
   * vnd.collabio.xodocuments.spreadsheet
   */
  APPLICATION_VND_COLLABIO_XODOCUMENTS_SPREADSHEET( "vnd.collabio.xodocuments.spreadsheet", "application/vnd.collabio.xodocuments.spreadsheet"),

  /**
   * vnd.collabio.xodocuments.spreadsheet-template
   */
  APPLICATION_VND_COLLABIO_XODOCUMENTS_SPREADSHEET_TEMPLATE( "vnd.collabio.xodocuments.spreadsheet-template", "application/vnd.collabio.xodocuments.spreadsheet-template"),

  /**
   * vnd.collection+json
   */
  APPLICATION_VND_COLLECTION_JSON( "vnd.collection+json", "application/vnd.collection+json"),

  /**
   * vnd.collection.doc+json
   */
  APPLICATION_VND_COLLECTION_DOC_JSON( "vnd.collection.doc+json", "application/vnd.collection.doc+json"),

  /**
   * vnd.collection.next+json
   */
  APPLICATION_VND_COLLECTION_NEXT_JSON( "vnd.collection.next+json", "application/vnd.collection.next+json"),

  /**
   * vnd.comicbook+zip
   */
  APPLICATION_VND_COMICBOOK_ZIP( "vnd.comicbook+zip", "application/vnd.comicbook+zip"),

  /**
   * vnd.comicbook-rar
   */
  APPLICATION_VND_COMICBOOK_RAR( "vnd.comicbook-rar", "application/vnd.comicbook-rar"),

  /**
   * vnd.commerce-battelle
   */
  APPLICATION_VND_COMMERCE_BATTELLE( "vnd.commerce-battelle", "application/vnd.commerce-battelle"),

  /**
   * Sixth Floor Media - CommonSpace
   */
  APPLICATION_VND_COMMONSPACE( "Sixth Floor Media - CommonSpace", "application/vnd.commonspace"),

  /**
   * CIM Database
   */
  APPLICATION_VND_CONTACT_CMSG( "CIM Database", "application/vnd.contact.cmsg"),

  /**
   * vnd.coreos.ignition+json
   */
  APPLICATION_VND_COREOS_IGNITION_JSON( "vnd.coreos.ignition+json", "application/vnd.coreos.ignition+json"),

  /**
   * CosmoCaller
   */
  APPLICATION_VND_COSMOCALLER( "CosmoCaller", "application/vnd.cosmocaller"),

  /**
   * CrickSoftware - Clicker
   */
  APPLICATION_VND_CRICK_CLICKER( "CrickSoftware - Clicker", "application/vnd.crick.clicker"),

  /**
   * CrickSoftware - Clicker - Keyboard
   */
  APPLICATION_VND_CRICK_CLICKER_KEYBOARD( "CrickSoftware - Clicker - Keyboard", "application/vnd.crick.clicker.keyboard"),

  /**
   * CrickSoftware - Clicker - Palette
   */
  APPLICATION_VND_CRICK_CLICKER_PALETTE( "CrickSoftware - Clicker - Palette", "application/vnd.crick.clicker.palette"),

  /**
   * CrickSoftware - Clicker - Template
   */
  APPLICATION_VND_CRICK_CLICKER_TEMPLATE( "CrickSoftware - Clicker - Template", "application/vnd.crick.clicker.template"),

  /**
   * CrickSoftware - Clicker - Wordbank
   */
  APPLICATION_VND_CRICK_CLICKER_WORDBANK( "CrickSoftware - Clicker - Wordbank", "application/vnd.crick.clicker.wordbank"),

  /**
   * Critical Tools - PERT Chart EXPERT
   */
  APPLICATION_VND_CRITICALTOOLS_WBS_XML( "Critical Tools - PERT Chart EXPERT", "application/vnd.criticaltools.wbs+xml"),

  /**
   * vnd.cryptii.pipe+json
   */
  APPLICATION_VND_CRYPTII_PIPE_JSON( "vnd.cryptii.pipe+json", "application/vnd.cryptii.pipe+json"),

  /**
   * vnd.crypto-shade-file
   */
  APPLICATION_VND_CRYPTO_SHADE_FILE( "vnd.crypto-shade-file", "application/vnd.crypto-shade-file"),

  /**
   * PosML
   */
  APPLICATION_VND_CTC_POSML( "PosML", "application/vnd.ctc-posml"),

  /**
   * vnd.ctct.ws+xml
   */
  APPLICATION_VND_CTCT_WS_XML( "vnd.ctct.ws+xml", "application/vnd.ctct.ws+xml"),

  /**
   * vnd.cups-pdf
   */
  APPLICATION_VND_CUPS_PDF( "vnd.cups-pdf", "application/vnd.cups-pdf"),

  /**
   * vnd.cups-postscript
   */
  APPLICATION_VND_CUPS_POSTSCRIPT( "vnd.cups-postscript", "application/vnd.cups-postscript"),

  /**
   * Adobe PostScript Printer Description File Format
   */
  APPLICATION_VND_CUPS_PPD( "Adobe PostScript Printer Description File Format", "application/vnd.cups-ppd"),

  /**
   * vnd.cups-raster
   */
  APPLICATION_VND_CUPS_RASTER( "vnd.cups-raster", "application/vnd.cups-raster"),

  /**
   * vnd.cups-raw
   */
  APPLICATION_VND_CUPS_RAW( "vnd.cups-raw", "application/vnd.cups-raw"),

  /**
   * vnd.curl
   */
  APPLICATION_VND_CURL( "vnd.curl", "application/vnd.curl"),

  /**
   * CURL Applet
   */
  APPLICATION_VND_CURL_CAR( "CURL Applet", "application/vnd.curl.car"),

  /**
   * CURL Applet
   */
  APPLICATION_VND_CURL_PCURL( "CURL Applet", "application/vnd.curl.pcurl"),

  /**
   * vnd.cyan.dean.root+xml
   */
  APPLICATION_VND_CYAN_DEAN_ROOT_XML( "vnd.cyan.dean.root+xml", "application/vnd.cyan.dean.root+xml"),

  /**
   * vnd.cybank
   */
  APPLICATION_VND_CYBANK( "vnd.cybank", "application/vnd.cybank"),

  /**
   * vnd.d2l.coursepackage1p0+zip
   */
  APPLICATION_VND_D2L_COURSEPACKAGE1P0_ZIP( "vnd.d2l.coursepackage1p0+zip", "application/vnd.d2l.coursepackage1p0+zip"),

  /**
   * vnd.d3m-dataset
   */
  APPLICATION_VND_D3M_DATASET( "vnd.d3m-dataset", "application/vnd.d3m-dataset"),

  /**
   * vnd.d3m-problem
   */
  APPLICATION_VND_D3M_PROBLEM( "vnd.d3m-problem", "application/vnd.d3m-problem"),

  /**
   * vnd.dart
   */
  APPLICATION_VND_DART( "vnd.dart", "application/vnd.dart"),

  /**
   * RemoteDocs R-Viewer
   */
  APPLICATION_VND_DATA_VISION_RDZ( "RemoteDocs R-Viewer", "application/vnd.data-vision.rdz"),

  /**
   * vnd.datapackage+json
   */
  APPLICATION_VND_DATAPACKAGE_JSON( "vnd.datapackage+json", "application/vnd.datapackage+json"),

  /**
   * vnd.dataresource+json
   */
  APPLICATION_VND_DATARESOURCE_JSON( "vnd.dataresource+json", "application/vnd.dataresource+json"),

  /**
   * vnd.dbf
   */
  APPLICATION_VND_DBF( "vnd.dbf", "application/vnd.dbf"),

  /**
   * vnd.debian.binary-package
   */
  APPLICATION_VND_DEBIAN_BINARY_PACKAGE( "vnd.debian.binary-package", "application/vnd.debian.binary-package"),

  /**
   * vnd.dece.data
   */
  APPLICATION_VND_DECE_DATA( "vnd.dece.data", "application/vnd.dece.data"),

  /**
   * vnd.dece.ttml+xml
   */
  APPLICATION_VND_DECE_TTML_XML( "vnd.dece.ttml+xml", "application/vnd.dece.ttml+xml"),

  /**
   * vnd.dece.unspecified
   */
  APPLICATION_VND_DECE_UNSPECIFIED( "vnd.dece.unspecified", "application/vnd.dece.unspecified"),

  /**
   * vnd.dece.zip
   */
  APPLICATION_VND_DECE_ZIP( "vnd.dece.zip", "application/vnd.dece.zip"),

  /**
   * FCS Express Layout Link
   */
  APPLICATION_VND_DENOVO_FCSELAYOUT_LINK( "FCS Express Layout Link", "application/vnd.denovo.fcselayout-link"),

  /**
   * vnd.desmume.movie
   */
  APPLICATION_VND_DESMUME_MOVIE( "vnd.desmume.movie", "application/vnd.desmume.movie"),

  /**
   * vnd.dir-bi.plate-dl-nosuffix
   */
  APPLICATION_VND_DIR_BI_PLATE_DL_NOSUFFIX( "vnd.dir-bi.plate-dl-nosuffix", "application/vnd.dir-bi.plate-dl-nosuffix"),

  /**
   * vnd.dm.delegation+xml
   */
  APPLICATION_VND_DM_DELEGATION_XML( "vnd.dm.delegation+xml", "application/vnd.dm.delegation+xml"),

  /**
   * New Moon Liftoff/DNA
   */
  APPLICATION_VND_DNA( "New Moon Liftoff/DNA", "application/vnd.dna"),

  /**
   * vnd.document+json
   */
  APPLICATION_VND_DOCUMENT_JSON( "vnd.document+json", "application/vnd.document+json"),

  /**
   * Dolby Meridian Lossless Packing
   */
  APPLICATION_VND_DOLBY_MLP( "Dolby Meridian Lossless Packing", "application/vnd.dolby.mlp"),

  /**
   * vnd.dolby.mobile.1
   */
  APPLICATION_VND_DOLBY_MOBILE_1( "vnd.dolby.mobile.1", "application/vnd.dolby.mobile.1"),

  /**
   * vnd.dolby.mobile.2
   */
  APPLICATION_VND_DOLBY_MOBILE_2( "vnd.dolby.mobile.2", "application/vnd.dolby.mobile.2"),

  /**
   * vnd.doremir.scorecloud-binary-document
   */
  APPLICATION_VND_DOREMIR_SCORECLOUD_BINARY_DOCUMENT( "vnd.doremir.scorecloud-binary-document", "application/vnd.doremir.scorecloud-binary-document"),

  /**
   * DPGraph
   */
  APPLICATION_VND_DPGRAPH( "DPGraph", "application/vnd.dpgraph"),

  /**
   * DreamFactory
   */
  APPLICATION_VND_DREAMFACTORY( "DreamFactory", "application/vnd.dreamfactory"),

  /**
   * vnd.drive+json
   */
  APPLICATION_VND_DRIVE_JSON( "vnd.drive+json", "application/vnd.drive+json"),

  /**
   * vnd.dtg.local
   */
  APPLICATION_VND_DTG_LOCAL( "vnd.dtg.local", "application/vnd.dtg.local"),

  /**
   * vnd.dtg.local.flash
   */
  APPLICATION_VND_DTG_LOCAL_FLASH( "vnd.dtg.local.flash", "application/vnd.dtg.local.flash"),

  /**
   * vnd.dtg.local.html
   */
  APPLICATION_VND_DTG_LOCAL_HTML( "vnd.dtg.local.html", "application/vnd.dtg.local.html"),

  /**
   * Digital Video Broadcasting
   */
  APPLICATION_VND_DVB_AIT( "Digital Video Broadcasting", "application/vnd.dvb.ait"),

  /**
   * vnd.dvb.dvbisl+xml
   */
  APPLICATION_VND_DVB_DVBISL_XML( "vnd.dvb.dvbisl+xml", "application/vnd.dvb.dvbisl+xml"),

  /**
   * vnd.dvb.dvbj
   */
  APPLICATION_VND_DVB_DVBJ( "vnd.dvb.dvbj", "application/vnd.dvb.dvbj"),

  /**
   * vnd.dvb.esgcontainer
   */
  APPLICATION_VND_DVB_ESGCONTAINER( "vnd.dvb.esgcontainer", "application/vnd.dvb.esgcontainer"),

  /**
   * vnd.dvb.ipdcdftnotifaccess
   */
  APPLICATION_VND_DVB_IPDCDFTNOTIFACCESS( "vnd.dvb.ipdcdftnotifaccess", "application/vnd.dvb.ipdcdftnotifaccess"),

  /**
   * vnd.dvb.ipdcesgaccess
   */
  APPLICATION_VND_DVB_IPDCESGACCESS( "vnd.dvb.ipdcesgaccess", "application/vnd.dvb.ipdcesgaccess"),

  /**
   * vnd.dvb.ipdcesgaccess2
   */
  APPLICATION_VND_DVB_IPDCESGACCESS2( "vnd.dvb.ipdcesgaccess2", "application/vnd.dvb.ipdcesgaccess2"),

  /**
   * vnd.dvb.ipdcesgpdd
   */
  APPLICATION_VND_DVB_IPDCESGPDD( "vnd.dvb.ipdcesgpdd", "application/vnd.dvb.ipdcesgpdd"),

  /**
   * vnd.dvb.ipdcroaming
   */
  APPLICATION_VND_DVB_IPDCROAMING( "vnd.dvb.ipdcroaming", "application/vnd.dvb.ipdcroaming"),

  /**
   * vnd.dvb.iptv.alfec-base
   */
  APPLICATION_VND_DVB_IPTV_ALFEC_BASE( "vnd.dvb.iptv.alfec-base", "application/vnd.dvb.iptv.alfec-base"),

  /**
   * vnd.dvb.iptv.alfec-enhancement
   */
  APPLICATION_VND_DVB_IPTV_ALFEC_ENHANCEMENT( "vnd.dvb.iptv.alfec-enhancement", "application/vnd.dvb.iptv.alfec-enhancement"),

  /**
   * vnd.dvb.notif-aggregate-root+xml
   */
  APPLICATION_VND_DVB_NOTIF_AGGREGATE_ROOT_XML( "vnd.dvb.notif-aggregate-root+xml", "application/vnd.dvb.notif-aggregate-root+xml"),

  /**
   * vnd.dvb.notif-container+xml
   */
  APPLICATION_VND_DVB_NOTIF_CONTAINER_XML( "vnd.dvb.notif-container+xml", "application/vnd.dvb.notif-container+xml"),

  /**
   * vnd.dvb.notif-generic+xml
   */
  APPLICATION_VND_DVB_NOTIF_GENERIC_XML( "vnd.dvb.notif-generic+xml", "application/vnd.dvb.notif-generic+xml"),

  /**
   * vnd.dvb.notif-ia-msglist+xml
   */
  APPLICATION_VND_DVB_NOTIF_IA_MSGLIST_XML( "vnd.dvb.notif-ia-msglist+xml", "application/vnd.dvb.notif-ia-msglist+xml"),

  /**
   * vnd.dvb.notif-ia-registration-request+xml
   */
  APPLICATION_VND_DVB_NOTIF_IA_REGISTRATION_REQUEST_XML( "vnd.dvb.notif-ia-registration-request+xml", "application/vnd.dvb.notif-ia-registration-request+xml"),

  /**
   * vnd.dvb.notif-ia-registration-response+xml
   */
  APPLICATION_VND_DVB_NOTIF_IA_REGISTRATION_RESPONSE_XML( "vnd.dvb.notif-ia-registration-response+xml", "application/vnd.dvb.notif-ia-registration-response+xml"),

  /**
   * vnd.dvb.notif-init+xml
   */
  APPLICATION_VND_DVB_NOTIF_INIT_XML( "vnd.dvb.notif-init+xml", "application/vnd.dvb.notif-init+xml"),

  /**
   * vnd.dvb.pfr
   */
  APPLICATION_VND_DVB_PFR( "vnd.dvb.pfr", "application/vnd.dvb.pfr"),

  /**
   * Digital Video Broadcasting
   */
  APPLICATION_VND_DVB_SERVICE( "Digital Video Broadcasting", "application/vnd.dvb.service"),

  /**
   * vnd.dxr
   */
  APPLICATION_VND_DXR( "vnd.dxr", "application/vnd.dxr"),

  /**
   * DynaGeo
   */
  APPLICATION_VND_DYNAGEO( "DynaGeo", "application/vnd.dynageo"),

  /**
   * vnd.dzr
   */
  APPLICATION_VND_DZR( "vnd.dzr", "application/vnd.dzr"),

  /**
   * vnd.easykaraoke.cdgdownload
   */
  APPLICATION_VND_EASYKARAOKE_CDGDOWNLOAD( "vnd.easykaraoke.cdgdownload", "application/vnd.easykaraoke.cdgdownload"),

  /**
   * vnd.ecdis-update
   */
  APPLICATION_VND_ECDIS_UPDATE( "vnd.ecdis-update", "application/vnd.ecdis-update"),

  /**
   * vnd.ecip.rlp
   */
  APPLICATION_VND_ECIP_RLP( "vnd.ecip.rlp", "application/vnd.ecip.rlp"),

  /**
   * EcoWin Chart
   */
  APPLICATION_VND_ECOWIN_CHART( "EcoWin Chart", "application/vnd.ecowin.chart"),

  /**
   * vnd.ecowin.filerequest
   */
  APPLICATION_VND_ECOWIN_FILEREQUEST( "vnd.ecowin.filerequest", "application/vnd.ecowin.filerequest"),

  /**
   * vnd.ecowin.fileupdate
   */
  APPLICATION_VND_ECOWIN_FILEUPDATE( "vnd.ecowin.fileupdate", "application/vnd.ecowin.fileupdate"),

  /**
   * vnd.ecowin.series
   */
  APPLICATION_VND_ECOWIN_SERIES( "vnd.ecowin.series", "application/vnd.ecowin.series"),

  /**
   * vnd.ecowin.seriesrequest
   */
  APPLICATION_VND_ECOWIN_SERIESREQUEST( "vnd.ecowin.seriesrequest", "application/vnd.ecowin.seriesrequest"),

  /**
   * vnd.ecowin.seriesupdate
   */
  APPLICATION_VND_ECOWIN_SERIESUPDATE( "vnd.ecowin.seriesupdate", "application/vnd.ecowin.seriesupdate"),

  /**
   * vnd.efi.img
   */
  APPLICATION_VND_EFI_IMG( "vnd.efi.img", "application/vnd.efi.img"),

  /**
   * vnd.efi.iso
   */
  APPLICATION_VND_EFI_ISO( "vnd.efi.iso", "application/vnd.efi.iso"),

  /**
   * vnd.emclient.accessrequest+xml
   */
  APPLICATION_VND_EMCLIENT_ACCESSREQUEST_XML( "vnd.emclient.accessrequest+xml", "application/vnd.emclient.accessrequest+xml"),

  /**
   * Enliven Viewer
   */
  APPLICATION_VND_ENLIVEN( "Enliven Viewer", "application/vnd.enliven"),

  /**
   * vnd.enphase.envoy
   */
  APPLICATION_VND_ENPHASE_ENVOY( "vnd.enphase.envoy", "application/vnd.enphase.envoy"),

  /**
   * vnd.eprints.data+xml
   */
  APPLICATION_VND_EPRINTS_DATA_XML( "vnd.eprints.data+xml", "application/vnd.eprints.data+xml"),

  /**
   * QUASS Stream Player
   */
  APPLICATION_VND_EPSON_ESF( "QUASS Stream Player", "application/vnd.epson.esf"),

  /**
   * QUASS Stream Player
   */
  APPLICATION_VND_EPSON_MSF( "QUASS Stream Player", "application/vnd.epson.msf"),

  /**
   * QuickAnime Player
   */
  APPLICATION_VND_EPSON_QUICKANIME( "QuickAnime Player", "application/vnd.epson.quickanime"),

  /**
   * SimpleAnimeLite Player
   */
  APPLICATION_VND_EPSON_SALT( "SimpleAnimeLite Player", "application/vnd.epson.salt"),

  /**
   * QUASS Stream Player
   */
  APPLICATION_VND_EPSON_SSF( "QUASS Stream Player", "application/vnd.epson.ssf"),

  /**
   * vnd.ericsson.quickcall
   */
  APPLICATION_VND_ERICSSON_QUICKCALL( "vnd.ericsson.quickcall", "application/vnd.ericsson.quickcall"),

  /**
   * vnd.espass-espass+zip
   */
  APPLICATION_VND_ESPASS_ESPASS_ZIP( "vnd.espass-espass+zip", "application/vnd.espass-espass+zip"),

  /**
   * MICROSEC e-Szignï¿½
   */
  APPLICATION_VND_ESZIGNO3_XML( "MICROSEC e-Szignï¿½", "application/vnd.eszigno3+xml"),

  /**
   * vnd.etsi.aoc+xml
   */
  APPLICATION_VND_ETSI_AOC_XML( "vnd.etsi.aoc+xml", "application/vnd.etsi.aoc+xml"),

  /**
   * vnd.etsi.asic-e+zip
   */
  APPLICATION_VND_ETSI_ASIC_E_ZIP( "vnd.etsi.asic-e+zip", "application/vnd.etsi.asic-e+zip"),

  /**
   * vnd.etsi.asic-s+zip
   */
  APPLICATION_VND_ETSI_ASIC_S_ZIP( "vnd.etsi.asic-s+zip", "application/vnd.etsi.asic-s+zip"),

  /**
   * vnd.etsi.cug+xml
   */
  APPLICATION_VND_ETSI_CUG_XML( "vnd.etsi.cug+xml", "application/vnd.etsi.cug+xml"),

  /**
   * vnd.etsi.iptvcommand+xml
   */
  APPLICATION_VND_ETSI_IPTVCOMMAND_XML( "vnd.etsi.iptvcommand+xml", "application/vnd.etsi.iptvcommand+xml"),

  /**
   * vnd.etsi.iptvdiscovery+xml
   */
  APPLICATION_VND_ETSI_IPTVDISCOVERY_XML( "vnd.etsi.iptvdiscovery+xml", "application/vnd.etsi.iptvdiscovery+xml"),

  /**
   * vnd.etsi.iptvprofile+xml
   */
  APPLICATION_VND_ETSI_IPTVPROFILE_XML( "vnd.etsi.iptvprofile+xml", "application/vnd.etsi.iptvprofile+xml"),

  /**
   * vnd.etsi.iptvsad-bc+xml
   */
  APPLICATION_VND_ETSI_IPTVSAD_BC_XML( "vnd.etsi.iptvsad-bc+xml", "application/vnd.etsi.iptvsad-bc+xml"),

  /**
   * vnd.etsi.iptvsad-cod+xml
   */
  APPLICATION_VND_ETSI_IPTVSAD_COD_XML( "vnd.etsi.iptvsad-cod+xml", "application/vnd.etsi.iptvsad-cod+xml"),

  /**
   * vnd.etsi.iptvsad-npvr+xml
   */
  APPLICATION_VND_ETSI_IPTVSAD_NPVR_XML( "vnd.etsi.iptvsad-npvr+xml", "application/vnd.etsi.iptvsad-npvr+xml"),

  /**
   * vnd.etsi.iptvservice+xml
   */
  APPLICATION_VND_ETSI_IPTVSERVICE_XML( "vnd.etsi.iptvservice+xml", "application/vnd.etsi.iptvservice+xml"),

  /**
   * vnd.etsi.iptvsync+xml
   */
  APPLICATION_VND_ETSI_IPTVSYNC_XML( "vnd.etsi.iptvsync+xml", "application/vnd.etsi.iptvsync+xml"),

  /**
   * vnd.etsi.iptvueprofile+xml
   */
  APPLICATION_VND_ETSI_IPTVUEPROFILE_XML( "vnd.etsi.iptvueprofile+xml", "application/vnd.etsi.iptvueprofile+xml"),

  /**
   * vnd.etsi.mcid+xml
   */
  APPLICATION_VND_ETSI_MCID_XML( "vnd.etsi.mcid+xml", "application/vnd.etsi.mcid+xml"),

  /**
   * vnd.etsi.mheg5
   */
  APPLICATION_VND_ETSI_MHEG5( "vnd.etsi.mheg5", "application/vnd.etsi.mheg5"),

  /**
   * vnd.etsi.overload-control-policy-dataset+xml
   */
  APPLICATION_VND_ETSI_OVERLOAD_CONTROL_POLICY_DATASET_XML( "vnd.etsi.overload-control-policy-dataset+xml", "application/vnd.etsi.overload-control-policy-dataset+xml"),

  /**
   * vnd.etsi.pstn+xml
   */
  APPLICATION_VND_ETSI_PSTN_XML( "vnd.etsi.pstn+xml", "application/vnd.etsi.pstn+xml"),

  /**
   * vnd.etsi.sci+xml
   */
  APPLICATION_VND_ETSI_SCI_XML( "vnd.etsi.sci+xml", "application/vnd.etsi.sci+xml"),

  /**
   * vnd.etsi.simservs+xml
   */
  APPLICATION_VND_ETSI_SIMSERVS_XML( "vnd.etsi.simservs+xml", "application/vnd.etsi.simservs+xml"),

  /**
   * vnd.etsi.timestamp-token
   */
  APPLICATION_VND_ETSI_TIMESTAMP_TOKEN( "vnd.etsi.timestamp-token", "application/vnd.etsi.timestamp-token"),

  /**
   * vnd.etsi.tsl+xml
   */
  APPLICATION_VND_ETSI_TSL_XML( "vnd.etsi.tsl+xml", "application/vnd.etsi.tsl+xml"),

  /**
   * vnd.etsi.tsl.der
   */
  APPLICATION_VND_ETSI_TSL_DER( "vnd.etsi.tsl.der", "application/vnd.etsi.tsl.der"),

  /**
   * vnd.eudora.data
   */
  APPLICATION_VND_EUDORA_DATA( "vnd.eudora.data", "application/vnd.eudora.data"),

  /**
   * vnd.evolv.ecig.profile
   */
  APPLICATION_VND_EVOLV_ECIG_PROFILE( "vnd.evolv.ecig.profile", "application/vnd.evolv.ecig.profile"),

  /**
   * vnd.evolv.ecig.settings
   */
  APPLICATION_VND_EVOLV_ECIG_SETTINGS( "vnd.evolv.ecig.settings", "application/vnd.evolv.ecig.settings"),

  /**
   * vnd.evolv.ecig.theme
   */
  APPLICATION_VND_EVOLV_ECIG_THEME( "vnd.evolv.ecig.theme", "application/vnd.evolv.ecig.theme"),

  /**
   * vnd.exstream-empower+zip
   */
  APPLICATION_VND_EXSTREAM_EMPOWER_ZIP( "vnd.exstream-empower+zip", "application/vnd.exstream-empower+zip"),

  /**
   * vnd.exstream-package
   */
  APPLICATION_VND_EXSTREAM_PACKAGE( "vnd.exstream-package", "application/vnd.exstream-package"),

  /**
   * EZPix Secure Photo Album
   */
  APPLICATION_VND_EZPIX_ALBUM( "EZPix Secure Photo Album", "application/vnd.ezpix-album"),

  /**
   * EZPix Secure Photo Album
   */
  APPLICATION_VND_EZPIX_PACKAGE( "EZPix Secure Photo Album", "application/vnd.ezpix-package"),

  /**
   * vnd.f-secure.mobile
   */
  APPLICATION_VND_F_SECURE_MOBILE( "vnd.f-secure.mobile", "application/vnd.f-secure.mobile"),

  /**
   * vnd.fastcopy-disk-image
   */
  APPLICATION_VND_FASTCOPY_DISK_IMAGE( "vnd.fastcopy-disk-image", "application/vnd.fastcopy-disk-image"),

  /**
   * Forms Data Format
   */
  APPLICATION_VND_FDF( "Forms Data Format", "application/vnd.fdf"),

  /**
   * vnd.fdsn.mseed
   */
  APPLICATION_VND_FDSN_MSEED( "vnd.fdsn.mseed", "application/vnd.fdsn.mseed"),

  /**
   * Digital Siesmograph Networks - SEED Datafiles
   */
  APPLICATION_VND_FDSN_SEED( "Digital Siesmograph Networks - SEED Datafiles", "application/vnd.fdsn.seed"),

  /**
   * vnd.ffsns
   */
  APPLICATION_VND_FFSNS( "vnd.ffsns", "application/vnd.ffsns"),

  /**
   * vnd.ficlab.flb+zip
   */
  APPLICATION_VND_FICLAB_FLB_ZIP( "vnd.ficlab.flb+zip", "application/vnd.ficlab.flb+zip"),

  /**
   * vnd.filmit.zfc
   */
  APPLICATION_VND_FILMIT_ZFC( "vnd.filmit.zfc", "application/vnd.filmit.zfc"),

  /**
   * vnd.fints
   */
  APPLICATION_VND_FINTS( "vnd.fints", "application/vnd.fints"),

  /**
   * vnd.firemonkeys.cloudcell
   */
  APPLICATION_VND_FIREMONKEYS_CLOUDCELL( "vnd.firemonkeys.cloudcell", "application/vnd.firemonkeys.cloudcell"),

  /**
   * NpGraphIt
   */
  APPLICATION_VND_FLOGRAPHIT( "NpGraphIt", "application/vnd.flographit"),

  /**
   * FluxTime Clip
   */
  APPLICATION_VND_FLUXTIME_CLIP( "FluxTime Clip", "application/vnd.fluxtime.clip"),

  /**
   * vnd.font-fontforge-sfd
   */
  APPLICATION_VND_FONT_FONTFORGE_SFD( "vnd.font-fontforge-sfd", "application/vnd.font-fontforge-sfd"),

  /**
   * FrameMaker Normal Format
   */
  APPLICATION_VND_FRAMEMAKER( "FrameMaker Normal Format", "application/vnd.framemaker"),

  /**
   * Frogans Player
   */
  APPLICATION_VND_FROGANS_FNC( "Frogans Player", "application/vnd.frogans.fnc"),

  /**
   * Frogans Player
   */
  APPLICATION_VND_FROGANS_LTF( "Frogans Player", "application/vnd.frogans.ltf"),

  /**
   * Friendly Software Corporation
   */
  APPLICATION_VND_FSC_WEBLAUNCH( "Friendly Software Corporation", "application/vnd.fsc.weblaunch"),

  /**
   * Fujitsu Oasys
   */
  APPLICATION_VND_FUJITSU_OASYS( "Fujitsu Oasys", "application/vnd.fujitsu.oasys"),

  /**
   * Fujitsu Oasys
   */
  APPLICATION_VND_FUJITSU_OASYS2( "Fujitsu Oasys", "application/vnd.fujitsu.oasys2"),

  /**
   * Fujitsu Oasys
   */
  APPLICATION_VND_FUJITSU_OASYS3( "Fujitsu Oasys", "application/vnd.fujitsu.oasys3"),

  /**
   * Fujitsu Oasys
   */
  APPLICATION_VND_FUJITSU_OASYSGP( "Fujitsu Oasys", "application/vnd.fujitsu.oasysgp"),

  /**
   * Fujitsu Oasys
   */
  APPLICATION_VND_FUJITSU_OASYSPRS( "Fujitsu Oasys", "application/vnd.fujitsu.oasysprs"),

  /**
   * vnd.fujixerox.ART-EX
   */
  APPLICATION_VND_FUJIXEROX_ART_EX( "vnd.fujixerox.ART-EX", "application/vnd.fujixerox.ART-EX"),

  /**
   * vnd.fujixerox.ART4
   */
  APPLICATION_VND_FUJIXEROX_ART4( "vnd.fujixerox.ART4", "application/vnd.fujixerox.ART4"),

  /**
   * vnd.fujixerox.HBPL
   */
  APPLICATION_VND_FUJIXEROX_HBPL( "vnd.fujixerox.HBPL", "application/vnd.fujixerox.HBPL"),

  /**
   * Fujitsu - Xerox 2D CAD Data
   */
  APPLICATION_VND_FUJIXEROX_DDD( "Fujitsu - Xerox 2D CAD Data", "application/vnd.fujixerox.ddd"),

  /**
   * Fujitsu - Xerox DocuWorks
   */
  APPLICATION_VND_FUJIXEROX_DOCUWORKS( "Fujitsu - Xerox DocuWorks", "application/vnd.fujixerox.docuworks"),

  /**
   * Fujitsu - Xerox DocuWorks Binder
   */
  APPLICATION_VND_FUJIXEROX_DOCUWORKS_BINDER( "Fujitsu - Xerox DocuWorks Binder", "application/vnd.fujixerox.docuworks.binder"),

  /**
   * vnd.fujixerox.docuworks.container
   */
  APPLICATION_VND_FUJIXEROX_DOCUWORKS_CONTAINER( "vnd.fujixerox.docuworks.container", "application/vnd.fujixerox.docuworks.container"),

  /**
   * vnd.fut-misnet
   */
  APPLICATION_VND_FUT_MISNET( "vnd.fut-misnet", "application/vnd.fut-misnet"),

  /**
   * vnd.futoin+cbor
   */
  APPLICATION_VND_FUTOIN_CBOR( "vnd.futoin+cbor", "application/vnd.futoin+cbor"),

  /**
   * vnd.futoin+json
   */
  APPLICATION_VND_FUTOIN_JSON( "vnd.futoin+json", "application/vnd.futoin+json"),

  /**
   * FuzzySheet
   */
  APPLICATION_VND_FUZZYSHEET( "FuzzySheet", "application/vnd.fuzzysheet"),

  /**
   * Genomatix Tuxedo Framework
   */
  APPLICATION_VND_GENOMATIX_TUXEDO( "Genomatix Tuxedo Framework", "application/vnd.genomatix.tuxedo"),

  /**
   * vnd.gentics.grd+json
   */
  APPLICATION_VND_GENTICS_GRD_JSON( "vnd.gentics.grd+json", "application/vnd.gentics.grd+json"),

  /**
   * vnd.geo+json (OBSOLETED by [RFC7946] in favor of application/geo+json)
   */
  APPLICATION_VND_GEO_JSON( "vnd.geo+json (OBSOLETED by [RFC7946] in favor of application/geo+json)", "application/vnd.geo+json"),

  /**
   * vnd.geocube+xml - OBSOLETED by request
   */
  APPLICATION_VND_GEOCUBE_XML( "vnd.geocube+xml - OBSOLETED by request", "application/vnd.geocube+xml"),

  /**
   * GeoGebra
   */
  APPLICATION_VND_GEOGEBRA_FILE( "GeoGebra", "application/vnd.geogebra.file"),

  /**
   * vnd.geogebra.slides
   */
  APPLICATION_VND_GEOGEBRA_SLIDES( "vnd.geogebra.slides", "application/vnd.geogebra.slides"),

  /**
   * GeoGebra
   */
  APPLICATION_VND_GEOGEBRA_TOOL( "GeoGebra", "application/vnd.geogebra.tool"),

  /**
   * GeoMetry Explorer
   */
  APPLICATION_VND_GEOMETRY_EXPLORER( "GeoMetry Explorer", "application/vnd.geometry-explorer"),

  /**
   * GEONExT and JSXGraph
   */
  APPLICATION_VND_GEONEXT( "GEONExT and JSXGraph", "application/vnd.geonext"),

  /**
   * GeoplanW
   */
  APPLICATION_VND_GEOPLAN( "GeoplanW", "application/vnd.geoplan"),

  /**
   * GeospacW
   */
  APPLICATION_VND_GEOSPACE( "GeospacW", "application/vnd.geospace"),

  /**
   * vnd.gerber
   */
  APPLICATION_VND_GERBER( "vnd.gerber", "application/vnd.gerber"),

  /**
   * vnd.globalplatform.card-content-mgt
   */
  APPLICATION_VND_GLOBALPLATFORM_CARD_CONTENT_MGT( "vnd.globalplatform.card-content-mgt", "application/vnd.globalplatform.card-content-mgt"),

  /**
   * vnd.globalplatform.card-content-mgt-response
   */
  APPLICATION_VND_GLOBALPLATFORM_CARD_CONTENT_MGT_RESPONSE( "vnd.globalplatform.card-content-mgt-response", "application/vnd.globalplatform.card-content-mgt-response"),

  /**
   * GameMaker ActiveX
   */
  APPLICATION_VND_GMX( "GameMaker ActiveX", "application/vnd.gmx"),

  /**
   * Google Earth - KML
   */
  APPLICATION_VND_GOOGLE_EARTH_KML_XML( "Google Earth - KML", "application/vnd.google-earth.kml+xml"),

  /**
   * Google Earth - Zipped KML
   */
  APPLICATION_VND_GOOGLE_EARTH_KMZ( "Google Earth - Zipped KML", "application/vnd.google-earth.kmz"),

  /**
   * vnd.gov.sk.e-form+xml
   */
  APPLICATION_VND_GOV_SK_E_FORM_XML( "vnd.gov.sk.e-form+xml", "application/vnd.gov.sk.e-form+xml"),

  /**
   * vnd.gov.sk.e-form+zip
   */
  APPLICATION_VND_GOV_SK_E_FORM_ZIP( "vnd.gov.sk.e-form+zip", "application/vnd.gov.sk.e-form+zip"),

  /**
   * vnd.gov.sk.xmldatacontainer+xml
   */
  APPLICATION_VND_GOV_SK_XMLDATACONTAINER_XML( "vnd.gov.sk.xmldatacontainer+xml", "application/vnd.gov.sk.xmldatacontainer+xml"),

  /**
   * GrafEq
   */
  APPLICATION_VND_GRAFEQ( "GrafEq", "application/vnd.grafeq"),

  /**
   * vnd.gridmp
   */
  APPLICATION_VND_GRIDMP( "vnd.gridmp", "application/vnd.gridmp"),

  /**
   * Groove - Account
   */
  APPLICATION_VND_GROOVE_ACCOUNT( "Groove - Account", "application/vnd.groove-account"),

  /**
   * Groove - Help
   */
  APPLICATION_VND_GROOVE_HELP( "Groove - Help", "application/vnd.groove-help"),

  /**
   * Groove - Identity Message
   */
  APPLICATION_VND_GROOVE_IDENTITY_MESSAGE( "Groove - Identity Message", "application/vnd.groove-identity-message"),

  /**
   * Groove - Injector
   */
  APPLICATION_VND_GROOVE_INJECTOR( "Groove - Injector", "application/vnd.groove-injector"),

  /**
   * Groove - Tool Message
   */
  APPLICATION_VND_GROOVE_TOOL_MESSAGE( "Groove - Tool Message", "application/vnd.groove-tool-message"),

  /**
   * Groove - Tool Template
   */
  APPLICATION_VND_GROOVE_TOOL_TEMPLATE( "Groove - Tool Template", "application/vnd.groove-tool-template"),

  /**
   * Groove - Vcard
   */
  APPLICATION_VND_GROOVE_VCARD( "Groove - Vcard", "application/vnd.groove-vcard"),

  /**
   * vnd.hal+json
   */
  APPLICATION_VND_HAL_JSON( "vnd.hal+json", "application/vnd.hal+json"),

  /**
   * Hypertext Application Language
   */
  APPLICATION_VND_HAL_XML( "Hypertext Application Language", "application/vnd.hal+xml"),

  /**
   * ZVUE Media Manager
   */
  APPLICATION_VND_HANDHELD_ENTERTAINMENT_XML( "ZVUE Media Manager", "application/vnd.handheld-entertainment+xml"),

  /**
   * Homebanking Computer Interface (HBCI)
   */
  APPLICATION_VND_HBCI( "Homebanking Computer Interface (HBCI)", "application/vnd.hbci"),

  /**
   * vnd.hc+json
   */
  APPLICATION_VND_HC_JSON( "vnd.hc+json", "application/vnd.hc+json"),

  /**
   * vnd.hcl-bireports
   */
  APPLICATION_VND_HCL_BIREPORTS( "vnd.hcl-bireports", "application/vnd.hcl-bireports"),

  /**
   * vnd.hdt
   */
  APPLICATION_VND_HDT( "vnd.hdt", "application/vnd.hdt"),

  /**
   * vnd.heroku+json
   */
  APPLICATION_VND_HEROKU_JSON( "vnd.heroku+json", "application/vnd.heroku+json"),

  /**
   * Archipelago Lesson Player
   */
  APPLICATION_VND_HHE_LESSON_PLAYER( "Archipelago Lesson Player", "application/vnd.hhe.lesson-player"),

  /**
   * HP-GL/2 and HP RTL
   */
  APPLICATION_VND_HP_HPGL( "HP-GL/2 and HP RTL", "application/vnd.hp-hpgl"),

  /**
   * Hewlett Packard Instant Delivery
   */
  APPLICATION_VND_HP_HPID( "Hewlett Packard Instant Delivery", "application/vnd.hp-hpid"),

  /**
   * Hewlett-Packard&#x27;s WebPrintSmart
   */
  APPLICATION_VND_HP_HPS( "Hewlett-Packard&#x27;s WebPrintSmart", "application/vnd.hp-hps"),

  /**
   * HP Indigo Digital Press - Job Layout Languate
   */
  APPLICATION_VND_HP_JLYT( "HP Indigo Digital Press - Job Layout Languate", "application/vnd.hp-jlyt"),

  /**
   * HP Printer Command Language
   */
  APPLICATION_VND_HP_PCL( "HP Printer Command Language", "application/vnd.hp-pcl"),

  /**
   * PCL 6 Enhanced (Formely PCL XL)
   */
  APPLICATION_VND_HP_PCLXL( "PCL 6 Enhanced (Formely PCL XL)", "application/vnd.hp-pclxl"),

  /**
   * vnd.httphone
   */
  APPLICATION_VND_HTTPHONE( "vnd.httphone", "application/vnd.httphone"),

  /**
   * Hydrostatix Master Suite
   */
  APPLICATION_VND_HYDROSTATIX_SOF_DATA( "Hydrostatix Master Suite", "application/vnd.hydrostatix.sof-data"),

  /**
   * vnd.hyper+json
   */
  APPLICATION_VND_HYPER_JSON( "vnd.hyper+json", "application/vnd.hyper+json"),

  /**
   * vnd.hyper-item+json
   */
  APPLICATION_VND_HYPER_ITEM_JSON( "vnd.hyper-item+json", "application/vnd.hyper-item+json"),

  /**
   * vnd.hyperdrive+json
   */
  APPLICATION_VND_HYPERDRIVE_JSON( "vnd.hyperdrive+json", "application/vnd.hyperdrive+json"),

  /**
   * 3D Crossword Plugin
   */
  APPLICATION_VND_HZN_3D_CROSSWORD( "3D Crossword Plugin", "application/vnd.hzn-3d-crossword"),

  /**
   * vnd.ibm.afplinedata - OBSOLETED in favor of vnd.afpc.afplinedata
   */
  APPLICATION_VND_IBM_AFPLINEDATA( "vnd.ibm.afplinedata - OBSOLETED in favor of vnd.afpc.afplinedata", "application/vnd.ibm.afplinedata"),

  /**
   * vnd.ibm.electronic-media
   */
  APPLICATION_VND_IBM_ELECTRONIC_MEDIA( "vnd.ibm.electronic-media", "application/vnd.ibm.electronic-media"),

  /**
   * MiniPay
   */
  APPLICATION_VND_IBM_MINIPAY( "MiniPay", "application/vnd.ibm.minipay"),

  /**
   * MO:DCA-P
   */
  APPLICATION_VND_IBM_MODCAP( "MO:DCA-P", "application/vnd.ibm.modcap"),

  /**
   * IBM DB2 Rights Manager
   */
  APPLICATION_VND_IBM_RIGHTS_MANAGEMENT( "IBM DB2 Rights Manager", "application/vnd.ibm.rights-management"),

  /**
   * IBM Electronic Media Management System - Secure Container
   */
  APPLICATION_VND_IBM_SECURE_CONTAINER( "IBM Electronic Media Management System - Secure Container", "application/vnd.ibm.secure-container"),

  /**
   * ICC profile
   */
  APPLICATION_VND_ICCPROFILE( "ICC profile", "application/vnd.iccprofile"),

  /**
   * vnd.ieee.1905
   */
  APPLICATION_VND_IEEE_1905( "vnd.ieee.1905", "application/vnd.ieee.1905"),

  /**
   * igLoader
   */
  APPLICATION_VND_IGLOADER( "igLoader", "application/vnd.igloader"),

  /**
   * vnd.imagemeter.folder+zip
   */
  APPLICATION_VND_IMAGEMETER_FOLDER_ZIP( "vnd.imagemeter.folder+zip", "application/vnd.imagemeter.folder+zip"),

  /**
   * vnd.imagemeter.image+zip
   */
  APPLICATION_VND_IMAGEMETER_IMAGE_ZIP( "vnd.imagemeter.image+zip", "application/vnd.imagemeter.image+zip"),

  /**
   * ImmerVision PURE Players
   */
  APPLICATION_VND_IMMERVISION_IVP( "ImmerVision PURE Players", "application/vnd.immervision-ivp"),

  /**
   * ImmerVision PURE Players
   */
  APPLICATION_VND_IMMERVISION_IVU( "ImmerVision PURE Players", "application/vnd.immervision-ivu"),

  /**
   * vnd.ims.imsccv1p1
   */
  APPLICATION_VND_IMS_IMSCCV1P1( "vnd.ims.imsccv1p1", "application/vnd.ims.imsccv1p1"),

  /**
   * vnd.ims.imsccv1p2
   */
  APPLICATION_VND_IMS_IMSCCV1P2( "vnd.ims.imsccv1p2", "application/vnd.ims.imsccv1p2"),

  /**
   * vnd.ims.imsccv1p3
   */
  APPLICATION_VND_IMS_IMSCCV1P3( "vnd.ims.imsccv1p3", "application/vnd.ims.imsccv1p3"),

  /**
   * vnd.ims.lis.v2.result+json
   */
  APPLICATION_VND_IMS_LIS_V2_RESULT_JSON( "vnd.ims.lis.v2.result+json", "application/vnd.ims.lis.v2.result+json"),

  /**
   * vnd.ims.lti.v2.toolconsumerprofile+json
   */
  APPLICATION_VND_IMS_LTI_V2_TOOLCONSUMERPROFILE_JSON( "vnd.ims.lti.v2.toolconsumerprofile+json", "application/vnd.ims.lti.v2.toolconsumerprofile+json"),

  /**
   * vnd.ims.lti.v2.toolproxy+json
   */
  APPLICATION_VND_IMS_LTI_V2_TOOLPROXY_JSON( "vnd.ims.lti.v2.toolproxy+json", "application/vnd.ims.lti.v2.toolproxy+json"),

  /**
   * vnd.ims.lti.v2.toolproxy.id+json
   */
  APPLICATION_VND_IMS_LTI_V2_TOOLPROXY_ID_JSON( "vnd.ims.lti.v2.toolproxy.id+json", "application/vnd.ims.lti.v2.toolproxy.id+json"),

  /**
   * vnd.ims.lti.v2.toolsettings+json
   */
  APPLICATION_VND_IMS_LTI_V2_TOOLSETTINGS_JSON( "vnd.ims.lti.v2.toolsettings+json", "application/vnd.ims.lti.v2.toolsettings+json"),

  /**
   * vnd.ims.lti.v2.toolsettings.simple+json
   */
  APPLICATION_VND_IMS_LTI_V2_TOOLSETTINGS_SIMPLE_JSON( "vnd.ims.lti.v2.toolsettings.simple+json", "application/vnd.ims.lti.v2.toolsettings.simple+json"),

  /**
   * vnd.informedcontrol.rms+xml
   */
  APPLICATION_VND_INFORMEDCONTROL_RMS_XML( "vnd.informedcontrol.rms+xml", "application/vnd.informedcontrol.rms+xml"),

  /**
   * vnd.informix-visionary - OBSOLETED in favor of application/vnd.visionary
   */
  APPLICATION_VND_INFORMIX_VISIONARY( "vnd.informix-visionary - OBSOLETED in favor of application/vnd.visionary", "application/vnd.informix-visionary"),

  /**
   * vnd.infotech.project
   */
  APPLICATION_VND_INFOTECH_PROJECT( "vnd.infotech.project", "application/vnd.infotech.project"),

  /**
   * vnd.infotech.project+xml
   */
  APPLICATION_VND_INFOTECH_PROJECT_XML( "vnd.infotech.project+xml", "application/vnd.infotech.project+xml"),

  /**
   * vnd.innopath.wamp.notification
   */
  APPLICATION_VND_INNOPATH_WAMP_NOTIFICATION( "vnd.innopath.wamp.notification", "application/vnd.innopath.wamp.notification"),

  /**
   * IOCOM Visimeet
   */
  APPLICATION_VND_INSORS_IGM( "IOCOM Visimeet", "application/vnd.insors.igm"),

  /**
   * Intercon FormNet
   */
  APPLICATION_VND_INTERCON_FORMNET( "Intercon FormNet", "application/vnd.intercon.formnet"),

  /**
   * Interactive Geometry Software
   */
  APPLICATION_VND_INTERGEO( "Interactive Geometry Software", "application/vnd.intergeo"),

  /**
   * vnd.intertrust.digibox
   */
  APPLICATION_VND_INTERTRUST_DIGIBOX( "vnd.intertrust.digibox", "application/vnd.intertrust.digibox"),

  /**
   * vnd.intertrust.nncp
   */
  APPLICATION_VND_INTERTRUST_NNCP( "vnd.intertrust.nncp", "application/vnd.intertrust.nncp"),

  /**
   * Open Financial Exchange
   */
  APPLICATION_VND_INTU_QBO( "Open Financial Exchange", "application/vnd.intu.qbo"),

  /**
   * Quicken
   */
  APPLICATION_VND_INTU_QFX( "Quicken", "application/vnd.intu.qfx"),

  /**
   * vnd.iptc.g2.catalogitem+xml
   */
  APPLICATION_VND_IPTC_G2_CATALOGITEM_XML( "vnd.iptc.g2.catalogitem+xml", "application/vnd.iptc.g2.catalogitem+xml"),

  /**
   * vnd.iptc.g2.conceptitem+xml
   */
  APPLICATION_VND_IPTC_G2_CONCEPTITEM_XML( "vnd.iptc.g2.conceptitem+xml", "application/vnd.iptc.g2.conceptitem+xml"),

  /**
   * vnd.iptc.g2.knowledgeitem+xml
   */
  APPLICATION_VND_IPTC_G2_KNOWLEDGEITEM_XML( "vnd.iptc.g2.knowledgeitem+xml", "application/vnd.iptc.g2.knowledgeitem+xml"),

  /**
   * vnd.iptc.g2.newsitem+xml
   */
  APPLICATION_VND_IPTC_G2_NEWSITEM_XML( "vnd.iptc.g2.newsitem+xml", "application/vnd.iptc.g2.newsitem+xml"),

  /**
   * vnd.iptc.g2.newsmessage+xml
   */
  APPLICATION_VND_IPTC_G2_NEWSMESSAGE_XML( "vnd.iptc.g2.newsmessage+xml", "application/vnd.iptc.g2.newsmessage+xml"),

  /**
   * vnd.iptc.g2.packageitem+xml
   */
  APPLICATION_VND_IPTC_G2_PACKAGEITEM_XML( "vnd.iptc.g2.packageitem+xml", "application/vnd.iptc.g2.packageitem+xml"),

  /**
   * vnd.iptc.g2.planningitem+xml
   */
  APPLICATION_VND_IPTC_G2_PLANNINGITEM_XML( "vnd.iptc.g2.planningitem+xml", "application/vnd.iptc.g2.planningitem+xml"),

  /**
   * IP Unplugged Roaming Client
   */
  APPLICATION_VND_IPUNPLUGGED_RCPROFILE( "IP Unplugged Roaming Client", "application/vnd.ipunplugged.rcprofile"),

  /**
   * iRepository / Lucidoc Editor
   */
  APPLICATION_VND_IREPOSITORY_PACKAGE_XML( "iRepository / Lucidoc Editor", "application/vnd.irepository.package+xml"),

  /**
   * Express by Infoseek
   */
  APPLICATION_VND_IS_XPR( "Express by Infoseek", "application/vnd.is-xpr"),

  /**
   * International Society for Advancement of Cytometry
   */
  APPLICATION_VND_ISAC_FCS( "International Society for Advancement of Cytometry", "application/vnd.isac.fcs"),

  /**
   * vnd.iso11783-10+zip
   */
  APPLICATION_VND_ISO11783_10_ZIP( "vnd.iso11783-10+zip", "application/vnd.iso11783-10+zip"),

  /**
   * Lightspeed Audio Lab
   */
  APPLICATION_VND_JAM( "Lightspeed Audio Lab", "application/vnd.jam"),

  /**
   * vnd.japannet-directory-service
   */
  APPLICATION_VND_JAPANNET_DIRECTORY_SERVICE( "vnd.japannet-directory-service", "application/vnd.japannet-directory-service"),

  /**
   * vnd.japannet-jpnstore-wakeup
   */
  APPLICATION_VND_JAPANNET_JPNSTORE_WAKEUP( "vnd.japannet-jpnstore-wakeup", "application/vnd.japannet-jpnstore-wakeup"),

  /**
   * vnd.japannet-payment-wakeup
   */
  APPLICATION_VND_JAPANNET_PAYMENT_WAKEUP( "vnd.japannet-payment-wakeup", "application/vnd.japannet-payment-wakeup"),

  /**
   * vnd.japannet-registration
   */
  APPLICATION_VND_JAPANNET_REGISTRATION( "vnd.japannet-registration", "application/vnd.japannet-registration"),

  /**
   * vnd.japannet-registration-wakeup
   */
  APPLICATION_VND_JAPANNET_REGISTRATION_WAKEUP( "vnd.japannet-registration-wakeup", "application/vnd.japannet-registration-wakeup"),

  /**
   * vnd.japannet-setstore-wakeup
   */
  APPLICATION_VND_JAPANNET_SETSTORE_WAKEUP( "vnd.japannet-setstore-wakeup", "application/vnd.japannet-setstore-wakeup"),

  /**
   * vnd.japannet-verification
   */
  APPLICATION_VND_JAPANNET_VERIFICATION( "vnd.japannet-verification", "application/vnd.japannet-verification"),

  /**
   * vnd.japannet-verification-wakeup
   */
  APPLICATION_VND_JAPANNET_VERIFICATION_WAKEUP( "vnd.japannet-verification-wakeup", "application/vnd.japannet-verification-wakeup"),

  /**
   * Mobile Information Device Profile
   */
  APPLICATION_VND_JCP_JAVAME_MIDLET_RMS( "Mobile Information Device Profile", "application/vnd.jcp.javame.midlet-rms"),

  /**
   * RhymBox
   */
  APPLICATION_VND_JISP( "RhymBox", "application/vnd.jisp"),

  /**
   * Joda Archive
   */
  APPLICATION_VND_JOOST_JODA_ARCHIVE( "Joda Archive", "application/vnd.joost.joda-archive"),

  /**
   * vnd.jsk.isdn-ngn
   */
  APPLICATION_VND_JSK_ISDN_NGN( "vnd.jsk.isdn-ngn", "application/vnd.jsk.isdn-ngn"),

  /**
   * Kahootz
   */
  APPLICATION_VND_KAHOOTZ( "Kahootz", "application/vnd.kahootz"),

  /**
   * KDE KOffice Office Suite - Karbon
   */
  APPLICATION_VND_KDE_KARBON( "KDE KOffice Office Suite - Karbon", "application/vnd.kde.karbon"),

  /**
   * KDE KOffice Office Suite - KChart
   */
  APPLICATION_VND_KDE_KCHART( "KDE KOffice Office Suite - KChart", "application/vnd.kde.kchart"),

  /**
   * KDE KOffice Office Suite - Kformula
   */
  APPLICATION_VND_KDE_KFORMULA( "KDE KOffice Office Suite - Kformula", "application/vnd.kde.kformula"),

  /**
   * KDE KOffice Office Suite - Kivio
   */
  APPLICATION_VND_KDE_KIVIO( "KDE KOffice Office Suite - Kivio", "application/vnd.kde.kivio"),

  /**
   * KDE KOffice Office Suite - Kontour
   */
  APPLICATION_VND_KDE_KONTOUR( "KDE KOffice Office Suite - Kontour", "application/vnd.kde.kontour"),

  /**
   * KDE KOffice Office Suite - Kpresenter
   */
  APPLICATION_VND_KDE_KPRESENTER( "KDE KOffice Office Suite - Kpresenter", "application/vnd.kde.kpresenter"),

  /**
   * KDE KOffice Office Suite - Kspread
   */
  APPLICATION_VND_KDE_KSPREAD( "KDE KOffice Office Suite - Kspread", "application/vnd.kde.kspread"),

  /**
   * KDE KOffice Office Suite - Kword
   */
  APPLICATION_VND_KDE_KWORD( "KDE KOffice Office Suite - Kword", "application/vnd.kde.kword"),

  /**
   * Kenamea App
   */
  APPLICATION_VND_KENAMEAAPP( "Kenamea App", "application/vnd.kenameaapp"),

  /**
   * Kidspiration
   */
  APPLICATION_VND_KIDSPIRATION( "Kidspiration", "application/vnd.kidspiration"),

  /**
   * Kinar Applications
   */
  APPLICATION_VND_KINAR( "Kinar Applications", "application/vnd.kinar"),

  /**
   * SSEYO Koan Play File
   */
  APPLICATION_VND_KOAN( "SSEYO Koan Play File", "application/vnd.koan"),

  /**
   * Kodak Storyshare
   */
  APPLICATION_VND_KODAK_DESCRIPTOR( "Kodak Storyshare", "application/vnd.kodak-descriptor"),

  /**
   * vnd.las
   */
  APPLICATION_VND_LAS( "vnd.las", "application/vnd.las"),

  /**
   * vnd.las.las+json
   */
  APPLICATION_VND_LAS_LAS_JSON( "vnd.las.las+json", "application/vnd.las.las+json"),

  /**
   * Laser App Enterprise
   */
  APPLICATION_VND_LAS_LAS_XML( "Laser App Enterprise", "application/vnd.las.las+xml"),

  /**
   * vnd.laszip
   */
  APPLICATION_VND_LASZIP( "vnd.laszip", "application/vnd.laszip"),

  /**
   * vnd.leap+json
   */
  APPLICATION_VND_LEAP_JSON( "vnd.leap+json", "application/vnd.leap+json"),

  /**
   * vnd.liberty-request+xml
   */
  APPLICATION_VND_LIBERTY_REQUEST_XML( "vnd.liberty-request+xml", "application/vnd.liberty-request+xml"),

  /**
   * Life Balance - Desktop Edition
   */
  APPLICATION_VND_LLAMAGRAPHICS_LIFE_BALANCE_DESKTOP( "Life Balance - Desktop Edition", "application/vnd.llamagraphics.life-balance.desktop"),

  /**
   * Life Balance - Exchange Format
   */
  APPLICATION_VND_LLAMAGRAPHICS_LIFE_BALANCE_EXCHANGE_XML( "Life Balance - Exchange Format", "application/vnd.llamagraphics.life-balance.exchange+xml"),

  /**
   * vnd.logipipe.circuit+zip
   */
  APPLICATION_VND_LOGIPIPE_CIRCUIT_ZIP( "vnd.logipipe.circuit+zip", "application/vnd.logipipe.circuit+zip"),

  /**
   * vnd.loom
   */
  APPLICATION_VND_LOOM( "vnd.loom", "application/vnd.loom"),

  /**
   * Lotus 1-2-3
   */
  APPLICATION_VND_LOTUS_1_2_3( "Lotus 1-2-3", "application/vnd.lotus-1-2-3"),

  /**
   * Lotus Approach
   */
  APPLICATION_VND_LOTUS_APPROACH( "Lotus Approach", "application/vnd.lotus-approach"),

  /**
   * Lotus Freelance
   */
  APPLICATION_VND_LOTUS_FREELANCE( "Lotus Freelance", "application/vnd.lotus-freelance"),

  /**
   * Lotus Notes
   */
  APPLICATION_VND_LOTUS_NOTES( "Lotus Notes", "application/vnd.lotus-notes"),

  /**
   * Lotus Organizer
   */
  APPLICATION_VND_LOTUS_ORGANIZER( "Lotus Organizer", "application/vnd.lotus-organizer"),

  /**
   * Lotus Screencam
   */
  APPLICATION_VND_LOTUS_SCREENCAM( "Lotus Screencam", "application/vnd.lotus-screencam"),

  /**
   * Lotus Wordpro
   */
  APPLICATION_VND_LOTUS_WORDPRO( "Lotus Wordpro", "application/vnd.lotus-wordpro"),

  /**
   * MacPorts Port System
   */
  APPLICATION_VND_MACPORTS_PORTPKG( "MacPorts Port System", "application/vnd.macports.portpkg"),

  /**
   * vnd.mapbox-vector-tile
   */
  APPLICATION_VND_MAPBOX_VECTOR_TILE( "vnd.mapbox-vector-tile", "application/vnd.mapbox-vector-tile"),

  /**
   * vnd.marlin.drm.actiontoken+xml
   */
  APPLICATION_VND_MARLIN_DRM_ACTIONTOKEN_XML( "vnd.marlin.drm.actiontoken+xml", "application/vnd.marlin.drm.actiontoken+xml"),

  /**
   * vnd.marlin.drm.conftoken+xml
   */
  APPLICATION_VND_MARLIN_DRM_CONFTOKEN_XML( "vnd.marlin.drm.conftoken+xml", "application/vnd.marlin.drm.conftoken+xml"),

  /**
   * vnd.marlin.drm.license+xml
   */
  APPLICATION_VND_MARLIN_DRM_LICENSE_XML( "vnd.marlin.drm.license+xml", "application/vnd.marlin.drm.license+xml"),

  /**
   * vnd.marlin.drm.mdcf
   */
  APPLICATION_VND_MARLIN_DRM_MDCF( "vnd.marlin.drm.mdcf", "application/vnd.marlin.drm.mdcf"),

  /**
   * vnd.mason+json
   */
  APPLICATION_VND_MASON_JSON( "vnd.mason+json", "application/vnd.mason+json"),

  /**
   * vnd.maxmind.maxmind-db
   */
  APPLICATION_VND_MAXMIND_MAXMIND_DB( "vnd.maxmind.maxmind-db", "application/vnd.maxmind.maxmind-db"),

  /**
   * Micro CADAM Helix D&amp;D
   */
  APPLICATION_VND_MCD( "Micro CADAM Helix D&amp;D", "application/vnd.mcd"),

  /**
   * MedCalc
   */
  APPLICATION_VND_MEDCALCDATA( "MedCalc", "application/vnd.medcalcdata"),

  /**
   * MediaRemote
   */
  APPLICATION_VND_MEDIASTATION_CDKEY( "MediaRemote", "application/vnd.mediastation.cdkey"),

  /**
   * vnd.meridian-slingshot
   */
  APPLICATION_VND_MERIDIAN_SLINGSHOT( "vnd.meridian-slingshot", "application/vnd.meridian-slingshot"),

  /**
   * Medical Waveform Encoding Format
   */
  APPLICATION_VND_MFER( "Medical Waveform Encoding Format", "application/vnd.mfer"),

  /**
   * Melody Format for Mobile Platform
   */
  APPLICATION_VND_MFMP( "Melody Format for Mobile Platform", "application/vnd.mfmp"),

  /**
   * vnd.micro+json
   */
  APPLICATION_VND_MICRO_JSON( "vnd.micro+json", "application/vnd.micro+json"),

  /**
   * Micrografx
   */
  APPLICATION_VND_MICROGRAFX_FLO( "Micrografx", "application/vnd.micrografx.flo"),

  /**
   * Micrografx iGrafx Professional
   */
  APPLICATION_VND_MICROGRAFX_IGX( "Micrografx iGrafx Professional", "application/vnd.micrografx.igx"),

  /**
   * vnd.microsoft.portable-executable
   */
  APPLICATION_VND_MICROSOFT_PORTABLE_EXECUTABLE( "vnd.microsoft.portable-executable", "application/vnd.microsoft.portable-executable"),

  /**
   * vnd.microsoft.windows.thumbnail-cache
   */
  APPLICATION_VND_MICROSOFT_WINDOWS_THUMBNAIL_CACHE( "vnd.microsoft.windows.thumbnail-cache", "application/vnd.microsoft.windows.thumbnail-cache"),

  /**
   * vnd.miele+json
   */
  APPLICATION_VND_MIELE_JSON( "vnd.miele+json", "application/vnd.miele+json"),

  /**
   * FrameMaker Interchange Format
   */
  APPLICATION_VND_MIF( "FrameMaker Interchange Format", "application/vnd.mif"),

  /**
   * vnd.minisoft-hp3000-save
   */
  APPLICATION_VND_MINISOFT_HP3000_SAVE( "vnd.minisoft-hp3000-save", "application/vnd.minisoft-hp3000-save"),

  /**
   * vnd.mitsubishi.misty-guard.trustweb
   */
  APPLICATION_VND_MITSUBISHI_MISTY_GUARD_TRUSTWEB( "vnd.mitsubishi.misty-guard.trustweb", "application/vnd.mitsubishi.misty-guard.trustweb"),

  /**
   * Mobius Management Systems - UniversalArchive
   */
  APPLICATION_VND_MOBIUS_DAF( "Mobius Management Systems - UniversalArchive", "application/vnd.mobius.daf"),

  /**
   * Mobius Management Systems - Distribution Database
   */
  APPLICATION_VND_MOBIUS_DIS( "Mobius Management Systems - Distribution Database", "application/vnd.mobius.dis"),

  /**
   * Mobius Management Systems - Basket file
   */
  APPLICATION_VND_MOBIUS_MBK( "Mobius Management Systems - Basket file", "application/vnd.mobius.mbk"),

  /**
   * Mobius Management Systems - Query File
   */
  APPLICATION_VND_MOBIUS_MQY( "Mobius Management Systems - Query File", "application/vnd.mobius.mqy"),

  /**
   * Mobius Management Systems - Script Language
   */
  APPLICATION_VND_MOBIUS_MSL( "Mobius Management Systems - Script Language", "application/vnd.mobius.msl"),

  /**
   * Mobius Management Systems - Policy Definition Language File
   */
  APPLICATION_VND_MOBIUS_PLC( "Mobius Management Systems - Policy Definition Language File", "application/vnd.mobius.plc"),

  /**
   * Mobius Management Systems - Topic Index File
   */
  APPLICATION_VND_MOBIUS_TXF( "Mobius Management Systems - Topic Index File", "application/vnd.mobius.txf"),

  /**
   * Mophun VM
   */
  APPLICATION_VND_MOPHUN_APPLICATION( "Mophun VM", "application/vnd.mophun.application"),

  /**
   * Mophun Certificate
   */
  APPLICATION_VND_MOPHUN_CERTIFICATE( "Mophun Certificate", "application/vnd.mophun.certificate"),

  /**
   * vnd.motorola.flexsuite
   */
  APPLICATION_VND_MOTOROLA_FLEXSUITE( "vnd.motorola.flexsuite", "application/vnd.motorola.flexsuite"),

  /**
   * vnd.motorola.flexsuite.adsi
   */
  APPLICATION_VND_MOTOROLA_FLEXSUITE_ADSI( "vnd.motorola.flexsuite.adsi", "application/vnd.motorola.flexsuite.adsi"),

  /**
   * vnd.motorola.flexsuite.fis
   */
  APPLICATION_VND_MOTOROLA_FLEXSUITE_FIS( "vnd.motorola.flexsuite.fis", "application/vnd.motorola.flexsuite.fis"),

  /**
   * vnd.motorola.flexsuite.gotap
   */
  APPLICATION_VND_MOTOROLA_FLEXSUITE_GOTAP( "vnd.motorola.flexsuite.gotap", "application/vnd.motorola.flexsuite.gotap"),

  /**
   * vnd.motorola.flexsuite.kmr
   */
  APPLICATION_VND_MOTOROLA_FLEXSUITE_KMR( "vnd.motorola.flexsuite.kmr", "application/vnd.motorola.flexsuite.kmr"),

  /**
   * vnd.motorola.flexsuite.ttc
   */
  APPLICATION_VND_MOTOROLA_FLEXSUITE_TTC( "vnd.motorola.flexsuite.ttc", "application/vnd.motorola.flexsuite.ttc"),

  /**
   * vnd.motorola.flexsuite.wem
   */
  APPLICATION_VND_MOTOROLA_FLEXSUITE_WEM( "vnd.motorola.flexsuite.wem", "application/vnd.motorola.flexsuite.wem"),

  /**
   * vnd.motorola.iprm
   */
  APPLICATION_VND_MOTOROLA_IPRM( "vnd.motorola.iprm", "application/vnd.motorola.iprm"),

  /**
   * XUL - XML User Interface Language
   */
  APPLICATION_VND_MOZILLA_XUL_XML( "XUL - XML User Interface Language", "application/vnd.mozilla.xul+xml"),

  /**
   * vnd.ms-3mfdocument
   */
  APPLICATION_VND_MS_3MFDOCUMENT( "vnd.ms-3mfdocument", "application/vnd.ms-3mfdocument"),

  /**
   * vnd.ms-PrintDeviceCapabilities+xml
   */
  APPLICATION_VND_MS_PRINTDEVICECAPABILITIES_XML( "vnd.ms-PrintDeviceCapabilities+xml", "application/vnd.ms-PrintDeviceCapabilities+xml"),

  /**
   * vnd.ms-PrintSchemaTicket+xml
   */
  APPLICATION_VND_MS_PRINTSCHEMATICKET_XML( "vnd.ms-PrintSchemaTicket+xml", "application/vnd.ms-PrintSchemaTicket+xml"),

  /**
   * Microsoft Artgalry
   */
  APPLICATION_VND_MS_ARTGALRY( "Microsoft Artgalry", "application/vnd.ms-artgalry"),

  /**
   * vnd.ms-asf
   */
  APPLICATION_VND_MS_ASF( "vnd.ms-asf", "application/vnd.ms-asf"),

  /**
   * Microsoft Cabinet File
   */
  APPLICATION_VND_MS_CAB_COMPRESSED( "Microsoft Cabinet File", "application/vnd.ms-cab-compressed"),

  /**
   * Microsoft Excel
   */
  APPLICATION_VND_MS_EXCEL( "Microsoft Excel", "application/vnd.ms-excel"),

  /**
   * Microsoft Excel - Add-In File
   */
  APPLICATION_VND_MS_EXCEL_ADDIN_MACROENABLED_12( "Microsoft Excel - Add-In File", "application/vnd.ms-excel.addin.macroenabled.12"),

  /**
   * Microsoft Excel - Binary Workbook
   */
  APPLICATION_VND_MS_EXCEL_SHEET_BINARY_MACROENABLED_12( "Microsoft Excel - Binary Workbook", "application/vnd.ms-excel.sheet.binary.macroenabled.12"),

  /**
   * Microsoft Excel - Macro-Enabled Workbook
   */
  APPLICATION_VND_MS_EXCEL_SHEET_MACROENABLED_12( "Microsoft Excel - Macro-Enabled Workbook", "application/vnd.ms-excel.sheet.macroenabled.12"),

  /**
   * Microsoft Excel - Macro-Enabled Template File
   */
  APPLICATION_VND_MS_EXCEL_TEMPLATE_MACROENABLED_12( "Microsoft Excel - Macro-Enabled Template File", "application/vnd.ms-excel.template.macroenabled.12"),

  /**
   * Microsoft Embedded OpenType
   */
  APPLICATION_VND_MS_FONTOBJECT( "Microsoft Embedded OpenType", "application/vnd.ms-fontobject"),

  /**
   * Microsoft Html Help File
   */
  APPLICATION_VND_MS_HTMLHELP( "Microsoft Html Help File", "application/vnd.ms-htmlhelp"),

  /**
   * Microsoft Class Server
   */
  APPLICATION_VND_MS_IMS( "Microsoft Class Server", "application/vnd.ms-ims"),

  /**
   * Microsoft Learning Resource Module
   */
  APPLICATION_VND_MS_LRM( "Microsoft Learning Resource Module", "application/vnd.ms-lrm"),

  /**
   * vnd.ms-office.activeX+xml
   */
  APPLICATION_VND_MS_OFFICE_ACTIVEX_XML( "vnd.ms-office.activeX+xml", "application/vnd.ms-office.activeX+xml"),

  /**
   * Microsoft Office System Release Theme
   */
  APPLICATION_VND_MS_OFFICETHEME( "Microsoft Office System Release Theme", "application/vnd.ms-officetheme"),

  /**
   * Microsoft Trust UI Provider - Security Catalog
   */
  APPLICATION_VND_MS_PKI_SECCAT( "Microsoft Trust UI Provider - Security Catalog", "application/vnd.ms-pki.seccat"),

  /**
   * Microsoft Trust UI Provider - Certificate Trust Link
   */
  APPLICATION_VND_MS_PKI_STL( "Microsoft Trust UI Provider - Certificate Trust Link", "application/vnd.ms-pki.stl"),

  /**
   * vnd.ms-playready.initiator+xml
   */
  APPLICATION_VND_MS_PLAYREADY_INITIATOR_XML( "vnd.ms-playready.initiator+xml", "application/vnd.ms-playready.initiator+xml"),

  /**
   * Microsoft PowerPoint
   */
  APPLICATION_VND_MS_POWERPOINT( "Microsoft PowerPoint", "application/vnd.ms-powerpoint"),

  /**
   * Microsoft PowerPoint - Add-in file
   */
  APPLICATION_VND_MS_POWERPOINT_ADDIN_MACROENABLED_12( "Microsoft PowerPoint - Add-in file", "application/vnd.ms-powerpoint.addin.macroenabled.12"),

  /**
   * Microsoft PowerPoint - Macro-Enabled Presentation File
   */
  APPLICATION_VND_MS_POWERPOINT_PRESENTATION_MACROENABLED_12( "Microsoft PowerPoint - Macro-Enabled Presentation File", "application/vnd.ms-powerpoint.presentation.macroenabled.12"),

  /**
   * Microsoft PowerPoint - Macro-Enabled Open XML Slide
   */
  APPLICATION_VND_MS_POWERPOINT_SLIDE_MACROENABLED_12( "Microsoft PowerPoint - Macro-Enabled Open XML Slide", "application/vnd.ms-powerpoint.slide.macroenabled.12"),

  /**
   * Microsoft PowerPoint - Macro-Enabled Slide Show File
   */
  APPLICATION_VND_MS_POWERPOINT_SLIDESHOW_MACROENABLED_12( "Microsoft PowerPoint - Macro-Enabled Slide Show File", "application/vnd.ms-powerpoint.slideshow.macroenabled.12"),

  /**
   * Microsoft PowerPoint - Macro-Enabled Template File
   */
  APPLICATION_VND_MS_POWERPOINT_TEMPLATE_MACROENABLED_12( "Microsoft PowerPoint - Macro-Enabled Template File", "application/vnd.ms-powerpoint.template.macroenabled.12"),

  /**
   * Microsoft Project
   */
  APPLICATION_VND_MS_PROJECT( "Microsoft Project", "application/vnd.ms-project"),

  /**
   * vnd.ms-tnef
   */
  APPLICATION_VND_MS_TNEF( "vnd.ms-tnef", "application/vnd.ms-tnef"),

  /**
   * vnd.ms-windows.devicepairing
   */
  APPLICATION_VND_MS_WINDOWS_DEVICEPAIRING( "vnd.ms-windows.devicepairing", "application/vnd.ms-windows.devicepairing"),

  /**
   * vnd.ms-windows.nwprinting.oob
   */
  APPLICATION_VND_MS_WINDOWS_NWPRINTING_OOB( "vnd.ms-windows.nwprinting.oob", "application/vnd.ms-windows.nwprinting.oob"),

  /**
   * vnd.ms-windows.printerpairing
   */
  APPLICATION_VND_MS_WINDOWS_PRINTERPAIRING( "vnd.ms-windows.printerpairing", "application/vnd.ms-windows.printerpairing"),

  /**
   * vnd.ms-windows.wsd.oob
   */
  APPLICATION_VND_MS_WINDOWS_WSD_OOB( "vnd.ms-windows.wsd.oob", "application/vnd.ms-windows.wsd.oob"),

  /**
   * vnd.ms-wmdrm.lic-chlg-req
   */
  APPLICATION_VND_MS_WMDRM_LIC_CHLG_REQ( "vnd.ms-wmdrm.lic-chlg-req", "application/vnd.ms-wmdrm.lic-chlg-req"),

  /**
   * vnd.ms-wmdrm.lic-resp
   */
  APPLICATION_VND_MS_WMDRM_LIC_RESP( "vnd.ms-wmdrm.lic-resp", "application/vnd.ms-wmdrm.lic-resp"),

  /**
   * vnd.ms-wmdrm.meter-chlg-req
   */
  APPLICATION_VND_MS_WMDRM_METER_CHLG_REQ( "vnd.ms-wmdrm.meter-chlg-req", "application/vnd.ms-wmdrm.meter-chlg-req"),

  /**
   * vnd.ms-wmdrm.meter-resp
   */
  APPLICATION_VND_MS_WMDRM_METER_RESP( "vnd.ms-wmdrm.meter-resp", "application/vnd.ms-wmdrm.meter-resp"),

  /**
   * Microsoft Word - Macro-Enabled Document
   */
  APPLICATION_VND_MS_WORD_DOCUMENT_MACROENABLED_12( "Microsoft Word - Macro-Enabled Document", "application/vnd.ms-word.document.macroenabled.12"),

  /**
   * Microsoft Word - Macro-Enabled Template
   */
  APPLICATION_VND_MS_WORD_TEMPLATE_MACROENABLED_12( "Microsoft Word - Macro-Enabled Template", "application/vnd.ms-word.template.macroenabled.12"),

  /**
   * Microsoft Works
   */
  APPLICATION_VND_MS_WORKS( "Microsoft Works", "application/vnd.ms-works"),

  /**
   * Microsoft Windows Media Player Playlist
   */
  APPLICATION_VND_MS_WPL( "Microsoft Windows Media Player Playlist", "application/vnd.ms-wpl"),

  /**
   * Microsoft XML Paper Specification
   */
  APPLICATION_VND_MS_XPSDOCUMENT( "Microsoft XML Paper Specification", "application/vnd.ms-xpsdocument"),

  /**
   * vnd.msa-disk-image
   */
  APPLICATION_VND_MSA_DISK_IMAGE( "vnd.msa-disk-image", "application/vnd.msa-disk-image"),

  /**
   * 3GPP MSEQ File
   */
  APPLICATION_VND_MSEQ( "3GPP MSEQ File", "application/vnd.mseq"),

  /**
   * vnd.msign
   */
  APPLICATION_VND_MSIGN( "vnd.msign", "application/vnd.msign"),

  /**
   * vnd.multiad.creator
   */
  APPLICATION_VND_MULTIAD_CREATOR( "vnd.multiad.creator", "application/vnd.multiad.creator"),

  /**
   * vnd.multiad.creator.cif
   */
  APPLICATION_VND_MULTIAD_CREATOR_CIF( "vnd.multiad.creator.cif", "application/vnd.multiad.creator.cif"),

  /**
   * vnd.music-niff
   */
  APPLICATION_VND_MUSIC_NIFF( "vnd.music-niff", "application/vnd.music-niff"),

  /**
   * MUsical Score Interpreted Code Invented  for the ASCII designation of Notation
   */
  APPLICATION_VND_MUSICIAN( "MUsical Score Interpreted Code Invented  for the ASCII designation of Notation", "application/vnd.musician"),

  /**
   * Muvee Automatic Video Editing
   */
  APPLICATION_VND_MUVEE_STYLE( "Muvee Automatic Video Editing", "application/vnd.muvee.style"),

  /**
   * vnd.mynfc
   */
  APPLICATION_VND_MYNFC( "vnd.mynfc", "application/vnd.mynfc"),

  /**
   * vnd.ncd.control
   */
  APPLICATION_VND_NCD_CONTROL( "vnd.ncd.control", "application/vnd.ncd.control"),

  /**
   * vnd.ncd.reference
   */
  APPLICATION_VND_NCD_REFERENCE( "vnd.ncd.reference", "application/vnd.ncd.reference"),

  /**
   * vnd.nearst.inv+json
   */
  APPLICATION_VND_NEARST_INV_JSON( "vnd.nearst.inv+json", "application/vnd.nearst.inv+json"),

  /**
   * vnd.nervana
   */
  APPLICATION_VND_NERVANA( "vnd.nervana", "application/vnd.nervana"),

  /**
   * vnd.netfpx
   */
  APPLICATION_VND_NETFPX( "vnd.netfpx", "application/vnd.netfpx"),

  /**
   * neuroLanguage
   */
  APPLICATION_VND_NEUROLANGUAGE_NLU( "neuroLanguage", "application/vnd.neurolanguage.nlu"),

  /**
   * vnd.nimn
   */
  APPLICATION_VND_NIMN( "vnd.nimn", "application/vnd.nimn"),

  /**
   * vnd.nintendo.nitro.rom
   */
  APPLICATION_VND_NINTENDO_NITRO_ROM( "vnd.nintendo.nitro.rom", "application/vnd.nintendo.nitro.rom"),

  /**
   * vnd.nintendo.snes.rom
   */
  APPLICATION_VND_NINTENDO_SNES_ROM( "vnd.nintendo.snes.rom", "application/vnd.nintendo.snes.rom"),

  /**
   * vnd.nitf
   */
  APPLICATION_VND_NITF( "vnd.nitf", "application/vnd.nitf"),

  /**
   * NobleNet Directory
   */
  APPLICATION_VND_NOBLENET_DIRECTORY( "NobleNet Directory", "application/vnd.noblenet-directory"),

  /**
   * NobleNet Sealer
   */
  APPLICATION_VND_NOBLENET_SEALER( "NobleNet Sealer", "application/vnd.noblenet-sealer"),

  /**
   * NobleNet Web
   */
  APPLICATION_VND_NOBLENET_WEB( "NobleNet Web", "application/vnd.noblenet-web"),

  /**
   * vnd.nokia.catalogs
   */
  APPLICATION_VND_NOKIA_CATALOGS( "vnd.nokia.catalogs", "application/vnd.nokia.catalogs"),

  /**
   * vnd.nokia.conml+wbxml
   */
  APPLICATION_VND_NOKIA_CONML_WBXML( "vnd.nokia.conml+wbxml", "application/vnd.nokia.conml+wbxml"),

  /**
   * vnd.nokia.conml+xml
   */
  APPLICATION_VND_NOKIA_CONML_XML( "vnd.nokia.conml+xml", "application/vnd.nokia.conml+xml"),

  /**
   * vnd.nokia.iSDS-radio-presets
   */
  APPLICATION_VND_NOKIA_ISDS_RADIO_PRESETS( "vnd.nokia.iSDS-radio-presets", "application/vnd.nokia.iSDS-radio-presets"),

  /**
   * vnd.nokia.iptv.config+xml
   */
  APPLICATION_VND_NOKIA_IPTV_CONFIG_XML( "vnd.nokia.iptv.config+xml", "application/vnd.nokia.iptv.config+xml"),

  /**
   * vnd.nokia.landmark+wbxml
   */
  APPLICATION_VND_NOKIA_LANDMARK_WBXML( "vnd.nokia.landmark+wbxml", "application/vnd.nokia.landmark+wbxml"),

  /**
   * vnd.nokia.landmark+xml
   */
  APPLICATION_VND_NOKIA_LANDMARK_XML( "vnd.nokia.landmark+xml", "application/vnd.nokia.landmark+xml"),

  /**
   * vnd.nokia.landmarkcollection+xml
   */
  APPLICATION_VND_NOKIA_LANDMARKCOLLECTION_XML( "vnd.nokia.landmarkcollection+xml", "application/vnd.nokia.landmarkcollection+xml"),

  /**
   * vnd.nokia.n-gage.ac+xml
   */
  APPLICATION_VND_NOKIA_N_GAGE_AC_XML( "vnd.nokia.n-gage.ac+xml", "application/vnd.nokia.n-gage.ac+xml"),

  /**
   * N-Gage Game Data
   */
  APPLICATION_VND_NOKIA_N_GAGE_DATA( "N-Gage Game Data", "application/vnd.nokia.n-gage.data"),

  /**
   * N-Gage Game Installer
   */
  APPLICATION_VND_NOKIA_N_GAGE_SYMBIAN_INSTALL( "N-Gage Game Installer", "application/vnd.nokia.n-gage.symbian.install"),

  /**
   * vnd.nokia.ncd
   */
  APPLICATION_VND_NOKIA_NCD( "vnd.nokia.ncd", "application/vnd.nokia.ncd"),

  /**
   * vnd.nokia.pcd+wbxml
   */
  APPLICATION_VND_NOKIA_PCD_WBXML( "vnd.nokia.pcd+wbxml", "application/vnd.nokia.pcd+wbxml"),

  /**
   * vnd.nokia.pcd+xml
   */
  APPLICATION_VND_NOKIA_PCD_XML( "vnd.nokia.pcd+xml", "application/vnd.nokia.pcd+xml"),

  /**
   * Nokia Radio Application - Preset
   */
  APPLICATION_VND_NOKIA_RADIO_PRESET( "Nokia Radio Application - Preset", "application/vnd.nokia.radio-preset"),

  /**
   * Nokia Radio Application - Preset
   */
  APPLICATION_VND_NOKIA_RADIO_PRESETS( "Nokia Radio Application - Preset", "application/vnd.nokia.radio-presets"),

  /**
   * Novadigms RADIA and EDM products
   */
  APPLICATION_VND_NOVADIGM_EDM( "Novadigm&#x27;s RADIA and EDM products", "application/vnd.novadigm.edm"),

  /**
   * Novadigms RADIA and EDM products
   */
  APPLICATION_VND_NOVADIGM_EDX( "Novadigm&#x27;s RADIA and EDM products", "application/vnd.novadigm.edx"),

  /**
   * Novadigms RADIA and EDM products
   */
  APPLICATION_VND_NOVADIGM_EXT( "Novadigm&#x27;s RADIA and EDM products", "application/vnd.novadigm.ext"),

  /**
   * vnd.ntt-local.content-share
   */
  APPLICATION_VND_NTT_LOCAL_CONTENT_SHARE( "vnd.ntt-local.content-share", "application/vnd.ntt-local.content-share"),

  /**
   * vnd.ntt-local.file-transfer
   */
  APPLICATION_VND_NTT_LOCAL_FILE_TRANSFER( "vnd.ntt-local.file-transfer", "application/vnd.ntt-local.file-transfer"),

  /**
   * vnd.ntt-local.ogw_remote-access
   */
  APPLICATION_VND_NTT_LOCAL_OGW_REMOTE_ACCESS( "vnd.ntt-local.ogw_remote-access", "application/vnd.ntt-local.ogw_remote-access"),

  /**
   * vnd.ntt-local.sip-ta_remote
   */
  APPLICATION_VND_NTT_LOCAL_SIP_TA_REMOTE( "vnd.ntt-local.sip-ta_remote", "application/vnd.ntt-local.sip-ta_remote"),

  /**
   * vnd.ntt-local.sip-ta_tcp_stream
   */
  APPLICATION_VND_NTT_LOCAL_SIP_TA_TCP_STREAM( "vnd.ntt-local.sip-ta_tcp_stream", "application/vnd.ntt-local.sip-ta_tcp_stream"),

  /**
   * OpenDocument Chart
   */
  APPLICATION_VND_OASIS_OPENDOCUMENT_CHART( "OpenDocument Chart", "application/vnd.oasis.opendocument.chart"),

  /**
   * OpenDocument Chart Template
   */
  APPLICATION_VND_OASIS_OPENDOCUMENT_CHART_TEMPLATE( "OpenDocument Chart Template", "application/vnd.oasis.opendocument.chart-template"),

  /**
   * OpenDocument Database
   */
  APPLICATION_VND_OASIS_OPENDOCUMENT_DATABASE( "OpenDocument Database", "application/vnd.oasis.opendocument.database"),

  /**
   * OpenDocument Formula
   */
  APPLICATION_VND_OASIS_OPENDOCUMENT_FORMULA( "OpenDocument Formula", "application/vnd.oasis.opendocument.formula"),

  /**
   * OpenDocument Formula Template
   */
  APPLICATION_VND_OASIS_OPENDOCUMENT_FORMULA_TEMPLATE( "OpenDocument Formula Template", "application/vnd.oasis.opendocument.formula-template"),

  /**
   * OpenDocument Graphics
   */
  APPLICATION_VND_OASIS_OPENDOCUMENT_GRAPHICS( "OpenDocument Graphics", "application/vnd.oasis.opendocument.graphics"),

  /**
   * OpenDocument Graphics Template
   */
  APPLICATION_VND_OASIS_OPENDOCUMENT_GRAPHICS_TEMPLATE( "OpenDocument Graphics Template", "application/vnd.oasis.opendocument.graphics-template"),

  /**
   * OpenDocument Image
   */
  APPLICATION_VND_OASIS_OPENDOCUMENT_IMAGE( "OpenDocument Image", "application/vnd.oasis.opendocument.image"),

  /**
   * OpenDocument Image Template
   */
  APPLICATION_VND_OASIS_OPENDOCUMENT_IMAGE_TEMPLATE( "OpenDocument Image Template", "application/vnd.oasis.opendocument.image-template"),

  /**
   * OpenDocument Presentation
   */
  APPLICATION_VND_OASIS_OPENDOCUMENT_PRESENTATION( "OpenDocument Presentation", "application/vnd.oasis.opendocument.presentation"),

  /**
   * OpenDocument Presentation Template
   */
  APPLICATION_VND_OASIS_OPENDOCUMENT_PRESENTATION_TEMPLATE( "OpenDocument Presentation Template", "application/vnd.oasis.opendocument.presentation-template"),

  /**
   * OpenDocument Spreadsheet
   */
  APPLICATION_VND_OASIS_OPENDOCUMENT_SPREADSHEET( "OpenDocument Spreadsheet", "application/vnd.oasis.opendocument.spreadsheet"),

  /**
   * OpenDocument Spreadsheet Template
   */
  APPLICATION_VND_OASIS_OPENDOCUMENT_SPREADSHEET_TEMPLATE( "OpenDocument Spreadsheet Template", "application/vnd.oasis.opendocument.spreadsheet-template"),

  /**
   * OpenDocument Text
   */
  APPLICATION_VND_OASIS_OPENDOCUMENT_TEXT( "OpenDocument Text", "application/vnd.oasis.opendocument.text"),

  /**
   * OpenDocument Text Master
   */
  APPLICATION_VND_OASIS_OPENDOCUMENT_TEXT_MASTER( "OpenDocument Text Master", "application/vnd.oasis.opendocument.text-master"),

  /**
   * OpenDocument Text Template
   */
  APPLICATION_VND_OASIS_OPENDOCUMENT_TEXT_TEMPLATE( "OpenDocument Text Template", "application/vnd.oasis.opendocument.text-template"),

  /**
   * Open Document Text Web
   */
  APPLICATION_VND_OASIS_OPENDOCUMENT_TEXT_WEB( "Open Document Text Web", "application/vnd.oasis.opendocument.text-web"),

  /**
   * vnd.obn
   */
  APPLICATION_VND_OBN( "vnd.obn", "application/vnd.obn"),

  /**
   * vnd.ocf+cbor
   */
  APPLICATION_VND_OCF_CBOR( "vnd.ocf+cbor", "application/vnd.ocf+cbor"),

  /**
   * vnd.oci.image.manifest.v1+json
   */
  APPLICATION_VND_OCI_IMAGE_MANIFEST_V1_JSON( "vnd.oci.image.manifest.v1+json", "application/vnd.oci.image.manifest.v1+json"),

  /**
   * vnd.oftn.l10n+json
   */
  APPLICATION_VND_OFTN_L10N_JSON( "vnd.oftn.l10n+json", "application/vnd.oftn.l10n+json"),

  /**
   * vnd.oipf.contentaccessdownload+xml
   */
  APPLICATION_VND_OIPF_CONTENTACCESSDOWNLOAD_XML( "vnd.oipf.contentaccessdownload+xml", "application/vnd.oipf.contentaccessdownload+xml"),

  /**
   * vnd.oipf.contentaccessstreaming+xml
   */
  APPLICATION_VND_OIPF_CONTENTACCESSSTREAMING_XML( "vnd.oipf.contentaccessstreaming+xml", "application/vnd.oipf.contentaccessstreaming+xml"),

  /**
   * vnd.oipf.cspg-hexbinary
   */
  APPLICATION_VND_OIPF_CSPG_HEXBINARY( "vnd.oipf.cspg-hexbinary", "application/vnd.oipf.cspg-hexbinary"),

  /**
   * vnd.oipf.dae.svg+xml
   */
  APPLICATION_VND_OIPF_DAE_SVG_XML( "vnd.oipf.dae.svg+xml", "application/vnd.oipf.dae.svg+xml"),

  /**
   * vnd.oipf.dae.xhtml+xml
   */
  APPLICATION_VND_OIPF_DAE_XHTML_XML( "vnd.oipf.dae.xhtml+xml", "application/vnd.oipf.dae.xhtml+xml"),

  /**
   * vnd.oipf.mippvcontrolmessage+xml
   */
  APPLICATION_VND_OIPF_MIPPVCONTROLMESSAGE_XML( "vnd.oipf.mippvcontrolmessage+xml", "application/vnd.oipf.mippvcontrolmessage+xml"),

  /**
   * vnd.oipf.pae.gem
   */
  APPLICATION_VND_OIPF_PAE_GEM( "vnd.oipf.pae.gem", "application/vnd.oipf.pae.gem"),

  /**
   * vnd.oipf.spdiscovery+xml
   */
  APPLICATION_VND_OIPF_SPDISCOVERY_XML( "vnd.oipf.spdiscovery+xml", "application/vnd.oipf.spdiscovery+xml"),

  /**
   * vnd.oipf.spdlist+xml
   */
  APPLICATION_VND_OIPF_SPDLIST_XML( "vnd.oipf.spdlist+xml", "application/vnd.oipf.spdlist+xml"),

  /**
   * vnd.oipf.ueprofile+xml
   */
  APPLICATION_VND_OIPF_UEPROFILE_XML( "vnd.oipf.ueprofile+xml", "application/vnd.oipf.ueprofile+xml"),

  /**
   * vnd.oipf.userprofile+xml
   */
  APPLICATION_VND_OIPF_USERPROFILE_XML( "vnd.oipf.userprofile+xml", "application/vnd.oipf.userprofile+xml"),

  /**
   * Sugar Linux Application Bundle
   */
  APPLICATION_VND_OLPC_SUGAR( "Sugar Linux Application Bundle", "application/vnd.olpc-sugar"),

  /**
   * vnd.oma-scws-config
   */
  APPLICATION_VND_OMA_SCWS_CONFIG( "vnd.oma-scws-config", "application/vnd.oma-scws-config"),

  /**
   * vnd.oma-scws-http-request
   */
  APPLICATION_VND_OMA_SCWS_HTTP_REQUEST( "vnd.oma-scws-http-request", "application/vnd.oma-scws-http-request"),

  /**
   * vnd.oma-scws-http-response
   */
  APPLICATION_VND_OMA_SCWS_HTTP_RESPONSE( "vnd.oma-scws-http-response", "application/vnd.oma-scws-http-response"),

  /**
   * vnd.oma.bcast.associated-procedure-parameter+xml
   */
  APPLICATION_VND_OMA_BCAST_ASSOCIATED_PROCEDURE_PARAMETER_XML( "vnd.oma.bcast.associated-procedure-parameter+xml", "application/vnd.oma.bcast.associated-procedure-parameter+xml"),

  /**
   * vnd.oma.bcast.drm-trigger+xml
   */
  APPLICATION_VND_OMA_BCAST_DRM_TRIGGER_XML( "vnd.oma.bcast.drm-trigger+xml", "application/vnd.oma.bcast.drm-trigger+xml"),

  /**
   * vnd.oma.bcast.imd+xml
   */
  APPLICATION_VND_OMA_BCAST_IMD_XML( "vnd.oma.bcast.imd+xml", "application/vnd.oma.bcast.imd+xml"),

  /**
   * vnd.oma.bcast.ltkm
   */
  APPLICATION_VND_OMA_BCAST_LTKM( "vnd.oma.bcast.ltkm", "application/vnd.oma.bcast.ltkm"),

  /**
   * vnd.oma.bcast.notification+xml
   */
  APPLICATION_VND_OMA_BCAST_NOTIFICATION_XML( "vnd.oma.bcast.notification+xml", "application/vnd.oma.bcast.notification+xml"),

  /**
   * vnd.oma.bcast.provisioningtrigger
   */
  APPLICATION_VND_OMA_BCAST_PROVISIONINGTRIGGER( "vnd.oma.bcast.provisioningtrigger", "application/vnd.oma.bcast.provisioningtrigger"),

  /**
   * vnd.oma.bcast.sgboot
   */
  APPLICATION_VND_OMA_BCAST_SGBOOT( "vnd.oma.bcast.sgboot", "application/vnd.oma.bcast.sgboot"),

  /**
   * vnd.oma.bcast.sgdd+xml
   */
  APPLICATION_VND_OMA_BCAST_SGDD_XML( "vnd.oma.bcast.sgdd+xml", "application/vnd.oma.bcast.sgdd+xml"),

  /**
   * vnd.oma.bcast.sgdu
   */
  APPLICATION_VND_OMA_BCAST_SGDU( "vnd.oma.bcast.sgdu", "application/vnd.oma.bcast.sgdu"),

  /**
   * vnd.oma.bcast.simple-symbol-container
   */
  APPLICATION_VND_OMA_BCAST_SIMPLE_SYMBOL_CONTAINER( "vnd.oma.bcast.simple-symbol-container", "application/vnd.oma.bcast.simple-symbol-container"),

  /**
   * vnd.oma.bcast.smartcard-trigger+xml
   */
  APPLICATION_VND_OMA_BCAST_SMARTCARD_TRIGGER_XML( "vnd.oma.bcast.smartcard-trigger+xml", "application/vnd.oma.bcast.smartcard-trigger+xml"),

  /**
   * vnd.oma.bcast.sprov+xml
   */
  APPLICATION_VND_OMA_BCAST_SPROV_XML( "vnd.oma.bcast.sprov+xml", "application/vnd.oma.bcast.sprov+xml"),

  /**
   * vnd.oma.bcast.stkm
   */
  APPLICATION_VND_OMA_BCAST_STKM( "vnd.oma.bcast.stkm", "application/vnd.oma.bcast.stkm"),

  /**
   * vnd.oma.cab-address-book+xml
   */
  APPLICATION_VND_OMA_CAB_ADDRESS_BOOK_XML( "vnd.oma.cab-address-book+xml", "application/vnd.oma.cab-address-book+xml"),

  /**
   * vnd.oma.cab-feature-handler+xml
   */
  APPLICATION_VND_OMA_CAB_FEATURE_HANDLER_XML( "vnd.oma.cab-feature-handler+xml", "application/vnd.oma.cab-feature-handler+xml"),

  /**
   * vnd.oma.cab-pcc+xml
   */
  APPLICATION_VND_OMA_CAB_PCC_XML( "vnd.oma.cab-pcc+xml", "application/vnd.oma.cab-pcc+xml"),

  /**
   * vnd.oma.cab-subs-invite+xml
   */
  APPLICATION_VND_OMA_CAB_SUBS_INVITE_XML( "vnd.oma.cab-subs-invite+xml", "application/vnd.oma.cab-subs-invite+xml"),

  /**
   * vnd.oma.cab-user-prefs+xml
   */
  APPLICATION_VND_OMA_CAB_USER_PREFS_XML( "vnd.oma.cab-user-prefs+xml", "application/vnd.oma.cab-user-prefs+xml"),

  /**
   * vnd.oma.dcd
   */
  APPLICATION_VND_OMA_DCD( "vnd.oma.dcd", "application/vnd.oma.dcd"),

  /**
   * vnd.oma.dcdc
   */
  APPLICATION_VND_OMA_DCDC( "vnd.oma.dcdc", "application/vnd.oma.dcdc"),

  /**
   * OMA Download Agents
   */
  APPLICATION_VND_OMA_DD2_XML( "OMA Download Agents", "application/vnd.oma.dd2+xml"),

  /**
   * vnd.oma.drm.risd+xml
   */
  APPLICATION_VND_OMA_DRM_RISD_XML( "vnd.oma.drm.risd+xml", "application/vnd.oma.drm.risd+xml"),

  /**
   * vnd.oma.group-usage-list+xml
   */
  APPLICATION_VND_OMA_GROUP_USAGE_LIST_XML( "vnd.oma.group-usage-list+xml", "application/vnd.oma.group-usage-list+xml"),

  /**
   * vnd.oma.lwm2m+cbor
   */
  APPLICATION_VND_OMA_LWM2M_CBOR( "vnd.oma.lwm2m+cbor", "application/vnd.oma.lwm2m+cbor"),

  /**
   * vnd.oma.lwm2m+json
   */
  APPLICATION_VND_OMA_LWM2M_JSON( "vnd.oma.lwm2m+json", "application/vnd.oma.lwm2m+json"),

  /**
   * vnd.oma.lwm2m+tlv
   */
  APPLICATION_VND_OMA_LWM2M_TLV( "vnd.oma.lwm2m+tlv", "application/vnd.oma.lwm2m+tlv"),

  /**
   * vnd.oma.pal+xml
   */
  APPLICATION_VND_OMA_PAL_XML( "vnd.oma.pal+xml", "application/vnd.oma.pal+xml"),

  /**
   * vnd.oma.poc.detailed-progress-report+xml
   */
  APPLICATION_VND_OMA_POC_DETAILED_PROGRESS_REPORT_XML( "vnd.oma.poc.detailed-progress-report+xml", "application/vnd.oma.poc.detailed-progress-report+xml"),

  /**
   * vnd.oma.poc.final-report+xml
   */
  APPLICATION_VND_OMA_POC_FINAL_REPORT_XML( "vnd.oma.poc.final-report+xml", "application/vnd.oma.poc.final-report+xml"),

  /**
   * vnd.oma.poc.groups+xml
   */
  APPLICATION_VND_OMA_POC_GROUPS_XML( "vnd.oma.poc.groups+xml", "application/vnd.oma.poc.groups+xml"),

  /**
   * vnd.oma.poc.invocation-descriptor+xml
   */
  APPLICATION_VND_OMA_POC_INVOCATION_DESCRIPTOR_XML( "vnd.oma.poc.invocation-descriptor+xml", "application/vnd.oma.poc.invocation-descriptor+xml"),

  /**
   * vnd.oma.poc.optimized-progress-report+xml
   */
  APPLICATION_VND_OMA_POC_OPTIMIZED_PROGRESS_REPORT_XML( "vnd.oma.poc.optimized-progress-report+xml", "application/vnd.oma.poc.optimized-progress-report+xml"),

  /**
   * vnd.oma.push
   */
  APPLICATION_VND_OMA_PUSH( "vnd.oma.push", "application/vnd.oma.push"),

  /**
   * vnd.oma.scidm.messages+xml
   */
  APPLICATION_VND_OMA_SCIDM_MESSAGES_XML( "vnd.oma.scidm.messages+xml", "application/vnd.oma.scidm.messages+xml"),

  /**
   * vnd.oma.xcap-directory+xml
   */
  APPLICATION_VND_OMA_XCAP_DIRECTORY_XML( "vnd.oma.xcap-directory+xml", "application/vnd.oma.xcap-directory+xml"),

  /**
   * vnd.omads-email+xml
   */
  APPLICATION_VND_OMADS_EMAIL_XML( "vnd.omads-email+xml", "application/vnd.omads-email+xml"),

  /**
   * vnd.omads-file+xml
   */
  APPLICATION_VND_OMADS_FILE_XML( "vnd.omads-file+xml", "application/vnd.omads-file+xml"),

  /**
   * vnd.omads-folder+xml
   */
  APPLICATION_VND_OMADS_FOLDER_XML( "vnd.omads-folder+xml", "application/vnd.omads-folder+xml"),

  /**
   * vnd.omaloc-supl-init
   */
  APPLICATION_VND_OMALOC_SUPL_INIT( "vnd.omaloc-supl-init", "application/vnd.omaloc-supl-init"),

  /**
   * vnd.onepager
   */
  APPLICATION_VND_ONEPAGER( "vnd.onepager", "application/vnd.onepager"),

  /**
   * vnd.onepagertamp
   */
  APPLICATION_VND_ONEPAGERTAMP( "vnd.onepagertamp", "application/vnd.onepagertamp"),

  /**
   * vnd.onepagertamx
   */
  APPLICATION_VND_ONEPAGERTAMX( "vnd.onepagertamx", "application/vnd.onepagertamx"),

  /**
   * vnd.onepagertat
   */
  APPLICATION_VND_ONEPAGERTAT( "vnd.onepagertat", "application/vnd.onepagertat"),

  /**
   * vnd.onepagertatp
   */
  APPLICATION_VND_ONEPAGERTATP( "vnd.onepagertatp", "application/vnd.onepagertatp"),

  /**
   * vnd.onepagertatx
   */
  APPLICATION_VND_ONEPAGERTATX( "vnd.onepagertatx", "application/vnd.onepagertatx"),

  /**
   * vnd.openblox.game+xml
   */
  APPLICATION_VND_OPENBLOX_GAME_XML( "vnd.openblox.game+xml", "application/vnd.openblox.game+xml"),

  /**
   * vnd.openblox.game-binary
   */
  APPLICATION_VND_OPENBLOX_GAME_BINARY( "vnd.openblox.game-binary", "application/vnd.openblox.game-binary"),

  /**
   * vnd.openeye.oeb
   */
  APPLICATION_VND_OPENEYE_OEB( "vnd.openeye.oeb", "application/vnd.openeye.oeb"),

  /**
   * Open Office Extension
   */
  APPLICATION_VND_OPENOFFICEORG_EXTENSION( "Open Office Extension", "application/vnd.openofficeorg.extension"),

  /**
   * vnd.openstreetmap.data+xml
   */
  APPLICATION_VND_OPENSTREETMAP_DATA_XML( "vnd.openstreetmap.data+xml", "application/vnd.openstreetmap.data+xml"),

  /**
   * vnd.openxmlformats-officedocument.custom-properties+xml
   */
  APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_CUSTOM_PROPERTIES_XML( "vnd.openxmlformats-officedocument.custom-properties+xml", "application/vnd.openxmlformats-officedocument.custom-properties+xml"),

  /**
   * vnd.openxmlformats-officedocument.customXmlProperties+xml
   */
  APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_CUSTOMXMLPROPERTIES_XML( "vnd.openxmlformats-officedocument.customXmlProperties+xml", "application/vnd.openxmlformats-officedocument.customXmlProperties+xml"),

  /**
   * vnd.openxmlformats-officedocument.drawing+xml
   */
  APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_DRAWING_XML( "vnd.openxmlformats-officedocument.drawing+xml", "application/vnd.openxmlformats-officedocument.drawing+xml"),

  /**
   * vnd.openxmlformats-officedocument.drawingml.chart+xml
   */
  APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_DRAWINGML_CHART_XML( "vnd.openxmlformats-officedocument.drawingml.chart+xml", "application/vnd.openxmlformats-officedocument.drawingml.chart+xml"),

  /**
   * vnd.openxmlformats-officedocument.drawingml.chartshapes+xml
   */
  APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_DRAWINGML_CHARTSHAPES_XML( "vnd.openxmlformats-officedocument.drawingml.chartshapes+xml", "application/vnd.openxmlformats-officedocument.drawingml.chartshapes+xml"),

  /**
   * vnd.openxmlformats-officedocument.drawingml.diagramColors+xml
   */
  APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_DRAWINGML_DIAGRAMCOLORS_XML( "vnd.openxmlformats-officedocument.drawingml.diagramColors+xml", "application/vnd.openxmlformats-officedocument.drawingml.diagramColors+xml"),

  /**
   * vnd.openxmlformats-officedocument.drawingml.diagramData+xml
   */
  APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_DRAWINGML_DIAGRAMDATA_XML( "vnd.openxmlformats-officedocument.drawingml.diagramData+xml", "application/vnd.openxmlformats-officedocument.drawingml.diagramData+xml"),

  /**
   * vnd.openxmlformats-officedocument.drawingml.diagramLayout+xml
   */
  APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_DRAWINGML_DIAGRAMLAYOUT_XML( "vnd.openxmlformats-officedocument.drawingml.diagramLayout+xml", "application/vnd.openxmlformats-officedocument.drawingml.diagramLayout+xml"),

  /**
   * vnd.openxmlformats-officedocument.drawingml.diagramStyle+xml
   */
  APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_DRAWINGML_DIAGRAMSTYLE_XML( "vnd.openxmlformats-officedocument.drawingml.diagramStyle+xml", "application/vnd.openxmlformats-officedocument.drawingml.diagramStyle+xml"),

  /**
   * vnd.openxmlformats-officedocument.extended-properties+xml
   */
  APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_EXTENDED_PROPERTIES_XML( "vnd.openxmlformats-officedocument.extended-properties+xml", "application/vnd.openxmlformats-officedocument.extended-properties+xml"),

  /**
   * vnd.openxmlformats-officedocument.presentationml.commentAuthors+xml
   */
  APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_PRESENTATIONML_COMMENTAUTHORS_XML( "vnd.openxmlformats-officedocument.presentationml.commentAuthors+xml", "application/vnd.openxmlformats-officedocument.presentationml.commentAuthors+xml"),

  /**
   * vnd.openxmlformats-officedocument.presentationml.comments+xml
   */
  APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_PRESENTATIONML_COMMENTS_XML( "vnd.openxmlformats-officedocument.presentationml.comments+xml", "application/vnd.openxmlformats-officedocument.presentationml.comments+xml"),

  /**
   * vnd.openxmlformats-officedocument.presentationml.handoutMaster+xml
   */
  APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_PRESENTATIONML_HANDOUTMASTER_XML( "vnd.openxmlformats-officedocument.presentationml.handoutMaster+xml", "application/vnd.openxmlformats-officedocument.presentationml.handoutMaster+xml"),

  /**
   * vnd.openxmlformats-officedocument.presentationml.notesMaster+xml
   */
  APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_PRESENTATIONML_NOTESMASTER_XML( "vnd.openxmlformats-officedocument.presentationml.notesMaster+xml", "application/vnd.openxmlformats-officedocument.presentationml.notesMaster+xml"),

  /**
   * vnd.openxmlformats-officedocument.presentationml.notesSlide+xml
   */
  APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_PRESENTATIONML_NOTESSLIDE_XML( "vnd.openxmlformats-officedocument.presentationml.notesSlide+xml", "application/vnd.openxmlformats-officedocument.presentationml.notesSlide+xml"),

  /**
   * vnd.openxmlformats-officedocument.presentationml.presProps+xml
   */
  APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_PRESENTATIONML_PRESPROPS_XML( "vnd.openxmlformats-officedocument.presentationml.presProps+xml", "application/vnd.openxmlformats-officedocument.presentationml.presProps+xml"),

  /**
   * Microsoft Office - OOXML - Presentation
   */
  APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_PRESENTATIONML_PRESENTATION( "Microsoft Office - OOXML - Presentation", "application/vnd.openxmlformats-officedocument.presentationml.presentation"),

  /**
   * vnd.openxmlformats-officedocument.presentationml.presentation.main+xml
   */
  APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_PRESENTATIONML_PRESENTATION_MAIN_XML( "vnd.openxmlformats-officedocument.presentationml.presentation.main+xml", "application/vnd.openxmlformats-officedocument.presentationml.presentation.main+xml"),

  /**
   * Microsoft Office - OOXML - Presentation (Slide)
   */
  APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_PRESENTATIONML_SLIDE( "Microsoft Office - OOXML - Presentation (Slide)", "application/vnd.openxmlformats-officedocument.presentationml.slide"),

  /**
   * vnd.openxmlformats-officedocument.presentationml.slide+xml
   */
  APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_PRESENTATIONML_SLIDE_XML( "vnd.openxmlformats-officedocument.presentationml.slide+xml", "application/vnd.openxmlformats-officedocument.presentationml.slide+xml"),

  /**
   * vnd.openxmlformats-officedocument.presentationml.slideLayout+xml
   */
  APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_PRESENTATIONML_SLIDELAYOUT_XML( "vnd.openxmlformats-officedocument.presentationml.slideLayout+xml", "application/vnd.openxmlformats-officedocument.presentationml.slideLayout+xml"),

  /**
   * vnd.openxmlformats-officedocument.presentationml.slideMaster+xml
   */
  APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_PRESENTATIONML_SLIDEMASTER_XML( "vnd.openxmlformats-officedocument.presentationml.slideMaster+xml", "application/vnd.openxmlformats-officedocument.presentationml.slideMaster+xml"),

  /**
   * vnd.openxmlformats-officedocument.presentationml.slideUpdateInfo+xml
   */
  APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_PRESENTATIONML_SLIDEUPDATEINFO_XML( "vnd.openxmlformats-officedocument.presentationml.slideUpdateInfo+xml", "application/vnd.openxmlformats-officedocument.presentationml.slideUpdateInfo+xml"),

  /**
   * Microsoft Office - OOXML - Presentation (Slideshow)
   */
  APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_PRESENTATIONML_SLIDESHOW( "Microsoft Office - OOXML - Presentation (Slideshow)", "application/vnd.openxmlformats-officedocument.presentationml.slideshow"),

  /**
   * vnd.openxmlformats-officedocument.presentationml.slideshow.main+xml
   */
  APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_PRESENTATIONML_SLIDESHOW_MAIN_XML( "vnd.openxmlformats-officedocument.presentationml.slideshow.main+xml", "application/vnd.openxmlformats-officedocument.presentationml.slideshow.main+xml"),

  /**
   * vnd.openxmlformats-officedocument.presentationml.tableStyles+xml
   */
  APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_PRESENTATIONML_TABLESTYLES_XML( "vnd.openxmlformats-officedocument.presentationml.tableStyles+xml", "application/vnd.openxmlformats-officedocument.presentationml.tableStyles+xml"),

  /**
   * vnd.openxmlformats-officedocument.presentationml.tags+xml
   */
  APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_PRESENTATIONML_TAGS_XML( "vnd.openxmlformats-officedocument.presentationml.tags+xml", "application/vnd.openxmlformats-officedocument.presentationml.tags+xml"),

  /**
   * Microsoft Office - OOXML - Presentation Template
   */
  APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_PRESENTATIONML_TEMPLATE( "Microsoft Office - OOXML - Presentation Template", "application/vnd.openxmlformats-officedocument.presentationml.template"),

  /**
   * vnd.openxmlformats-officedocument.presentationml.template.main+xml
   */
  APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_PRESENTATIONML_TEMPLATE_MAIN_XML( "vnd.openxmlformats-officedocument.presentationml.template.main+xml", "application/vnd.openxmlformats-officedocument.presentationml.template.main+xml"),

  /**
   * vnd.openxmlformats-officedocument.presentationml.viewProps+xml
   */
  APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_PRESENTATIONML_VIEWPROPS_XML( "vnd.openxmlformats-officedocument.presentationml.viewProps+xml", "application/vnd.openxmlformats-officedocument.presentationml.viewProps+xml"),

  /**
   * vnd.openxmlformats-officedocument.spreadsheetml.calcChain+xml
   */
  APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_SPREADSHEETML_CALCCHAIN_XML( "vnd.openxmlformats-officedocument.spreadsheetml.calcChain+xml", "application/vnd.openxmlformats-officedocument.spreadsheetml.calcChain+xml"),

  /**
   * vnd.openxmlformats-officedocument.spreadsheetml.chartsheet+xml
   */
  APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_SPREADSHEETML_CHARTSHEET_XML( "vnd.openxmlformats-officedocument.spreadsheetml.chartsheet+xml", "application/vnd.openxmlformats-officedocument.spreadsheetml.chartsheet+xml"),

  /**
   * vnd.openxmlformats-officedocument.spreadsheetml.comments+xml
   */
  APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_SPREADSHEETML_COMMENTS_XML( "vnd.openxmlformats-officedocument.spreadsheetml.comments+xml", "application/vnd.openxmlformats-officedocument.spreadsheetml.comments+xml"),

  /**
   * vnd.openxmlformats-officedocument.spreadsheetml.connections+xml
   */
  APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_SPREADSHEETML_CONNECTIONS_XML( "vnd.openxmlformats-officedocument.spreadsheetml.connections+xml", "application/vnd.openxmlformats-officedocument.spreadsheetml.connections+xml"),

  /**
   * vnd.openxmlformats-officedocument.spreadsheetml.dialogsheet+xml
   */
  APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_SPREADSHEETML_DIALOGSHEET_XML( "vnd.openxmlformats-officedocument.spreadsheetml.dialogsheet+xml", "application/vnd.openxmlformats-officedocument.spreadsheetml.dialogsheet+xml"),

  /**
   * vnd.openxmlformats-officedocument.spreadsheetml.externalLink+xml
   */
  APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_SPREADSHEETML_EXTERNALLINK_XML( "vnd.openxmlformats-officedocument.spreadsheetml.externalLink+xml", "application/vnd.openxmlformats-officedocument.spreadsheetml.externalLink+xml"),

  /**
   * vnd.openxmlformats-officedocument.spreadsheetml.pivotCacheDefinition+xml
   */
  APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_SPREADSHEETML_PIVOTCACHEDEFINITION_XML( "vnd.openxmlformats-officedocument.spreadsheetml.pivotCacheDefinition+xml", "application/vnd.openxmlformats-officedocument.spreadsheetml.pivotCacheDefinition+xml"),

  /**
   * vnd.openxmlformats-officedocument.spreadsheetml.pivotCacheRecords+xml
   */
  APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_SPREADSHEETML_PIVOTCACHERECORDS_XML( "vnd.openxmlformats-officedocument.spreadsheetml.pivotCacheRecords+xml", "application/vnd.openxmlformats-officedocument.spreadsheetml.pivotCacheRecords+xml"),

  /**
   * vnd.openxmlformats-officedocument.spreadsheetml.pivotTable+xml
   */
  APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_SPREADSHEETML_PIVOTTABLE_XML( "vnd.openxmlformats-officedocument.spreadsheetml.pivotTable+xml", "application/vnd.openxmlformats-officedocument.spreadsheetml.pivotTable+xml"),

  /**
   * vnd.openxmlformats-officedocument.spreadsheetml.queryTable+xml
   */
  APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_SPREADSHEETML_QUERYTABLE_XML( "vnd.openxmlformats-officedocument.spreadsheetml.queryTable+xml", "application/vnd.openxmlformats-officedocument.spreadsheetml.queryTable+xml"),

  /**
   * vnd.openxmlformats-officedocument.spreadsheetml.revisionHeaders+xml
   */
  APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_SPREADSHEETML_REVISIONHEADERS_XML( "vnd.openxmlformats-officedocument.spreadsheetml.revisionHeaders+xml", "application/vnd.openxmlformats-officedocument.spreadsheetml.revisionHeaders+xml"),

  /**
   * vnd.openxmlformats-officedocument.spreadsheetml.revisionLog+xml
   */
  APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_SPREADSHEETML_REVISIONLOG_XML( "vnd.openxmlformats-officedocument.spreadsheetml.revisionLog+xml", "application/vnd.openxmlformats-officedocument.spreadsheetml.revisionLog+xml"),

  /**
   * vnd.openxmlformats-officedocument.spreadsheetml.sharedStrings+xml
   */
  APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_SPREADSHEETML_SHAREDSTRINGS_XML( "vnd.openxmlformats-officedocument.spreadsheetml.sharedStrings+xml", "application/vnd.openxmlformats-officedocument.spreadsheetml.sharedStrings+xml"),

  /**
   * Microsoft Office - OOXML - Spreadsheet
   */
  APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_SPREADSHEETML_SHEET( "Microsoft Office - OOXML - Spreadsheet", "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet"),

  /**
   * vnd.openxmlformats-officedocument.spreadsheetml.sheet.main+xml
   */
  APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_SPREADSHEETML_SHEET_MAIN_XML( "vnd.openxmlformats-officedocument.spreadsheetml.sheet.main+xml", "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet.main+xml"),

  /**
   * vnd.openxmlformats-officedocument.spreadsheetml.sheetMetadata+xml
   */
  APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_SPREADSHEETML_SHEETMETADATA_XML( "vnd.openxmlformats-officedocument.spreadsheetml.sheetMetadata+xml", "application/vnd.openxmlformats-officedocument.spreadsheetml.sheetMetadata+xml"),

  /**
   * vnd.openxmlformats-officedocument.spreadsheetml.styles+xml
   */
  APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_SPREADSHEETML_STYLES_XML( "vnd.openxmlformats-officedocument.spreadsheetml.styles+xml", "application/vnd.openxmlformats-officedocument.spreadsheetml.styles+xml"),

  /**
   * vnd.openxmlformats-officedocument.spreadsheetml.table+xml
   */
  APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_SPREADSHEETML_TABLE_XML( "vnd.openxmlformats-officedocument.spreadsheetml.table+xml", "application/vnd.openxmlformats-officedocument.spreadsheetml.table+xml"),

  /**
   * vnd.openxmlformats-officedocument.spreadsheetml.tableSingleCells+xml
   */
  APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_SPREADSHEETML_TABLESINGLECELLS_XML( "vnd.openxmlformats-officedocument.spreadsheetml.tableSingleCells+xml", "application/vnd.openxmlformats-officedocument.spreadsheetml.tableSingleCells+xml"),

  /**
   * Microsoft Office - OOXML - Spreadsheet Template
   */
  APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_SPREADSHEETML_TEMPLATE( "Microsoft Office - OOXML - Spreadsheet Template", "application/vnd.openxmlformats-officedocument.spreadsheetml.template"),

  /**
   * vnd.openxmlformats-officedocument.spreadsheetml.template.main+xml
   */
  APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_SPREADSHEETML_TEMPLATE_MAIN_XML( "vnd.openxmlformats-officedocument.spreadsheetml.template.main+xml", "application/vnd.openxmlformats-officedocument.spreadsheetml.template.main+xml"),

  /**
   * vnd.openxmlformats-officedocument.spreadsheetml.userNames+xml
   */
  APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_SPREADSHEETML_USERNAMES_XML( "vnd.openxmlformats-officedocument.spreadsheetml.userNames+xml", "application/vnd.openxmlformats-officedocument.spreadsheetml.userNames+xml"),

  /**
   * vnd.openxmlformats-officedocument.spreadsheetml.volatileDependencies+xml
   */
  APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_SPREADSHEETML_VOLATILEDEPENDENCIES_XML( "vnd.openxmlformats-officedocument.spreadsheetml.volatileDependencies+xml", "application/vnd.openxmlformats-officedocument.spreadsheetml.volatileDependencies+xml"),

  /**
   * vnd.openxmlformats-officedocument.spreadsheetml.worksheet+xml
   */
  APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_SPREADSHEETML_WORKSHEET_XML( "vnd.openxmlformats-officedocument.spreadsheetml.worksheet+xml", "application/vnd.openxmlformats-officedocument.spreadsheetml.worksheet+xml"),

  /**
   * vnd.openxmlformats-officedocument.theme+xml
   */
  APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_THEME_XML( "vnd.openxmlformats-officedocument.theme+xml", "application/vnd.openxmlformats-officedocument.theme+xml"),

  /**
   * vnd.openxmlformats-officedocument.themeOverride+xml
   */
  APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_THEMEOVERRIDE_XML( "vnd.openxmlformats-officedocument.themeOverride+xml", "application/vnd.openxmlformats-officedocument.themeOverride+xml"),

  /**
   * vnd.openxmlformats-officedocument.vmlDrawing
   */
  APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_VMLDRAWING( "vnd.openxmlformats-officedocument.vmlDrawing", "application/vnd.openxmlformats-officedocument.vmlDrawing"),

  /**
   * vnd.openxmlformats-officedocument.wordprocessingml.comments+xml
   */
  APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_WORDPROCESSINGML_COMMENTS_XML( "vnd.openxmlformats-officedocument.wordprocessingml.comments+xml", "application/vnd.openxmlformats-officedocument.wordprocessingml.comments+xml"),

  /**
   * Microsoft Office - OOXML - Word Document
   */
  APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_WORDPROCESSINGML_DOCUMENT( "Microsoft Office - OOXML - Word Document", "application/vnd.openxmlformats-officedocument.wordprocessingml.document"),

  /**
   * vnd.openxmlformats-officedocument.wordprocessingml.document.glossary+xml
   */
  APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_WORDPROCESSINGML_DOCUMENT_GLOSSARY_XML( "vnd.openxmlformats-officedocument.wordprocessingml.document.glossary+xml", "application/vnd.openxmlformats-officedocument.wordprocessingml.document.glossary+xml"),

  /**
   * vnd.openxmlformats-officedocument.wordprocessingml.document.main+xml
   */
  APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_WORDPROCESSINGML_DOCUMENT_MAIN_XML( "vnd.openxmlformats-officedocument.wordprocessingml.document.main+xml", "application/vnd.openxmlformats-officedocument.wordprocessingml.document.main+xml"),

  /**
   * vnd.openxmlformats-officedocument.wordprocessingml.endnotes+xml
   */
  APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_WORDPROCESSINGML_ENDNOTES_XML( "vnd.openxmlformats-officedocument.wordprocessingml.endnotes+xml", "application/vnd.openxmlformats-officedocument.wordprocessingml.endnotes+xml"),

  /**
   * vnd.openxmlformats-officedocument.wordprocessingml.fontTable+xml
   */
  APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_WORDPROCESSINGML_FONTTABLE_XML( "vnd.openxmlformats-officedocument.wordprocessingml.fontTable+xml", "application/vnd.openxmlformats-officedocument.wordprocessingml.fontTable+xml"),

  /**
   * vnd.openxmlformats-officedocument.wordprocessingml.footer+xml
   */
  APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_WORDPROCESSINGML_FOOTER_XML( "vnd.openxmlformats-officedocument.wordprocessingml.footer+xml", "application/vnd.openxmlformats-officedocument.wordprocessingml.footer+xml"),

  /**
   * vnd.openxmlformats-officedocument.wordprocessingml.footnotes+xml
   */
  APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_WORDPROCESSINGML_FOOTNOTES_XML( "vnd.openxmlformats-officedocument.wordprocessingml.footnotes+xml", "application/vnd.openxmlformats-officedocument.wordprocessingml.footnotes+xml"),

  /**
   * vnd.openxmlformats-officedocument.wordprocessingml.numbering+xml
   */
  APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_WORDPROCESSINGML_NUMBERING_XML( "vnd.openxmlformats-officedocument.wordprocessingml.numbering+xml", "application/vnd.openxmlformats-officedocument.wordprocessingml.numbering+xml"),

  /**
   * vnd.openxmlformats-officedocument.wordprocessingml.settings+xml
   */
  APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_WORDPROCESSINGML_SETTINGS_XML( "vnd.openxmlformats-officedocument.wordprocessingml.settings+xml", "application/vnd.openxmlformats-officedocument.wordprocessingml.settings+xml"),

  /**
   * vnd.openxmlformats-officedocument.wordprocessingml.styles+xml
   */
  APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_WORDPROCESSINGML_STYLES_XML( "vnd.openxmlformats-officedocument.wordprocessingml.styles+xml", "application/vnd.openxmlformats-officedocument.wordprocessingml.styles+xml"),

  /**
   * Microsoft Office - OOXML - Word Document Template
   */
  APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_WORDPROCESSINGML_TEMPLATE( "Microsoft Office - OOXML - Word Document Template", "application/vnd.openxmlformats-officedocument.wordprocessingml.template"),

  /**
   * vnd.openxmlformats-officedocument.wordprocessingml.template.main+xml
   */
  APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_WORDPROCESSINGML_TEMPLATE_MAIN_XML( "vnd.openxmlformats-officedocument.wordprocessingml.template.main+xml", "application/vnd.openxmlformats-officedocument.wordprocessingml.template.main+xml"),

  /**
   * vnd.openxmlformats-officedocument.wordprocessingml.webSettings+xml
   */
  APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_WORDPROCESSINGML_WEBSETTINGS_XML( "vnd.openxmlformats-officedocument.wordprocessingml.webSettings+xml", "application/vnd.openxmlformats-officedocument.wordprocessingml.webSettings+xml"),

  /**
   * vnd.openxmlformats-package.core-properties+xml
   */
  APPLICATION_VND_OPENXMLFORMATS_PACKAGE_CORE_PROPERTIES_XML( "vnd.openxmlformats-package.core-properties+xml", "application/vnd.openxmlformats-package.core-properties+xml"),

  /**
   * vnd.openxmlformats-package.digital-signature-xmlsignature+xml
   */
  APPLICATION_VND_OPENXMLFORMATS_PACKAGE_DIGITAL_SIGNATURE_XMLSIGNATURE_XML( "vnd.openxmlformats-package.digital-signature-xmlsignature+xml", "application/vnd.openxmlformats-package.digital-signature-xmlsignature+xml"),

  /**
   * vnd.openxmlformats-package.relationships+xml
   */
  APPLICATION_VND_OPENXMLFORMATS_PACKAGE_RELATIONSHIPS_XML( "vnd.openxmlformats-package.relationships+xml", "application/vnd.openxmlformats-package.relationships+xml"),

  /**
   * vnd.oracle.resource+json
   */
  APPLICATION_VND_ORACLE_RESOURCE_JSON( "vnd.oracle.resource+json", "application/vnd.oracle.resource+json"),

  /**
   * vnd.orange.indata
   */
  APPLICATION_VND_ORANGE_INDATA( "vnd.orange.indata", "application/vnd.orange.indata"),

  /**
   * vnd.osa.netdeploy
   */
  APPLICATION_VND_OSA_NETDEPLOY( "vnd.osa.netdeploy", "application/vnd.osa.netdeploy"),

  /**
   * MapGuide DBXML
   */
  APPLICATION_VND_OSGEO_MAPGUIDE_PACKAGE( "MapGuide DBXML", "application/vnd.osgeo.mapguide.package"),

  /**
   * vnd.osgi.bundle
   */
  APPLICATION_VND_OSGI_BUNDLE( "vnd.osgi.bundle", "application/vnd.osgi.bundle"),

  /**
   * OSGi Deployment Package
   */
  APPLICATION_VND_OSGI_DP( "OSGi Deployment Package", "application/vnd.osgi.dp"),

  /**
   * vnd.osgi.subsystem
   */
  APPLICATION_VND_OSGI_SUBSYSTEM( "vnd.osgi.subsystem", "application/vnd.osgi.subsystem"),

  /**
   * vnd.otps.ct-kip+xml
   */
  APPLICATION_VND_OTPS_CT_KIP_XML( "vnd.otps.ct-kip+xml", "application/vnd.otps.ct-kip+xml"),

  /**
   * vnd.oxli.countgraph
   */
  APPLICATION_VND_OXLI_COUNTGRAPH( "vnd.oxli.countgraph", "application/vnd.oxli.countgraph"),

  /**
   * vnd.pagerduty+json
   */
  APPLICATION_VND_PAGERDUTY_JSON( "vnd.pagerduty+json", "application/vnd.pagerduty+json"),

  /**
   * PalmOS Data
   */
  APPLICATION_VND_PALM( "PalmOS Data", "application/vnd.palm"),

  /**
   * vnd.panoply
   */
  APPLICATION_VND_PANOPLY( "vnd.panoply", "application/vnd.panoply"),

  /**
   * vnd.paos.xml
   */
  APPLICATION_VND_PAOS_XML( "vnd.paos.xml", "application/vnd.paos.xml"),

  /**
   * vnd.patentdive
   */
  APPLICATION_VND_PATENTDIVE( "vnd.patentdive", "application/vnd.patentdive"),

  /**
   * vnd.patientecommsdoc
   */
  APPLICATION_VND_PATIENTECOMMSDOC( "vnd.patientecommsdoc", "application/vnd.patientecommsdoc"),

  /**
   * PawaaFILE
   */
  APPLICATION_VND_PAWAAFILE( "PawaaFILE", "application/vnd.pawaafile"),

  /**
   * vnd.pcos
   */
  APPLICATION_VND_PCOS( "vnd.pcos", "application/vnd.pcos"),

  /**
   * Proprietary P&amp;G Standard Reporting System
   */
  APPLICATION_VND_PG_FORMAT( "Proprietary P&amp;G Standard Reporting System", "application/vnd.pg.format"),

  /**
   * Proprietary P&amp;G Standard Reporting System
   */
  APPLICATION_VND_PG_OSASLI( "Proprietary P&amp;G Standard Reporting System", "application/vnd.pg.osasli"),

  /**
   * vnd.piaccess.application-licence
   */
  APPLICATION_VND_PIACCESS_APPLICATION_LICENCE( "vnd.piaccess.application-licence", "application/vnd.piaccess.application-licence"),

  /**
   * Pcsel eFIF File
   */
  APPLICATION_VND_PICSEL( "Pcsel eFIF File", "application/vnd.picsel"),

  /**
   * Qualcomm&#x27;s Plaza Mobile Internet
   */
  APPLICATION_VND_PMI_WIDGET( "Qualcomm&#x27;s Plaza Mobile Internet", "application/vnd.pmi.widget"),

  /**
   * vnd.poc.group-advertisement+xml
   */
  APPLICATION_VND_POC_GROUP_ADVERTISEMENT_XML( "vnd.poc.group-advertisement+xml", "application/vnd.poc.group-advertisement+xml"),

  /**
   * PocketLearn Viewers
   */
  APPLICATION_VND_POCKETLEARN( "PocketLearn Viewers", "application/vnd.pocketlearn"),

  /**
   * PowerBuilder
   */
  APPLICATION_VND_POWERBUILDER6( "PowerBuilder", "application/vnd.powerbuilder6"),

  /**
   * vnd.powerbuilder6-s
   */
  APPLICATION_VND_POWERBUILDER6_S( "vnd.powerbuilder6-s", "application/vnd.powerbuilder6-s"),

  /**
   * vnd.powerbuilder7
   */
  APPLICATION_VND_POWERBUILDER7( "vnd.powerbuilder7", "application/vnd.powerbuilder7"),

  /**
   * vnd.powerbuilder7-s
   */
  APPLICATION_VND_POWERBUILDER7_S( "vnd.powerbuilder7-s", "application/vnd.powerbuilder7-s"),

  /**
   * vnd.powerbuilder75
   */
  APPLICATION_VND_POWERBUILDER75( "vnd.powerbuilder75", "application/vnd.powerbuilder75"),

  /**
   * vnd.powerbuilder75-s
   */
  APPLICATION_VND_POWERBUILDER75_S( "vnd.powerbuilder75-s", "application/vnd.powerbuilder75-s"),

  /**
   * vnd.preminet
   */
  APPLICATION_VND_PREMINET( "vnd.preminet", "application/vnd.preminet"),

  /**
   * Preview Systems ZipLock/VBox
   */
  APPLICATION_VND_PREVIEWSYSTEMS_BOX( "Preview Systems ZipLock/VBox", "application/vnd.previewsystems.box"),

  /**
   * EFI Proteus
   */
  APPLICATION_VND_PROTEUS_MAGAZINE( "EFI Proteus", "application/vnd.proteus.magazine"),

  /**
   * vnd.psfs
   */
  APPLICATION_VND_PSFS( "vnd.psfs", "application/vnd.psfs"),

  /**
   * PubliShare Objects
   */
  APPLICATION_VND_PUBLISHARE_DELTA_TREE( "PubliShare Objects", "application/vnd.publishare-delta-tree"),

  /**
   * Princeton Video Image
   */
  APPLICATION_VND_PVI_PTID1( "Princeton Video Image", "application/vnd.pvi.ptid1"),

  /**
   * vnd.pwg-multiplexed
   */
  APPLICATION_VND_PWG_MULTIPLEXED( "vnd.pwg-multiplexed", "application/vnd.pwg-multiplexed"),

  /**
   * vnd.pwg-xhtml-print+xml
   */
  APPLICATION_VND_PWG_XHTML_PRINT_XML( "vnd.pwg-xhtml-print+xml", "application/vnd.pwg-xhtml-print+xml"),

  /**
   * vnd.qualcomm.brew-app-res
   */
  APPLICATION_VND_QUALCOMM_BREW_APP_RES( "vnd.qualcomm.brew-app-res", "application/vnd.qualcomm.brew-app-res"),

  /**
   * vnd.quarantainenet
   */
  APPLICATION_VND_QUARANTAINENET( "vnd.quarantainenet", "application/vnd.quarantainenet"),

  /**
   * QuarkXpress
   */
  APPLICATION_VND_QUARK_QUARKXPRESS( "QuarkXpress", "application/vnd.quark.quarkxpress"),

  /**
   * vnd.quobject-quoxdocument
   */
  APPLICATION_VND_QUOBJECT_QUOXDOCUMENT( "vnd.quobject-quoxdocument", "application/vnd.quobject-quoxdocument"),

  /**
   * vnd.radisys.moml+xml
   */
  APPLICATION_VND_RADISYS_MOML_XML( "vnd.radisys.moml+xml", "application/vnd.radisys.moml+xml"),

  /**
   * vnd.radisys.msml+xml
   */
  APPLICATION_VND_RADISYS_MSML_XML( "vnd.radisys.msml+xml", "application/vnd.radisys.msml+xml"),

  /**
   * vnd.radisys.msml-audit+xml
   */
  APPLICATION_VND_RADISYS_MSML_AUDIT_XML( "vnd.radisys.msml-audit+xml", "application/vnd.radisys.msml-audit+xml"),

  /**
   * vnd.radisys.msml-audit-conf+xml
   */
  APPLICATION_VND_RADISYS_MSML_AUDIT_CONF_XML( "vnd.radisys.msml-audit-conf+xml", "application/vnd.radisys.msml-audit-conf+xml"),

  /**
   * vnd.radisys.msml-audit-conn+xml
   */
  APPLICATION_VND_RADISYS_MSML_AUDIT_CONN_XML( "vnd.radisys.msml-audit-conn+xml", "application/vnd.radisys.msml-audit-conn+xml"),

  /**
   * vnd.radisys.msml-audit-dialog+xml
   */
  APPLICATION_VND_RADISYS_MSML_AUDIT_DIALOG_XML( "vnd.radisys.msml-audit-dialog+xml", "application/vnd.radisys.msml-audit-dialog+xml"),

  /**
   * vnd.radisys.msml-audit-stream+xml
   */
  APPLICATION_VND_RADISYS_MSML_AUDIT_STREAM_XML( "vnd.radisys.msml-audit-stream+xml", "application/vnd.radisys.msml-audit-stream+xml"),

  /**
   * vnd.radisys.msml-conf+xml
   */
  APPLICATION_VND_RADISYS_MSML_CONF_XML( "vnd.radisys.msml-conf+xml", "application/vnd.radisys.msml-conf+xml"),

  /**
   * vnd.radisys.msml-dialog+xml
   */
  APPLICATION_VND_RADISYS_MSML_DIALOG_XML( "vnd.radisys.msml-dialog+xml", "application/vnd.radisys.msml-dialog+xml"),

  /**
   * vnd.radisys.msml-dialog-base+xml
   */
  APPLICATION_VND_RADISYS_MSML_DIALOG_BASE_XML( "vnd.radisys.msml-dialog-base+xml", "application/vnd.radisys.msml-dialog-base+xml"),

  /**
   * vnd.radisys.msml-dialog-fax-detect+xml
   */
  APPLICATION_VND_RADISYS_MSML_DIALOG_FAX_DETECT_XML( "vnd.radisys.msml-dialog-fax-detect+xml", "application/vnd.radisys.msml-dialog-fax-detect+xml"),

  /**
   * vnd.radisys.msml-dialog-fax-sendrecv+xml
   */
  APPLICATION_VND_RADISYS_MSML_DIALOG_FAX_SENDRECV_XML( "vnd.radisys.msml-dialog-fax-sendrecv+xml", "application/vnd.radisys.msml-dialog-fax-sendrecv+xml"),

  /**
   * vnd.radisys.msml-dialog-group+xml
   */
  APPLICATION_VND_RADISYS_MSML_DIALOG_GROUP_XML( "vnd.radisys.msml-dialog-group+xml", "application/vnd.radisys.msml-dialog-group+xml"),

  /**
   * vnd.radisys.msml-dialog-speech+xml
   */
  APPLICATION_VND_RADISYS_MSML_DIALOG_SPEECH_XML( "vnd.radisys.msml-dialog-speech+xml", "application/vnd.radisys.msml-dialog-speech+xml"),

  /**
   * vnd.radisys.msml-dialog-transform+xml
   */
  APPLICATION_VND_RADISYS_MSML_DIALOG_TRANSFORM_XML( "vnd.radisys.msml-dialog-transform+xml", "application/vnd.radisys.msml-dialog-transform+xml"),

  /**
   * vnd.rainstor.data
   */
  APPLICATION_VND_RAINSTOR_DATA( "vnd.rainstor.data", "application/vnd.rainstor.data"),

  /**
   * vnd.rapid
   */
  APPLICATION_VND_RAPID( "vnd.rapid", "application/vnd.rapid"),

  /**
   * vnd.rar
   */
  APPLICATION_VND_RAR( "vnd.rar", "application/vnd.rar"),

  /**
   * RealVNC
   */
  APPLICATION_VND_REALVNC_BED( "RealVNC", "application/vnd.realvnc.bed"),

  /**
   * Recordare Applications
   */
  APPLICATION_VND_RECORDARE_MUSICXML( "Recordare Applications", "application/vnd.recordare.musicxml"),

  /**
   * Recordare Applications
   */
  APPLICATION_VND_RECORDARE_MUSICXML_XML( "Recordare Applications", "application/vnd.recordare.musicxml+xml"),

  /**
   * vnd.restful+json
   */
  APPLICATION_VND_RESTFUL_JSON( "vnd.restful+json", "application/vnd.restful+json"),

  /**
   * CryptoNote
   */
  APPLICATION_VND_RIG_CRYPTONOTE( "CryptoNote", "application/vnd.rig.cryptonote"),

  /**
   * Blackberry COD File
   */
  APPLICATION_VND_RIM_COD( "Blackberry COD File", "application/vnd.rim.cod"),

  /**
   * RealMedia
   */
  APPLICATION_VND_RN_REALMEDIA( "RealMedia", "application/vnd.rn-realmedia"),

  /**
   * ROUTE 66 Location Based Services
   */
  APPLICATION_VND_ROUTE66_LINK66_XML( "ROUTE 66 Location Based Services", "application/vnd.route66.link66+xml"),

  /**
   * vnd.rs-274x
   */
  APPLICATION_VND_RS_274X( "vnd.rs-274x", "application/vnd.rs-274x"),

  /**
   * vnd.ruckus.download
   */
  APPLICATION_VND_RUCKUS_DOWNLOAD( "vnd.ruckus.download", "application/vnd.ruckus.download"),

  /**
   * vnd.s3sms
   */
  APPLICATION_VND_S3SMS( "vnd.s3sms", "application/vnd.s3sms"),

  /**
   * SailingTracker
   */
  APPLICATION_VND_SAILINGTRACKER_TRACK( "SailingTracker", "application/vnd.sailingtracker.track"),

  /**
   * vnd.sar
   */
  APPLICATION_VND_SAR( "vnd.sar", "application/vnd.sar"),

  /**
   * vnd.sbm.cid
   */
  APPLICATION_VND_SBM_CID( "vnd.sbm.cid", "application/vnd.sbm.cid"),

  /**
   * vnd.sbm.mid2
   */
  APPLICATION_VND_SBM_MID2( "vnd.sbm.mid2", "application/vnd.sbm.mid2"),

  /**
   * vnd.scribus
   */
  APPLICATION_VND_SCRIBUS( "vnd.scribus", "application/vnd.scribus"),

  /**
   * vnd.sealed.3df
   */
  APPLICATION_VND_SEALED_3DF( "vnd.sealed.3df", "application/vnd.sealed.3df"),

  /**
   * vnd.sealed.csf
   */
  APPLICATION_VND_SEALED_CSF( "vnd.sealed.csf", "application/vnd.sealed.csf"),

  /**
   * vnd.sealed.doc
   */
  APPLICATION_VND_SEALED_DOC( "vnd.sealed.doc", "application/vnd.sealed.doc"),

  /**
   * vnd.sealed.eml
   */
  APPLICATION_VND_SEALED_EML( "vnd.sealed.eml", "application/vnd.sealed.eml"),

  /**
   * vnd.sealed.mht
   */
  APPLICATION_VND_SEALED_MHT( "vnd.sealed.mht", "application/vnd.sealed.mht"),

  /**
   * vnd.sealed.net
   */
  APPLICATION_VND_SEALED_NET( "vnd.sealed.net", "application/vnd.sealed.net"),

  /**
   * vnd.sealed.ppt
   */
  APPLICATION_VND_SEALED_PPT( "vnd.sealed.ppt", "application/vnd.sealed.ppt"),

  /**
   * vnd.sealed.tiff
   */
  APPLICATION_VND_SEALED_TIFF( "vnd.sealed.tiff", "application/vnd.sealed.tiff"),

  /**
   * vnd.sealed.xls
   */
  APPLICATION_VND_SEALED_XLS( "vnd.sealed.xls", "application/vnd.sealed.xls"),

  /**
   * vnd.sealedmedia.softseal.html
   */
  APPLICATION_VND_SEALEDMEDIA_SOFTSEAL_HTML( "vnd.sealedmedia.softseal.html", "application/vnd.sealedmedia.softseal.html"),

  /**
   * vnd.sealedmedia.softseal.pdf
   */
  APPLICATION_VND_SEALEDMEDIA_SOFTSEAL_PDF( "vnd.sealedmedia.softseal.pdf", "application/vnd.sealedmedia.softseal.pdf"),

  /**
   * SeeMail
   */
  APPLICATION_VND_SEEMAIL( "SeeMail", "application/vnd.seemail"),

  /**
   * vnd.seis+json
   */
  APPLICATION_VND_SEIS_JSON( "vnd.seis+json", "application/vnd.seis+json"),

  /**
   * Secured eMail
   */
  APPLICATION_VND_SEMA( "Secured eMail", "application/vnd.sema"),

  /**
   * Secured eMail
   */
  APPLICATION_VND_SEMD( "Secured eMail", "application/vnd.semd"),

  /**
   * Secured eMail
   */
  APPLICATION_VND_SEMF( "Secured eMail", "application/vnd.semf"),

  /**
   * vnd.shade-save-file
   */
  APPLICATION_VND_SHADE_SAVE_FILE( "vnd.shade-save-file", "application/vnd.shade-save-file"),

  /**
   * Shana Informed Filler
   */
  APPLICATION_VND_SHANA_INFORMED_FORMDATA( "Shana Informed Filler", "application/vnd.shana.informed.formdata"),

  /**
   * Shana Informed Filler
   */
  APPLICATION_VND_SHANA_INFORMED_FORMTEMPLATE( "Shana Informed Filler", "application/vnd.shana.informed.formtemplate"),

  /**
   * Shana Informed Filler
   */
  APPLICATION_VND_SHANA_INFORMED_INTERCHANGE( "Shana Informed Filler", "application/vnd.shana.informed.interchange"),

  /**
   * Shana Informed Filler
   */
  APPLICATION_VND_SHANA_INFORMED_PACKAGE( "Shana Informed Filler", "application/vnd.shana.informed.package"),

  /**
   * vnd.shootproof+json
   */
  APPLICATION_VND_SHOOTPROOF_JSON( "vnd.shootproof+json", "application/vnd.shootproof+json"),

  /**
   * vnd.shopkick+json
   */
  APPLICATION_VND_SHOPKICK_JSON( "vnd.shopkick+json", "application/vnd.shopkick+json"),

  /**
   * vnd.shp
   */
  APPLICATION_VND_SHP( "vnd.shp", "application/vnd.shp"),

  /**
   * vnd.shx
   */
  APPLICATION_VND_SHX( "vnd.shx", "application/vnd.shx"),

  /**
   * vnd.sigrok.session
   */
  APPLICATION_VND_SIGROK_SESSION( "vnd.sigrok.session", "application/vnd.sigrok.session"),

  /**
   * SimTech MindMapper
   */
  APPLICATION_VND_SIMTECH_MINDMAPPER( "SimTech MindMapper", "application/vnd.simtech-mindmapper"),

  /**
   * vnd.siren+json
   */
  APPLICATION_VND_SIREN_JSON( "vnd.siren+json", "application/vnd.siren+json"),

  /**
   * SMAF File
   */
  APPLICATION_VND_SMAF( "SMAF File", "application/vnd.smaf"),

  /**
   * vnd.smart.notebook
   */
  APPLICATION_VND_SMART_NOTEBOOK( "vnd.smart.notebook", "application/vnd.smart.notebook"),

  /**
   * SMART Technologies Apps
   */
  APPLICATION_VND_SMART_TEACHER( "SMART Technologies Apps", "application/vnd.smart.teacher"),

  /**
   * vnd.snesdev-page-table
   */
  APPLICATION_VND_SNESDEV_PAGE_TABLE( "vnd.snesdev-page-table", "application/vnd.snesdev-page-table"),

  /**
   * vnd.software602.filler.form+xml
   */
  APPLICATION_VND_SOFTWARE602_FILLER_FORM_XML( "vnd.software602.filler.form+xml", "application/vnd.software602.filler.form+xml"),

  /**
   * vnd.software602.filler.form-xml-zip
   */
  APPLICATION_VND_SOFTWARE602_FILLER_FORM_XML_ZIP( "vnd.software602.filler.form-xml-zip", "application/vnd.software602.filler.form-xml-zip"),

  /**
   * SudokuMagic
   */
  APPLICATION_VND_SOLENT_SDKM_XML( "SudokuMagic", "application/vnd.solent.sdkm+xml"),

  /**
   * TIBCO Spotfire
   */
  APPLICATION_VND_SPOTFIRE_DXP( "TIBCO Spotfire", "application/vnd.spotfire.dxp"),

  /**
   * TIBCO Spotfire
   */
  APPLICATION_VND_SPOTFIRE_SFS( "TIBCO Spotfire", "application/vnd.spotfire.sfs"),

  /**
   * vnd.sqlite3
   */
  APPLICATION_VND_SQLITE3( "vnd.sqlite3", "application/vnd.sqlite3"),

  /**
   * vnd.sss-cod
   */
  APPLICATION_VND_SSS_COD( "vnd.sss-cod", "application/vnd.sss-cod"),

  /**
   * vnd.sss-dtf
   */
  APPLICATION_VND_SSS_DTF( "vnd.sss-dtf", "application/vnd.sss-dtf"),

  /**
   * vnd.sss-ntf
   */
  APPLICATION_VND_SSS_NTF( "vnd.sss-ntf", "application/vnd.sss-ntf"),

  /**
   * StarOffice - Calc
   */
  APPLICATION_VND_STARDIVISION_CALC( "StarOffice - Calc", "application/vnd.stardivision.calc"),

  /**
   * StarOffice - Draw
   */
  APPLICATION_VND_STARDIVISION_DRAW( "StarOffice - Draw", "application/vnd.stardivision.draw"),

  /**
   * StarOffice - Impress
   */
  APPLICATION_VND_STARDIVISION_IMPRESS( "StarOffice - Impress", "application/vnd.stardivision.impress"),

  /**
   * StarOffice - Math
   */
  APPLICATION_VND_STARDIVISION_MATH( "StarOffice - Math", "application/vnd.stardivision.math"),

  /**
   * StarOffice - Writer
   */
  APPLICATION_VND_STARDIVISION_WRITER( "StarOffice - Writer", "application/vnd.stardivision.writer"),

  /**
   * StarOffice - Writer  (Global)
   */
  APPLICATION_VND_STARDIVISION_WRITER_GLOBAL( "StarOffice - Writer  (Global)", "application/vnd.stardivision.writer-global"),

  /**
   * vnd.stepmania.package
   */
  APPLICATION_VND_STEPMANIA_PACKAGE( "vnd.stepmania.package", "application/vnd.stepmania.package"),

  /**
   * StepMania
   */
  APPLICATION_VND_STEPMANIA_STEPCHART( "StepMania", "application/vnd.stepmania.stepchart"),

  /**
   * vnd.street-stream
   */
  APPLICATION_VND_STREET_STREAM( "vnd.street-stream", "application/vnd.street-stream"),

  /**
   * vnd.sun.wadl+xml
   */
  APPLICATION_VND_SUN_WADL_XML( "vnd.sun.wadl+xml", "application/vnd.sun.wadl+xml"),

  /**
   * OpenOffice - Calc (Spreadsheet)
   */
  APPLICATION_VND_SUN_XML_CALC( "OpenOffice - Calc (Spreadsheet)", "application/vnd.sun.xml.calc"),

  /**
   * OpenOffice - Calc Template (Spreadsheet)
   */
  APPLICATION_VND_SUN_XML_CALC_TEMPLATE( "OpenOffice - Calc Template (Spreadsheet)", "application/vnd.sun.xml.calc.template"),

  /**
   * OpenOffice - Draw (Graphics)
   */
  APPLICATION_VND_SUN_XML_DRAW( "OpenOffice - Draw (Graphics)", "application/vnd.sun.xml.draw"),

  /**
   * OpenOffice - Draw Template (Graphics)
   */
  APPLICATION_VND_SUN_XML_DRAW_TEMPLATE( "OpenOffice - Draw Template (Graphics)", "application/vnd.sun.xml.draw.template"),

  /**
   * OpenOffice - Impress (Presentation)
   */
  APPLICATION_VND_SUN_XML_IMPRESS( "OpenOffice - Impress (Presentation)", "application/vnd.sun.xml.impress"),

  /**
   * OpenOffice - Impress Template (Presentation)
   */
  APPLICATION_VND_SUN_XML_IMPRESS_TEMPLATE( "OpenOffice - Impress Template (Presentation)", "application/vnd.sun.xml.impress.template"),

  /**
   * OpenOffice - Math (Formula)
   */
  APPLICATION_VND_SUN_XML_MATH( "OpenOffice - Math (Formula)", "application/vnd.sun.xml.math"),

  /**
   * OpenOffice - Writer (Text - HTML)
   */
  APPLICATION_VND_SUN_XML_WRITER( "OpenOffice - Writer (Text - HTML)", "application/vnd.sun.xml.writer"),

  /**
   * OpenOffice - Writer (Text - HTML)
   */
  APPLICATION_VND_SUN_XML_WRITER_GLOBAL( "OpenOffice - Writer (Text - HTML)", "application/vnd.sun.xml.writer.global"),

  /**
   * OpenOffice - Writer Template (Text - HTML)
   */
  APPLICATION_VND_SUN_XML_WRITER_TEMPLATE( "OpenOffice - Writer Template (Text - HTML)", "application/vnd.sun.xml.writer.template"),

  /**
   * ScheduleUs
   */
  APPLICATION_VND_SUS_CALENDAR( "ScheduleUs", "application/vnd.sus-calendar"),

  /**
   * SourceView Document
   */
  APPLICATION_VND_SVD( "SourceView Document", "application/vnd.svd"),

  /**
   * vnd.swiftview-ics
   */
  APPLICATION_VND_SWIFTVIEW_ICS( "vnd.swiftview-ics", "application/vnd.swiftview-ics"),

  /**
   * vnd.sycle+xml
   */
  APPLICATION_VND_SYCLE_XML( "vnd.sycle+xml", "application/vnd.sycle+xml"),

  /**
   * Symbian Install Package
   */
  APPLICATION_VND_SYMBIAN_INSTALL( "Symbian Install Package", "application/vnd.symbian.install"),

  /**
   * SyncML
   */
  APPLICATION_VND_SYNCML_XML( "SyncML", "application/vnd.syncml+xml"),

  /**
   * SyncML - Device Management
   */
  APPLICATION_VND_SYNCML_DM_WBXML( "SyncML - Device Management", "application/vnd.syncml.dm+wbxml"),

  /**
   * SyncML - Device Management
   */
  APPLICATION_VND_SYNCML_DM_XML( "SyncML - Device Management", "application/vnd.syncml.dm+xml"),

  /**
   * vnd.syncml.dm.notification
   */
  APPLICATION_VND_SYNCML_DM_NOTIFICATION( "vnd.syncml.dm.notification", "application/vnd.syncml.dm.notification"),

  /**
   * vnd.syncml.dmddf+wbxml
   */
  APPLICATION_VND_SYNCML_DMDDF_WBXML( "vnd.syncml.dmddf+wbxml", "application/vnd.syncml.dmddf+wbxml"),

  /**
   * vnd.syncml.dmddf+xml
   */
  APPLICATION_VND_SYNCML_DMDDF_XML( "vnd.syncml.dmddf+xml", "application/vnd.syncml.dmddf+xml"),

  /**
   * vnd.syncml.dmtnds+wbxml
   */
  APPLICATION_VND_SYNCML_DMTNDS_WBXML( "vnd.syncml.dmtnds+wbxml", "application/vnd.syncml.dmtnds+wbxml"),

  /**
   * vnd.syncml.dmtnds+xml
   */
  APPLICATION_VND_SYNCML_DMTNDS_XML( "vnd.syncml.dmtnds+xml", "application/vnd.syncml.dmtnds+xml"),

  /**
   * vnd.syncml.ds.notification
   */
  APPLICATION_VND_SYNCML_DS_NOTIFICATION( "vnd.syncml.ds.notification", "application/vnd.syncml.ds.notification"),

  /**
   * vnd.tableschema+json
   */
  APPLICATION_VND_TABLESCHEMA_JSON( "vnd.tableschema+json", "application/vnd.tableschema+json"),

  /**
   * Tao Intent
   */
  APPLICATION_VND_TAO_INTENT_MODULE_ARCHIVE( "Tao Intent", "application/vnd.tao.intent-module-archive"),

  /**
   * vnd.tcpdump.pcap
   */
  APPLICATION_VND_TCPDUMP_PCAP( "vnd.tcpdump.pcap", "application/vnd.tcpdump.pcap"),

  /**
   * vnd.think-cell.ppttc+json
   */
  APPLICATION_VND_THINK_CELL_PPTTC_JSON( "vnd.think-cell.ppttc+json", "application/vnd.think-cell.ppttc+json"),

  /**
   * vnd.tmd.mediaflex.api+xml
   */
  APPLICATION_VND_TMD_MEDIAFLEX_API_XML( "vnd.tmd.mediaflex.api+xml", "application/vnd.tmd.mediaflex.api+xml"),

  /**
   * vnd.tml
   */
  APPLICATION_VND_TML( "vnd.tml", "application/vnd.tml"),

  /**
   * MobileTV
   */
  APPLICATION_VND_TMOBILE_LIVETV( "MobileTV", "application/vnd.tmobile-livetv"),

  /**
   * vnd.tri.onesource
   */
  APPLICATION_VND_TRI_ONESOURCE( "vnd.tri.onesource", "application/vnd.tri.onesource"),

  /**
   * TRI Systems Config
   */
  APPLICATION_VND_TRID_TPT( "TRI Systems Config", "application/vnd.trid.tpt"),

  /**
   * Triscape Map Explorer
   */
  APPLICATION_VND_TRISCAPE_MXS( "Triscape Map Explorer", "application/vnd.triscape.mxs"),

  /**
   * True BASIC
   */
  APPLICATION_VND_TRUEAPP( "True BASIC", "application/vnd.trueapp"),

  /**
   * vnd.truedoc
   */
  APPLICATION_VND_TRUEDOC( "vnd.truedoc", "application/vnd.truedoc"),

  /**
   * vnd.ubisoft.webplayer
   */
  APPLICATION_VND_UBISOFT_WEBPLAYER( "vnd.ubisoft.webplayer", "application/vnd.ubisoft.webplayer"),

  /**
   * Universal Forms Description Language
   */
  APPLICATION_VND_UFDL( "Universal Forms Description Language", "application/vnd.ufdl"),

  /**
   * User Interface Quartz - Theme (Symbian)
   */
  APPLICATION_VND_UIQ_THEME( "User Interface Quartz - Theme (Symbian)", "application/vnd.uiq.theme"),

  /**
   * UMAJIN
   */
  APPLICATION_VND_UMAJIN( "UMAJIN", "application/vnd.umajin"),

  /**
   * Unity 3d
   */
  APPLICATION_VND_UNITY( "Unity 3d", "application/vnd.unity"),

  /**
   * Unique Object Markup Language
   */
  APPLICATION_VND_UOML_XML( "Unique Object Markup Language", "application/vnd.uoml+xml"),

  /**
   * vnd.uplanet.alert
   */
  APPLICATION_VND_UPLANET_ALERT( "vnd.uplanet.alert", "application/vnd.uplanet.alert"),

  /**
   * vnd.uplanet.alert-wbxml
   */
  APPLICATION_VND_UPLANET_ALERT_WBXML( "vnd.uplanet.alert-wbxml", "application/vnd.uplanet.alert-wbxml"),

  /**
   * vnd.uplanet.bearer-choice
   */
  APPLICATION_VND_UPLANET_BEARER_CHOICE( "vnd.uplanet.bearer-choice", "application/vnd.uplanet.bearer-choice"),

  /**
   * vnd.uplanet.bearer-choice-wbxml
   */
  APPLICATION_VND_UPLANET_BEARER_CHOICE_WBXML( "vnd.uplanet.bearer-choice-wbxml", "application/vnd.uplanet.bearer-choice-wbxml"),

  /**
   * vnd.uplanet.cacheop
   */
  APPLICATION_VND_UPLANET_CACHEOP( "vnd.uplanet.cacheop", "application/vnd.uplanet.cacheop"),

  /**
   * vnd.uplanet.cacheop-wbxml
   */
  APPLICATION_VND_UPLANET_CACHEOP_WBXML( "vnd.uplanet.cacheop-wbxml", "application/vnd.uplanet.cacheop-wbxml"),

  /**
   * vnd.uplanet.channel
   */
  APPLICATION_VND_UPLANET_CHANNEL( "vnd.uplanet.channel", "application/vnd.uplanet.channel"),

  /**
   * vnd.uplanet.channel-wbxml
   */
  APPLICATION_VND_UPLANET_CHANNEL_WBXML( "vnd.uplanet.channel-wbxml", "application/vnd.uplanet.channel-wbxml"),

  /**
   * vnd.uplanet.list
   */
  APPLICATION_VND_UPLANET_LIST( "vnd.uplanet.list", "application/vnd.uplanet.list"),

  /**
   * vnd.uplanet.list-wbxml
   */
  APPLICATION_VND_UPLANET_LIST_WBXML( "vnd.uplanet.list-wbxml", "application/vnd.uplanet.list-wbxml"),

  /**
   * vnd.uplanet.listcmd
   */
  APPLICATION_VND_UPLANET_LISTCMD( "vnd.uplanet.listcmd", "application/vnd.uplanet.listcmd"),

  /**
   * vnd.uplanet.listcmd-wbxml
   */
  APPLICATION_VND_UPLANET_LISTCMD_WBXML( "vnd.uplanet.listcmd-wbxml", "application/vnd.uplanet.listcmd-wbxml"),

  /**
   * vnd.uplanet.signal
   */
  APPLICATION_VND_UPLANET_SIGNAL( "vnd.uplanet.signal", "application/vnd.uplanet.signal"),

  /**
   * vnd.uri-map
   */
  APPLICATION_VND_URI_MAP( "vnd.uri-map", "application/vnd.uri-map"),

  /**
   * vnd.valve.source.material
   */
  APPLICATION_VND_VALVE_SOURCE_MATERIAL( "vnd.valve.source.material", "application/vnd.valve.source.material"),

  /**
   * VirtualCatalog
   */
  APPLICATION_VND_VCX( "VirtualCatalog", "application/vnd.vcx"),

  /**
   * vnd.vd-study
   */
  APPLICATION_VND_VD_STUDY( "vnd.vd-study", "application/vnd.vd-study"),

  /**
   * vnd.vectorworks
   */
  APPLICATION_VND_VECTORWORKS( "vnd.vectorworks", "application/vnd.vectorworks"),

  /**
   * vnd.vel+json
   */
  APPLICATION_VND_VEL_JSON( "vnd.vel+json", "application/vnd.vel+json"),

  /**
   * vnd.verimatrix.vcas
   */
  APPLICATION_VND_VERIMATRIX_VCAS( "vnd.verimatrix.vcas", "application/vnd.verimatrix.vcas"),

  /**
   * vnd.veryant.thin
   */
  APPLICATION_VND_VERYANT_THIN( "vnd.veryant.thin", "application/vnd.veryant.thin"),

  /**
   * vnd.ves.encrypted
   */
  APPLICATION_VND_VES_ENCRYPTED( "vnd.ves.encrypted", "application/vnd.ves.encrypted"),

  /**
   * vnd.vidsoft.vidconference
   */
  APPLICATION_VND_VIDSOFT_VIDCONFERENCE( "vnd.vidsoft.vidconference", "application/vnd.vidsoft.vidconference"),

  /**
   * Microsoft Visio
   */
  APPLICATION_VND_VISIO( "Microsoft Visio", "application/vnd.visio"),

  /**
   * Microsoft Visio 2013
   */
  APPLICATION_VND_VISIO2013( "Microsoft Visio 2013", "application/vnd.visio2013"),

  /**
   * Visionary
   */
  APPLICATION_VND_VISIONARY( "Visionary", "application/vnd.visionary"),

  /**
   * vnd.vividence.scriptfile
   */
  APPLICATION_VND_VIVIDENCE_SCRIPTFILE( "vnd.vividence.scriptfile", "application/vnd.vividence.scriptfile"),

  /**
   * Viewport+
   */
  APPLICATION_VND_VSF( "Viewport+", "application/vnd.vsf"),

  /**
   * vnd.wap.sic
   */
  APPLICATION_VND_WAP_SIC( "vnd.wap.sic", "application/vnd.wap.sic"),

  /**
   * vnd.wap.slc
   */
  APPLICATION_VND_WAP_SLC( "vnd.wap.slc", "application/vnd.wap.slc"),

  /**
   * WAP Binary XML (WBXML)
   */
  APPLICATION_VND_WAP_WBXML( "WAP Binary XML (WBXML)", "application/vnd.wap.wbxml"),

  /**
   * Compiled Wireless Markup Language (WMLC)
   */
  APPLICATION_VND_WAP_WMLC( "Compiled Wireless Markup Language (WMLC)", "application/vnd.wap.wmlc"),

  /**
   * WMLScript
   */
  APPLICATION_VND_WAP_WMLSCRIPTC( "WMLScript", "application/vnd.wap.wmlscriptc"),

  /**
   * WebTurbo
   */
  APPLICATION_VND_WEBTURBO( "WebTurbo", "application/vnd.webturbo"),

  /**
   * vnd.wfa.dpp
   */
  APPLICATION_VND_WFA_DPP( "vnd.wfa.dpp", "application/vnd.wfa.dpp"),

  /**
   * vnd.wfa.p2p
   */
  APPLICATION_VND_WFA_P2P( "vnd.wfa.p2p", "application/vnd.wfa.p2p"),

  /**
   * vnd.wfa.wsc
   */
  APPLICATION_VND_WFA_WSC( "vnd.wfa.wsc", "application/vnd.wfa.wsc"),

  /**
   * vnd.windows.devicepairing
   */
  APPLICATION_VND_WINDOWS_DEVICEPAIRING( "vnd.windows.devicepairing", "application/vnd.windows.devicepairing"),

  /**
   * vnd.wmc
   */
  APPLICATION_VND_WMC( "vnd.wmc", "application/vnd.wmc"),

  /**
   * vnd.wmf.bootstrap
   */
  APPLICATION_VND_WMF_BOOTSTRAP( "vnd.wmf.bootstrap", "application/vnd.wmf.bootstrap"),

  /**
   * vnd.wolfram.mathematica
   */
  APPLICATION_VND_WOLFRAM_MATHEMATICA( "vnd.wolfram.mathematica", "application/vnd.wolfram.mathematica"),

  /**
   * vnd.wolfram.mathematica.package
   */
  APPLICATION_VND_WOLFRAM_MATHEMATICA_PACKAGE( "vnd.wolfram.mathematica.package", "application/vnd.wolfram.mathematica.package"),

  /**
   * Mathematica Notebook Player
   */
  APPLICATION_VND_WOLFRAM_PLAYER( "Mathematica Notebook Player", "application/vnd.wolfram.player"),

  /**
   * Wordperfect
   */
  APPLICATION_VND_WORDPERFECT( "Wordperfect", "application/vnd.wordperfect"),

  /**
   * SundaHus WQ
   */
  APPLICATION_VND_WQD( "SundaHus WQ", "application/vnd.wqd"),

  /**
   * vnd.wrq-hp3000-labelled
   */
  APPLICATION_VND_WRQ_HP3000_LABELLED( "vnd.wrq-hp3000-labelled", "application/vnd.wrq-hp3000-labelled"),

  /**
   * Worldtalk
   */
  APPLICATION_VND_WT_STF( "Worldtalk", "application/vnd.wt.stf"),

  /**
   * vnd.wv.csp+wbxml
   */
  APPLICATION_VND_WV_CSP_WBXML( "vnd.wv.csp+wbxml", "application/vnd.wv.csp+wbxml"),

  /**
   * vnd.wv.csp+xml
   */
  APPLICATION_VND_WV_CSP_XML( "vnd.wv.csp+xml", "application/vnd.wv.csp+xml"),

  /**
   * vnd.wv.ssp+xml
   */
  APPLICATION_VND_WV_SSP_XML( "vnd.wv.ssp+xml", "application/vnd.wv.ssp+xml"),

  /**
   * vnd.xacml+json
   */
  APPLICATION_VND_XACML_JSON( "vnd.xacml+json", "application/vnd.xacml+json"),

  /**
   * CorelXARA
   */
  APPLICATION_VND_XARA( "CorelXARA", "application/vnd.xara"),

  /**
   * Extensible Forms Description Language
   */
  APPLICATION_VND_XFDL( "Extensible Forms Description Language", "application/vnd.xfdl"),

  /**
   * vnd.xfdl.webform
   */
  APPLICATION_VND_XFDL_WEBFORM( "vnd.xfdl.webform", "application/vnd.xfdl.webform"),

  /**
   * vnd.xmi+xml
   */
  APPLICATION_VND_XMI_XML( "vnd.xmi+xml", "application/vnd.xmi+xml"),

  /**
   * vnd.xmpie.cpkg
   */
  APPLICATION_VND_XMPIE_CPKG( "vnd.xmpie.cpkg", "application/vnd.xmpie.cpkg"),

  /**
   * vnd.xmpie.dpkg
   */
  APPLICATION_VND_XMPIE_DPKG( "vnd.xmpie.dpkg", "application/vnd.xmpie.dpkg"),

  /**
   * vnd.xmpie.plan
   */
  APPLICATION_VND_XMPIE_PLAN( "vnd.xmpie.plan", "application/vnd.xmpie.plan"),

  /**
   * vnd.xmpie.ppkg
   */
  APPLICATION_VND_XMPIE_PPKG( "vnd.xmpie.ppkg", "application/vnd.xmpie.ppkg"),

  /**
   * vnd.xmpie.xlim
   */
  APPLICATION_VND_XMPIE_XLIM( "vnd.xmpie.xlim", "application/vnd.xmpie.xlim"),

  /**
   * HV Voice Dictionary
   */
  APPLICATION_VND_YAMAHA_HV_DIC( "HV Voice Dictionary", "application/vnd.yamaha.hv-dic"),

  /**
   * HV Script
   */
  APPLICATION_VND_YAMAHA_HV_SCRIPT( "HV Script", "application/vnd.yamaha.hv-script"),

  /**
   * HV Voice Parameter
   */
  APPLICATION_VND_YAMAHA_HV_VOICE( "HV Voice Parameter", "application/vnd.yamaha.hv-voice"),

  /**
   * Open Score Format
   */
  APPLICATION_VND_YAMAHA_OPENSCOREFORMAT( "Open Score Format", "application/vnd.yamaha.openscoreformat"),

  /**
   * OSFPVG
   */
  APPLICATION_VND_YAMAHA_OPENSCOREFORMAT_OSFPVG_XML( "OSFPVG", "application/vnd.yamaha.openscoreformat.osfpvg+xml"),

  /**
   * vnd.yamaha.remote-setup
   */
  APPLICATION_VND_YAMAHA_REMOTE_SETUP( "vnd.yamaha.remote-setup", "application/vnd.yamaha.remote-setup"),

  /**
   * SMAF Audio
   */
  APPLICATION_VND_YAMAHA_SMAF_AUDIO( "SMAF Audio", "application/vnd.yamaha.smaf-audio"),

  /**
   * SMAF Phrase
   */
  APPLICATION_VND_YAMAHA_SMAF_PHRASE( "SMAF Phrase", "application/vnd.yamaha.smaf-phrase"),

  /**
   * vnd.yamaha.through-ngn
   */
  APPLICATION_VND_YAMAHA_THROUGH_NGN( "vnd.yamaha.through-ngn", "application/vnd.yamaha.through-ngn"),

  /**
   * vnd.yamaha.tunnel-udpencap
   */
  APPLICATION_VND_YAMAHA_TUNNEL_UDPENCAP( "vnd.yamaha.tunnel-udpencap", "application/vnd.yamaha.tunnel-udpencap"),

  /**
   * vnd.yaoweme
   */
  APPLICATION_VND_YAOWEME( "vnd.yaoweme", "application/vnd.yaoweme"),

  /**
   * CustomMenu
   */
  APPLICATION_VND_YELLOWRIVER_CUSTOM_MENU( "CustomMenu", "application/vnd.yellowriver-custom-menu"),

  /**
   * vnd.youtube.yt - OBSOLETED in favor of video/vnd.youtube.yt
   */
  APPLICATION_VND_YOUTUBE_YT( "vnd.youtube.yt - OBSOLETED in favor of video/vnd.youtube.yt", "application/vnd.youtube.yt"),

  /**
   * Z.U.L. Geometry
   */
  APPLICATION_VND_ZUL( "Z.U.L. Geometry", "application/vnd.zul"),

  /**
   * Zzazz Deck
   */
  APPLICATION_VND_ZZAZZ_DECK_XML( "Zzazz Deck", "application/vnd.zzazz.deck+xml"),

  /**
   * VoiceXML
   */
  APPLICATION_VOICEXML_XML( "VoiceXML", "application/voicexml+xml"),

  /**
   * voucher-cms+json
   */
  APPLICATION_VOUCHER_CMS_JSON( "voucher-cms+json", "application/voucher-cms+json"),

  /**
   * vq-rtcpxr
   */
  APPLICATION_VQ_RTCPXR( "vq-rtcpxr", "application/vq-rtcpxr"),

  /**
   * watcherinfo+xml
   */
  APPLICATION_WATCHERINFO_XML( "watcherinfo+xml", "application/watcherinfo+xml"),

  /**
   * webpush-options+json
   */
  APPLICATION_WEBPUSH_OPTIONS_JSON( "webpush-options+json", "application/webpush-options+json"),

  /**
   * whoispp-query
   */
  APPLICATION_WHOISPP_QUERY( "whoispp-query", "application/whoispp-query"),

  /**
   * whoispp-response
   */
  APPLICATION_WHOISPP_RESPONSE( "whoispp-response", "application/whoispp-response"),

  /**
   * Widget Packaging and XML Configuration
   */
  APPLICATION_WIDGET( "Widget Packaging and XML Configuration", "application/widget"),

  /**
   * WinHelp
   */
  APPLICATION_WINHLP( "WinHelp", "application/winhlp"),

  /**
   * wita
   */
  APPLICATION_WITA( "wita", "application/wita"),

  /**
   * wordperfect5.1
   */
  APPLICATION_WORDPERFECT5_1( "wordperfect5.1", "application/wordperfect5.1"),

  /**
   * WSDL - Web Services Description Language
   */
  APPLICATION_WSDL_XML( "WSDL - Web Services Description Language", "application/wsdl+xml"),

  /**
   * Web Services Policy
   */
  APPLICATION_WSPOLICY_XML( "Web Services Policy", "application/wspolicy+xml"),

  /**
   * 7-Zip
   */
  APPLICATION_X_7Z_COMPRESSED( "7-Zip", "application/x-7z-compressed"),

  /**
   * AbiWord
   */
  APPLICATION_X_ABIWORD( "AbiWord", "application/x-abiword"),

  /**
   * Ace Archive
   */
  APPLICATION_X_ACE_COMPRESSED( "Ace Archive", "application/x-ace-compressed"),

  /**
   * Apple Disk Image
   */
  APPLICATION_X_APPLE_DISKIMAGE( "Apple Disk Image", "application/x-apple-diskimage"),

  /**
   * Adobe (Macropedia) Authorware - Binary File
   */
  APPLICATION_X_AUTHORWARE_BIN( "Adobe (Macropedia) Authorware - Binary File", "application/x-authorware-bin"),

  /**
   * Adobe (Macropedia) Authorware - Map
   */
  APPLICATION_X_AUTHORWARE_MAP( "Adobe (Macropedia) Authorware - Map", "application/x-authorware-map"),

  /**
   * Adobe (Macropedia) Authorware - Segment File
   */
  APPLICATION_X_AUTHORWARE_SEG( "Adobe (Macropedia) Authorware - Segment File", "application/x-authorware-seg"),

  /**
   * Binary CPIO Archive
   */
  APPLICATION_X_BCPIO( "Binary CPIO Archive", "application/x-bcpio"),

  /**
   * BitTorrent
   */
  APPLICATION_X_BITTORRENT( "BitTorrent", "application/x-bittorrent"),

  /**
   * Bzip Archive
   */
  APPLICATION_X_BZIP( "Bzip Archive", "application/x-bzip"),

  /**
   * Bzip2 Archive
   */
  APPLICATION_X_BZIP2( "Bzip2 Archive", "application/x-bzip2"),

  /**
   * Video CD
   */
  APPLICATION_X_CDLINK( "Video CD", "application/x-cdlink"),

  /**
   * pIRCh
   */
  APPLICATION_X_CHAT( "pIRCh", "application/x-chat"),

  /**
   * Portable Game Notation (Chess Games)
   */
  APPLICATION_X_CHESS_PGN( "Portable Game Notation (Chess Games)", "application/x-chess-pgn"),

  /**
   * CPIO Archive
   */
  APPLICATION_X_CPIO( "CPIO Archive", "application/x-cpio"),

  /**
   * C Shell Script
   */
  APPLICATION_X_CSH( "C Shell Script", "application/x-csh"),

  /**
   * Debian Package
   */
  APPLICATION_X_DEBIAN_PACKAGE( "Debian Package", "application/x-debian-package"),

  /**
   * Adobe Shockwave Player
   */
  APPLICATION_X_DIRECTOR( "Adobe Shockwave Player", "application/x-director"),

  /**
   * Doom Video Game
   */
  APPLICATION_X_DOOM( "Doom Video Game", "application/x-doom"),

  /**
   * Navigation Control file for XML (for ePub)
   */
  APPLICATION_X_DTBNCX_XML( "Navigation Control file for XML (for ePub)", "application/x-dtbncx+xml"),

  /**
   * Digital Talking Book
   */
  APPLICATION_X_DTBOOK_XML( "Digital Talking Book", "application/x-dtbook+xml"),

  /**
   * Digital Talking Book - Resource File
   */
  APPLICATION_X_DTBRESOURCE_XML( "Digital Talking Book - Resource File", "application/x-dtbresource+xml"),

  /**
   * Device Independent File Format (DVI)
   */
  APPLICATION_X_DVI( "Device Independent File Format (DVI)", "application/x-dvi"),

  /**
   * Glyph Bitmap Distribution Format
   */
  APPLICATION_X_FONT_BDF( "Glyph Bitmap Distribution Format", "application/x-font-bdf"),

  /**
   * Ghostscript Font
   */
  APPLICATION_X_FONT_GHOSTSCRIPT( "Ghostscript Font", "application/x-font-ghostscript"),

  /**
   * PSF Fonts
   */
  APPLICATION_X_FONT_LINUX_PSF( "PSF Fonts", "application/x-font-linux-psf"),

  /**
   * OpenType Font File
   */
  APPLICATION_X_FONT_OTF( "OpenType Font File", "application/x-font-otf"),

  /**
   * Portable Compiled Format
   */
  APPLICATION_X_FONT_PCF( "Portable Compiled Format", "application/x-font-pcf"),

  /**
   * Server Normal Format
   */
  APPLICATION_X_FONT_SNF( "Server Normal Format", "application/x-font-snf"),

  /**
   * TrueType Font
   */
  APPLICATION_X_FONT_TTF( "TrueType Font", "application/x-font-ttf"),

  /**
   * PostScript Fonts
   */
  APPLICATION_X_FONT_TYPE1( "PostScript Fonts", "application/x-font-type1"),

  /**
   * Web Open Font Format
   */
  APPLICATION_X_FONT_WOFF( "Web Open Font Format", "application/x-font-woff"),

  /**
   * FutureSplash Animator
   */
  APPLICATION_X_FUTURESPLASH( "FutureSplash Animator", "application/x-futuresplash"),

  /**
   * Gnumeric
   */
  APPLICATION_X_GNUMERIC( "Gnumeric", "application/x-gnumeric"),

  /**
   * GNU Tar Files
   */
  APPLICATION_X_GTAR( "GNU Tar Files", "application/x-gtar"),

  /**
   * Hierarchical Data Format
   */
  APPLICATION_X_HDF( "Hierarchical Data Format", "application/x-hdf"),

  /**
   * Java Network Launching Protocol
   */
  APPLICATION_X_JAVA_JNLP_FILE( "Java Network Launching Protocol", "application/x-java-jnlp-file"),

  /**
   * LaTeX
   */
  APPLICATION_X_LATEX( "LaTeX", "application/x-latex"),

  /**
   * Mobipocket
   */
  APPLICATION_X_MOBIPOCKET_EBOOK( "Mobipocket", "application/x-mobipocket-ebook"),

  /**
   * Microsoft ClickOnce
   */
  APPLICATION_X_MS_APPLICATION( "Microsoft ClickOnce", "application/x-ms-application"),

  /**
   * Microsoft Windows Media Player Download Package
   */
  APPLICATION_X_MS_WMD( "Microsoft Windows Media Player Download Package", "application/x-ms-wmd"),

  /**
   * Microsoft Windows Media Player Skin Package
   */
  APPLICATION_X_MS_WMZ( "Microsoft Windows Media Player Skin Package", "application/x-ms-wmz"),

  /**
   * Microsoft XAML Browser Application
   */
  APPLICATION_X_MS_XBAP( "Microsoft XAML Browser Application", "application/x-ms-xbap"),

  /**
   * Microsoft Access
   */
  APPLICATION_X_MSACCESS( "Microsoft Access", "application/x-msaccess"),

  /**
   * Microsoft Office Binder
   */
  APPLICATION_X_MSBINDER( "Microsoft Office Binder", "application/x-msbinder"),

  /**
   * Microsoft Information Card
   */
  APPLICATION_X_MSCARDFILE( "Microsoft Information Card", "application/x-mscardfile"),

  /**
   * Microsoft Clipboard Clip
   */
  APPLICATION_X_MSCLIP( "Microsoft Clipboard Clip", "application/x-msclip"),

  /**
   * Microsoft Application
   */
  APPLICATION_X_MSDOWNLOAD( "Microsoft Application", "application/x-msdownload"),

  /**
   * Microsoft MediaView
   */
  APPLICATION_X_MSMEDIAVIEW( "Microsoft MediaView", "application/x-msmediaview"),

  /**
   * Microsoft Windows Metafile
   */
  APPLICATION_X_MSMETAFILE( "Microsoft Windows Metafile", "application/x-msmetafile"),

  /**
   * Microsoft Money
   */
  APPLICATION_X_MSMONEY( "Microsoft Money", "application/x-msmoney"),

  /**
   * Microsoft Publisher
   */
  APPLICATION_X_MSPUBLISHER( "Microsoft Publisher", "application/x-mspublisher"),

  /**
   * Microsoft Schedule+
   */
  APPLICATION_X_MSSCHEDULE( "Microsoft Schedule+", "application/x-msschedule"),

  /**
   * Microsoft Windows Terminal Services
   */
  APPLICATION_X_MSTERMINAL( "Microsoft Windows Terminal Services", "application/x-msterminal"),

  /**
   * Microsoft Wordpad
   */
  APPLICATION_X_MSWRITE( "Microsoft Wordpad", "application/x-mswrite"),

  /**
   * Network Common Data Form (NetCDF)
   */
  APPLICATION_X_NETCDF( "Network Common Data Form (NetCDF)", "application/x-netcdf"),

  /**
   * PKCS #12 - Personal Information Exchange Syntax Standard
   */
  APPLICATION_X_PKCS12( "PKCS #12 - Personal Information Exchange Syntax Standard", "application/x-pkcs12"),

  /**
   * PKCS #7 - Cryptographic Message Syntax Standard (Certificates)
   */
  APPLICATION_X_PKCS7_CERTIFICATES( "PKCS #7 - Cryptographic Message Syntax Standard (Certificates)", "application/x-pkcs7-certificates"),

  /**
   * PKCS #7 - Cryptographic Message Syntax Standard (Certificate Request Response)
   */
  APPLICATION_X_PKCS7_CERTREQRESP( "PKCS #7 - Cryptographic Message Syntax Standard (Certificate Request Response)", "application/x-pkcs7-certreqresp"),

  /**
   * x-pki-message
   */
  APPLICATION_X_PKI_MESSAGE( "x-pki-message", "application/x-pki-message"),

  /**
   * RAR Archive
   */
  APPLICATION_X_RAR_COMPRESSED( "RAR Archive", "application/x-rar-compressed"),

  /**
   * Bourne Shell Script
   */
  APPLICATION_X_SH( "Bourne Shell Script", "application/x-sh"),

  /**
   * Shell Archive
   */
  APPLICATION_X_SHAR( "Shell Archive", "application/x-shar"),

  /**
   * Adobe Flash
   */
  APPLICATION_X_SHOCKWAVE_FLASH( "Adobe Flash", "application/x-shockwave-flash"),

  /**
   * Microsoft Silverlight
   */
  APPLICATION_X_SILVERLIGHT_APP( "Microsoft Silverlight", "application/x-silverlight-app"),

  /**
   * Stuffit Archive
   */
  APPLICATION_X_STUFFIT( "Stuffit Archive", "application/x-stuffit"),

  /**
   * Stuffit Archive
   */
  APPLICATION_X_STUFFITX( "Stuffit Archive", "application/x-stuffitx"),

  /**
   * System V Release 4 CPIO Archive
   */
  APPLICATION_X_SV4CPIO( "System V Release 4 CPIO Archive", "application/x-sv4cpio"),

  /**
   * System V Release 4 CPIO Checksum Data
   */
  APPLICATION_X_SV4CRC( "System V Release 4 CPIO Checksum Data", "application/x-sv4crc"),

  /**
   * Tar File (Tape Archive)
   */
  APPLICATION_X_TAR( "Tar File (Tape Archive)", "application/x-tar"),

  /**
   * Tcl Script
   */
  APPLICATION_X_TCL( "Tcl Script", "application/x-tcl"),

  /**
   * TeX
   */
  APPLICATION_X_TEX( "TeX", "application/x-tex"),

  /**
   * TeX Font Metric
   */
  APPLICATION_X_TEX_TFM( "TeX Font Metric", "application/x-tex-tfm"),

  /**
   * GNU Texinfo Document
   */
  APPLICATION_X_TEXINFO( "GNU Texinfo Document", "application/x-texinfo"),

  /**
   * Ustar (Uniform Standard Tape Archive)
   */
  APPLICATION_X_USTAR( "Ustar (Uniform Standard Tape Archive)", "application/x-ustar"),

  /**
   * WAIS Source
   */
  APPLICATION_X_WAIS_SOURCE( "WAIS Source", "application/x-wais-source"),

  /**
   * x-www-form-urlencoded
   */
  APPLICATION_X_WWW_FORM_URLENCODED( "x-www-form-urlencoded", "application/x-www-form-urlencoded"),

  /**
   * X.509 Certificate
   */
  APPLICATION_X_X509_CA_CERT( "X.509 Certificate", "application/x-x509-ca-cert"),

  /**
   * x-x509-ca-ra-cert
   */
  APPLICATION_X_X509_CA_RA_CERT( "x-x509-ca-ra-cert", "application/x-x509-ca-ra-cert"),

  /**
   * x-x509-next-ca-cert
   */
  APPLICATION_X_X509_NEXT_CA_CERT( "x-x509-next-ca-cert", "application/x-x509-next-ca-cert"),

  /**
   * Xfig
   */
  APPLICATION_X_XFIG( "Xfig", "application/x-xfig"),

  /**
   * XPInstall - Mozilla
   */
  APPLICATION_X_XPINSTALL( "XPInstall - Mozilla", "application/x-xpinstall"),

  /**
   * x400-bp
   */
  APPLICATION_X400_BP( "x400-bp", "application/x400-bp"),

  /**
   * xacml+xml
   */
  APPLICATION_XACML_XML( "xacml+xml", "application/xacml+xml"),

  /**
   * xcap-att+xml
   */
  APPLICATION_XCAP_ATT_XML( "xcap-att+xml", "application/xcap-att+xml"),

  /**
   * xcap-caps+xml
   */
  APPLICATION_XCAP_CAPS_XML( "xcap-caps+xml", "application/xcap-caps+xml"),

  /**
   * XML Configuration Access Protocol - XCAP Diff
   */
  APPLICATION_XCAP_DIFF_XML( "XML Configuration Access Protocol - XCAP Diff", "application/xcap-diff+xml"),

  /**
   * xcap-el+xml
   */
  APPLICATION_XCAP_EL_XML( "xcap-el+xml", "application/xcap-el+xml"),

  /**
   * xcap-error+xml
   */
  APPLICATION_XCAP_ERROR_XML( "xcap-error+xml", "application/xcap-error+xml"),

  /**
   * xcap-ns+xml
   */
  APPLICATION_XCAP_NS_XML( "xcap-ns+xml", "application/xcap-ns+xml"),

  /**
   * xcon-conference-info+xml
   */
  APPLICATION_XCON_CONFERENCE_INFO_XML( "xcon-conference-info+xml", "application/xcon-conference-info+xml"),

  /**
   * xcon-conference-info-diff+xml
   */
  APPLICATION_XCON_CONFERENCE_INFO_DIFF_XML( "xcon-conference-info-diff+xml", "application/xcon-conference-info-diff+xml"),

  /**
   * XML Encryption Syntax and Processing
   */
  APPLICATION_XENC_XML( "XML Encryption Syntax and Processing", "application/xenc+xml"),

  /**
   * XHTML - The Extensible HyperText Markup Language
   */
  APPLICATION_XHTML_XML( "XHTML - The Extensible HyperText Markup Language", "application/xhtml+xml"),

  /**
   * xliff+xml
   */
  APPLICATION_XLIFF_XML( "xliff+xml", "application/xliff+xml"),

  /**
   * XML - Extensible Markup Language
   */
  APPLICATION_XML( "XML - Extensible Markup Language", "application/xml"),

  /**
   * Document Type Definition
   */
  APPLICATION_XML_DTD( "Document Type Definition", "application/xml-dtd"),

  /**
   * xml-external-parsed-entity
   */
  APPLICATION_XML_EXTERNAL_PARSED_ENTITY( "xml-external-parsed-entity", "application/xml-external-parsed-entity"),

  /**
   * xml-patch+xml
   */
  APPLICATION_XML_PATCH_XML( "xml-patch+xml", "application/xml-patch+xml"),

  /**
   * xmpp+xml
   */
  APPLICATION_XMPP_XML( "xmpp+xml", "application/xmpp+xml"),

  /**
   * XML-Binary Optimized Packaging
   */
  APPLICATION_XOP_XML( "XML-Binary Optimized Packaging", "application/xop+xml"),

  /**
   * XML Transformations
   */
  APPLICATION_XSLT_XML( "XML Transformations", "application/xslt+xml"),

  /**
   * XSPF - XML Shareable Playlist Format
   */
  APPLICATION_XSPF_XML( "XSPF - XML Shareable Playlist Format", "application/xspf+xml"),

  /**
   * MXML
   */
  APPLICATION_XV_XML( "MXML", "application/xv+xml"),

  /**
   * YANG Data Modeling Language
   */
  APPLICATION_YANG( "YANG Data Modeling Language", "application/yang"),

  /**
   * yang-data+json
   */
  APPLICATION_YANG_DATA_JSON( "yang-data+json", "application/yang-data+json"),

  /**
   * yang-data+xml
   */
  APPLICATION_YANG_DATA_XML( "yang-data+xml", "application/yang-data+xml"),

  /**
   * yang-patch+json
   */
  APPLICATION_YANG_PATCH_JSON( "yang-patch+json", "application/yang-patch+json"),

  /**
   * yang-patch+xml
   */
  APPLICATION_YANG_PATCH_XML( "yang-patch+xml", "application/yang-patch+xml"),

  /**
   * YIN (YANG - XML)
   */
  APPLICATION_YIN_XML( "YIN (YANG - XML)", "application/yin+xml"),

  /**
   * Zip Archive
   */
  APPLICATION_ZIP( "Zip Archive", "application/zip"),

  /**
   * zlib
   */
  APPLICATION_ZLIB( "zlib", "application/zlib"),

  /**
   * zstd
   */
  APPLICATION_ZSTD( "zstd", "application/zstd"),

  /**
   * 1d-interleaved-parityfec
   */
  AUDIO_1D_INTERLEAVED_PARITYFEC( "1d-interleaved-parityfec", "audio/1d-interleaved-parityfec"),

  /**
   * 32kadpcm
   */
  AUDIO_32KADPCM( "32kadpcm", "audio/32kadpcm"),

  /**
   * 3gpp
   */
  AUDIO_3GPP( "3gpp", "audio/3gpp"),

  /**
   * 3gpp2
   */
  AUDIO_3GPP2( "3gpp2", "audio/3gpp2"),

  /**
   * AMR
   */
  AUDIO_AMR( "AMR", "audio/AMR"),

  /**
   * AMR-WB
   */
  AUDIO_AMR_WB( "AMR-WB", "audio/AMR-WB"),

  /**
   * ATRAC-ADVANCED-LOSSLESS
   */
  AUDIO_ATRAC_ADVANCED_LOSSLESS( "ATRAC-ADVANCED-LOSSLESS", "audio/ATRAC-ADVANCED-LOSSLESS"),

  /**
   * ATRAC-X
   */
  AUDIO_ATRAC_X( "ATRAC-X", "audio/ATRAC-X"),

  /**
   * ATRAC3
   */
  AUDIO_ATRAC3( "ATRAC3", "audio/ATRAC3"),

  /**
   * BV16
   */
  AUDIO_BV16( "BV16", "audio/BV16"),

  /**
   * BV32
   */
  AUDIO_BV32( "BV32", "audio/BV32"),

  /**
   * CN
   */
  AUDIO_CN( "CN", "audio/CN"),

  /**
   * DAT12
   */
  AUDIO_DAT12( "DAT12", "audio/DAT12"),

  /**
   * DV
   */
  AUDIO_DV( "DV", "audio/DV"),

  /**
   * DVI4
   */
  AUDIO_DVI4( "DVI4", "audio/DVI4"),

  /**
   * EVRC
   */
  AUDIO_EVRC( "EVRC", "audio/EVRC"),

  /**
   * EVRC-QCP
   */
  AUDIO_EVRC_QCP( "EVRC-QCP", "audio/EVRC-QCP"),

  /**
   * EVRC0
   */
  AUDIO_EVRC0( "EVRC0", "audio/EVRC0"),

  /**
   * EVRC1
   */
  AUDIO_EVRC1( "EVRC1", "audio/EVRC1"),

  /**
   * EVRCB
   */
  AUDIO_EVRCB( "EVRCB", "audio/EVRCB"),

  /**
   * EVRCB0
   */
  AUDIO_EVRCB0( "EVRCB0", "audio/EVRCB0"),

  /**
   * EVRCB1
   */
  AUDIO_EVRCB1( "EVRCB1", "audio/EVRCB1"),

  /**
   * EVRCNW
   */
  AUDIO_EVRCNW( "EVRCNW", "audio/EVRCNW"),

  /**
   * EVRCNW0
   */
  AUDIO_EVRCNW0( "EVRCNW0", "audio/EVRCNW0"),

  /**
   * EVRCNW1
   */
  AUDIO_EVRCNW1( "EVRCNW1", "audio/EVRCNW1"),

  /**
   * EVRCWB
   */
  AUDIO_EVRCWB( "EVRCWB", "audio/EVRCWB"),

  /**
   * EVRCWB0
   */
  AUDIO_EVRCWB0( "EVRCWB0", "audio/EVRCWB0"),

  /**
   * EVRCWB1
   */
  AUDIO_EVRCWB1( "EVRCWB1", "audio/EVRCWB1"),

  /**
   * EVS
   */
  AUDIO_EVS( "EVS", "audio/EVS"),

  /**
   * G711-0
   */
  AUDIO_G711_0( "G711-0", "audio/G711-0"),

  /**
   * G719
   */
  AUDIO_G719( "G719", "audio/G719"),

  /**
   * G722
   */
  AUDIO_G722( "G722", "audio/G722"),

  /**
   * G7221
   */
  AUDIO_G7221( "G7221", "audio/G7221"),

  /**
   * G723
   */
  AUDIO_G723( "G723", "audio/G723"),

  /**
   * G726-16
   */
  AUDIO_G726_16( "G726-16", "audio/G726-16"),

  /**
   * G726-24
   */
  AUDIO_G726_24( "G726-24", "audio/G726-24"),

  /**
   * G726-32
   */
  AUDIO_G726_32( "G726-32", "audio/G726-32"),

  /**
   * G726-40
   */
  AUDIO_G726_40( "G726-40", "audio/G726-40"),

  /**
   * G728
   */
  AUDIO_G728( "G728", "audio/G728"),

  /**
   * G729
   */
  AUDIO_G729( "G729", "audio/G729"),

  /**
   * G7291
   */
  AUDIO_G7291( "G7291", "audio/G7291"),

  /**
   * G729D
   */
  AUDIO_G729D( "G729D", "audio/G729D"),

  /**
   * G729E
   */
  AUDIO_G729E( "G729E", "audio/G729E"),

  /**
   * GSM
   */
  AUDIO_GSM( "GSM", "audio/GSM"),

  /**
   * GSM-EFR
   */
  AUDIO_GSM_EFR( "GSM-EFR", "audio/GSM-EFR"),

  /**
   * GSM-HR-08
   */
  AUDIO_GSM_HR_08( "GSM-HR-08", "audio/GSM-HR-08"),

  /**
   * L16
   */
  AUDIO_L16( "L16", "audio/L16"),

  /**
   * L20
   */
  AUDIO_L20( "L20", "audio/L20"),

  /**
   * L24
   */
  AUDIO_L24( "L24", "audio/L24"),

  /**
   * L8
   */
  AUDIO_L8( "L8", "audio/L8"),

  /**
   * LPC
   */
  AUDIO_LPC( "LPC", "audio/LPC"),

  /**
   * MELP
   */
  AUDIO_MELP( "MELP", "audio/MELP"),

  /**
   * MELP1200
   */
  AUDIO_MELP1200( "MELP1200", "audio/MELP1200"),

  /**
   * MELP2400
   */
  AUDIO_MELP2400( "MELP2400", "audio/MELP2400"),

  /**
   * MELP600
   */
  AUDIO_MELP600( "MELP600", "audio/MELP600"),

  /**
   * MP4A-LATM
   */
  AUDIO_MP4A_LATM( "MP4A-LATM", "audio/MP4A-LATM"),

  /**
   * MPA
   */
  AUDIO_MPA( "MPA", "audio/MPA"),

  /**
   * PCMA
   */
  AUDIO_PCMA( "PCMA", "audio/PCMA"),

  /**
   * PCMA-WB
   */
  AUDIO_PCMA_WB( "PCMA-WB", "audio/PCMA-WB"),

  /**
   * PCMU
   */
  AUDIO_PCMU( "PCMU", "audio/PCMU"),

  /**
   * PCMU-WB
   */
  AUDIO_PCMU_WB( "PCMU-WB", "audio/PCMU-WB"),

  /**
   * RED
   */
  AUDIO_RED( "RED", "audio/RED"),

  /**
   * SMV
   */
  AUDIO_SMV( "SMV", "audio/SMV"),

  /**
   * SMV-QCP
   */
  AUDIO_SMV_QCP( "SMV-QCP", "audio/SMV-QCP"),

  /**
   * SMV0
   */
  AUDIO_SMV0( "SMV0", "audio/SMV0"),

  /**
   * TETRA_ACELP
   */
  AUDIO_TETRA_ACELP( "TETRA_ACELP", "audio/TETRA_ACELP"),

  /**
   * TETRA_ACELP_BB
   */
  AUDIO_TETRA_ACELP_BB( "TETRA_ACELP_BB", "audio/TETRA_ACELP_BB"),

  /**
   * TSVCIS
   */
  AUDIO_TSVCIS( "TSVCIS", "audio/TSVCIS"),

  /**
   * UEMCLIP
   */
  AUDIO_UEMCLIP( "UEMCLIP", "audio/UEMCLIP"),

  /**
   * VDVI
   */
  AUDIO_VDVI( "VDVI", "audio/VDVI"),

  /**
   * VMR-WB
   */
  AUDIO_VMR_WB( "VMR-WB", "audio/VMR-WB"),

  /**
   * aac
   */
  AUDIO_AAC( "aac", "audio/aac"),

  /**
   * ac3
   */
  AUDIO_AC3( "ac3", "audio/ac3"),

  /**
   * Adaptive differential pulse-code modulation
   */
  AUDIO_ADPCM( "Adaptive differential pulse-code modulation", "audio/adpcm"),

  /**
   * amr-wb+
   */
  AUDIO_AMR_WB_( "amr-wb+", "audio/amr-wb+"),

  /**
   * aptx
   */
  AUDIO_APTX( "aptx", "audio/aptx"),

  /**
   * asc
   */
  AUDIO_ASC( "asc", "audio/asc"),

  /**
   * Sun Audio - Au file format
   */
  AUDIO_BASIC( "Sun Audio - Au file format", "audio/basic"),

  /**
   * clearmode
   */
  AUDIO_CLEARMODE( "clearmode", "audio/clearmode"),

  /**
   * dls
   */
  AUDIO_DLS( "dls", "audio/dls"),

  /**
   * dsr-es201108
   */
  AUDIO_DSR_ES201108( "dsr-es201108", "audio/dsr-es201108"),

  /**
   * dsr-es202050
   */
  AUDIO_DSR_ES202050( "dsr-es202050", "audio/dsr-es202050"),

  /**
   * dsr-es202211
   */
  AUDIO_DSR_ES202211( "dsr-es202211", "audio/dsr-es202211"),

  /**
   * dsr-es202212
   */
  AUDIO_DSR_ES202212( "dsr-es202212", "audio/dsr-es202212"),

  /**
   * eac3
   */
  AUDIO_EAC3( "eac3", "audio/eac3"),

  /**
   * encaprtp
   */
  AUDIO_ENCAPRTP( "encaprtp", "audio/encaprtp"),

  /**
   * example
   */
  AUDIO_EXAMPLE( "example", "audio/example"),

  /**
   * flexfec
   */
  AUDIO_FLEXFEC( "flexfec", "audio/flexfec"),

  /**
   * fwdred
   */
  AUDIO_FWDRED( "fwdred", "audio/fwdred"),

  /**
   * iLBC
   */
  AUDIO_ILBC( "iLBC", "audio/iLBC"),

  /**
   * ip-mr_v2.5
   */
  AUDIO_IP_MR_V2_5( "ip-mr_v2.5", "audio/ip-mr_v2.5"),

  /**
   * mhas
   */
  AUDIO_MHAS( "mhas", "audio/mhas"),

  /**
   * MIDI - Musical Instrument Digital Interface
   */
  AUDIO_MIDI( "MIDI - Musical Instrument Digital Interface", "audio/midi"),

  /**
   * mobile-xmf
   */
  AUDIO_MOBILE_XMF( "mobile-xmf", "audio/mobile-xmf"),

  /**
   * MPEG-4 Audio
   */
  AUDIO_MP4( "MPEG-4 Audio", "audio/mp4"),

  /**
   * mpa-robust
   */
  AUDIO_MPA_ROBUST( "mpa-robust", "audio/mpa-robust"),

  /**
   * MPEG Audio
   */
  AUDIO_MPEG( "MPEG Audio", "audio/mpeg"),

  /**
   * mpeg4-generic
   */
  AUDIO_MPEG4_GENERIC( "mpeg4-generic", "audio/mpeg4-generic"),

  /**
   * Ogg Audio
   */
  AUDIO_OGG( "Ogg Audio", "audio/ogg"),

  /**
   * opus
   */
  AUDIO_OPUS( "opus", "audio/opus"),

  /**
   * parityfec
   */
  AUDIO_PARITYFEC( "parityfec", "audio/parityfec"),

  /**
   * prs.sid
   */
  AUDIO_PRS_SID( "prs.sid", "audio/prs.sid"),

  /**
   * raptorfec
   */
  AUDIO_RAPTORFEC( "raptorfec", "audio/raptorfec"),

  /**
   * rtp-enc-aescm128
   */
  AUDIO_RTP_ENC_AESCM128( "rtp-enc-aescm128", "audio/rtp-enc-aescm128"),

  /**
   * rtp-midi
   */
  AUDIO_RTP_MIDI( "rtp-midi", "audio/rtp-midi"),

  /**
   * rtploopback
   */
  AUDIO_RTPLOOPBACK( "rtploopback", "audio/rtploopback"),

  /**
   * rtx
   */
  AUDIO_RTX( "rtx", "audio/rtx"),

  /**
   * sofa
   */
  AUDIO_SOFA( "sofa", "audio/sofa"),

  /**
   * sp-midi
   */
  AUDIO_SP_MIDI( "sp-midi", "audio/sp-midi"),

  /**
   * speex
   */
  AUDIO_SPEEX( "speex", "audio/speex"),

  /**
   * t140c
   */
  AUDIO_T140C( "t140c", "audio/t140c"),

  /**
   * t38
   */
  AUDIO_T38( "t38", "audio/t38"),

  /**
   * telephone-event
   */
  AUDIO_TELEPHONE_EVENT( "telephone-event", "audio/telephone-event"),

  /**
   * tone
   */
  AUDIO_TONE( "tone", "audio/tone"),

  /**
   * ulpfec
   */
  AUDIO_ULPFEC( "ulpfec", "audio/ulpfec"),

  /**
   * usac
   */
  AUDIO_USAC( "usac", "audio/usac"),

  /**
   * vnd.3gpp.iufp
   */
  AUDIO_VND_3GPP_IUFP( "vnd.3gpp.iufp", "audio/vnd.3gpp.iufp"),

  /**
   * vnd.4SB
   */
  AUDIO_VND_4SB( "vnd.4SB", "audio/vnd.4SB"),

  /**
   * vnd.CELP
   */
  AUDIO_VND_CELP( "vnd.CELP", "audio/vnd.CELP"),

  /**
   * vnd.audiokoz
   */
  AUDIO_VND_AUDIOKOZ( "vnd.audiokoz", "audio/vnd.audiokoz"),

  /**
   * vnd.cisco.nse
   */
  AUDIO_VND_CISCO_NSE( "vnd.cisco.nse", "audio/vnd.cisco.nse"),

  /**
   * vnd.cmles.radio-events
   */
  AUDIO_VND_CMLES_RADIO_EVENTS( "vnd.cmles.radio-events", "audio/vnd.cmles.radio-events"),

  /**
   * vnd.cns.anp1
   */
  AUDIO_VND_CNS_ANP1( "vnd.cns.anp1", "audio/vnd.cns.anp1"),

  /**
   * vnd.cns.inf1
   */
  AUDIO_VND_CNS_INF1( "vnd.cns.inf1", "audio/vnd.cns.inf1"),

  /**
   * DECE Audio
   */
  AUDIO_VND_DECE_AUDIO( "DECE Audio", "audio/vnd.dece.audio"),

  /**
   * Digital Winds Music
   */
  AUDIO_VND_DIGITAL_WINDS( "Digital Winds Music", "audio/vnd.digital-winds"),

  /**
   * vnd.dlna.adts
   */
  AUDIO_VND_DLNA_ADTS( "vnd.dlna.adts", "audio/vnd.dlna.adts"),

  /**
   * vnd.dolby.heaac.1
   */
  AUDIO_VND_DOLBY_HEAAC_1( "vnd.dolby.heaac.1", "audio/vnd.dolby.heaac.1"),

  /**
   * vnd.dolby.heaac.2
   */
  AUDIO_VND_DOLBY_HEAAC_2( "vnd.dolby.heaac.2", "audio/vnd.dolby.heaac.2"),

  /**
   * vnd.dolby.mlp
   */
  AUDIO_VND_DOLBY_MLP( "vnd.dolby.mlp", "audio/vnd.dolby.mlp"),

  /**
   * vnd.dolby.mps
   */
  AUDIO_VND_DOLBY_MPS( "vnd.dolby.mps", "audio/vnd.dolby.mps"),

  /**
   * vnd.dolby.pl2
   */
  AUDIO_VND_DOLBY_PL2( "vnd.dolby.pl2", "audio/vnd.dolby.pl2"),

  /**
   * vnd.dolby.pl2x
   */
  AUDIO_VND_DOLBY_PL2X( "vnd.dolby.pl2x", "audio/vnd.dolby.pl2x"),

  /**
   * vnd.dolby.pl2z
   */
  AUDIO_VND_DOLBY_PL2Z( "vnd.dolby.pl2z", "audio/vnd.dolby.pl2z"),

  /**
   * vnd.dolby.pulse.1
   */
  AUDIO_VND_DOLBY_PULSE_1( "vnd.dolby.pulse.1", "audio/vnd.dolby.pulse.1"),

  /**
   * DRA Audio
   */
  AUDIO_VND_DRA( "DRA Audio", "audio/vnd.dra"),

  /**
   * DTS Audio
   */
  AUDIO_VND_DTS( "DTS Audio", "audio/vnd.dts"),

  /**
   * DTS High Definition Audio
   */
  AUDIO_VND_DTS_HD( "DTS High Definition Audio", "audio/vnd.dts.hd"),

  /**
   * vnd.dts.uhd
   */
  AUDIO_VND_DTS_UHD( "vnd.dts.uhd", "audio/vnd.dts.uhd"),

  /**
   * vnd.dvb.file
   */
  AUDIO_VND_DVB_FILE( "vnd.dvb.file", "audio/vnd.dvb.file"),

  /**
   * vnd.everad.plj
   */
  AUDIO_VND_EVERAD_PLJ( "vnd.everad.plj", "audio/vnd.everad.plj"),

  /**
   * vnd.hns.audio
   */
  AUDIO_VND_HNS_AUDIO( "vnd.hns.audio", "audio/vnd.hns.audio"),

  /**
   * Lucent Voice
   */
  AUDIO_VND_LUCENT_VOICE( "Lucent Voice", "audio/vnd.lucent.voice"),

  /**
   * Microsoft PlayReady Ecosystem
   */
  AUDIO_VND_MS_PLAYREADY_MEDIA_PYA( "Microsoft PlayReady Ecosystem", "audio/vnd.ms-playready.media.pya"),

  /**
   * vnd.nokia.mobile-xmf
   */
  AUDIO_VND_NOKIA_MOBILE_XMF( "vnd.nokia.mobile-xmf", "audio/vnd.nokia.mobile-xmf"),

  /**
   * vnd.nortel.vbk
   */
  AUDIO_VND_NORTEL_VBK( "vnd.nortel.vbk", "audio/vnd.nortel.vbk"),

  /**
   * Nuera ECELP 4800
   */
  AUDIO_VND_NUERA_ECELP4800( "Nuera ECELP 4800", "audio/vnd.nuera.ecelp4800"),

  /**
   * Nuera ECELP 7470
   */
  AUDIO_VND_NUERA_ECELP7470( "Nuera ECELP 7470", "audio/vnd.nuera.ecelp7470"),

  /**
   * Nuera ECELP 9600
   */
  AUDIO_VND_NUERA_ECELP9600( "Nuera ECELP 9600", "audio/vnd.nuera.ecelp9600"),

  /**
   * vnd.octel.sbc
   */
  AUDIO_VND_OCTEL_SBC( "vnd.octel.sbc", "audio/vnd.octel.sbc"),

  /**
   * vnd.presonus.multitrack
   */
  AUDIO_VND_PRESONUS_MULTITRACK( "vnd.presonus.multitrack", "audio/vnd.presonus.multitrack"),

  /**
   * vnd.qcelp - DEPRECATED in favor of audio/qcelp
   */
  AUDIO_VND_QCELP( "vnd.qcelp - DEPRECATED in favor of audio/qcelp", "audio/vnd.qcelp"),

  /**
   * vnd.rhetorex.32kadpcm
   */
  AUDIO_VND_RHETOREX_32KADPCM( "vnd.rhetorex.32kadpcm", "audio/vnd.rhetorex.32kadpcm"),

  /**
   * Hit&#x27;n&#x27;Mix
   */
  AUDIO_VND_RIP( "Hit&#x27;n&#x27;Mix", "audio/vnd.rip"),

  /**
   * vnd.sealedmedia.softseal.mpeg
   */
  AUDIO_VND_SEALEDMEDIA_SOFTSEAL_MPEG( "vnd.sealedmedia.softseal.mpeg", "audio/vnd.sealedmedia.softseal.mpeg"),

  /**
   * vnd.vmx.cvsd
   */
  AUDIO_VND_VMX_CVSD( "vnd.vmx.cvsd", "audio/vnd.vmx.cvsd"),

  /**
   * vorbis
   */
  AUDIO_VORBIS( "vorbis", "audio/vorbis"),

  /**
   * vorbis-config
   */
  AUDIO_VORBIS_CONFIG( "vorbis-config", "audio/vorbis-config"),

  /**
   * Open Web Media Project - Audio
   */
  AUDIO_WEBM( "Open Web Media Project - Audio", "audio/webm"),

  /**
   * Advanced Audio Coding (AAC)
   */
  AUDIO_X_AAC( "Advanced Audio Coding (AAC)", "audio/x-aac"),

  /**
   * Audio Interchange File Format
   */
  AUDIO_X_AIFF( "Audio Interchange File Format", "audio/x-aiff"),

  /**
   * M3U (Multimedia Playlist)
   */
  AUDIO_X_MPEGURL( "M3U (Multimedia Playlist)", "audio/x-mpegurl"),

  /**
   * Microsoft Windows Media Audio Redirector
   */
  AUDIO_X_MS_WAX( "Microsoft Windows Media Audio Redirector", "audio/x-ms-wax"),

  /**
   * Microsoft Windows Media Audio
   */
  AUDIO_X_MS_WMA( "Microsoft Windows Media Audio", "audio/x-ms-wma"),

  /**
   * Real Audio Sound
   */
  AUDIO_X_PN_REALAUDIO( "Real Audio Sound", "audio/x-pn-realaudio"),

  /**
   * Real Audio Sound
   */
  AUDIO_X_PN_REALAUDIO_PLUGIN( "Real Audio Sound", "audio/x-pn-realaudio-plugin"),

  /**
   * Waveform Audio File Format (WAV)
   */
  AUDIO_X_WAV( "Waveform Audio File Format (WAV)", "audio/x-wav"),

  /**
   * ChemDraw eXchange file
   */
  CHEMICAL_X_CDX( "ChemDraw eXchange file", "chemical/x-cdx"),

  /**
   * Crystallographic Interchange Format
   */
  CHEMICAL_X_CIF( "Crystallographic Interchange Format", "chemical/x-cif"),

  /**
   * CrystalMaker Data Format
   */
  CHEMICAL_X_CMDF( "CrystalMaker Data Format", "chemical/x-cmdf"),

  /**
   * Chemical Markup Language
   */
  CHEMICAL_X_CML( "Chemical Markup Language", "chemical/x-cml"),

  /**
   * Chemical Style Markup Language
   */
  CHEMICAL_X_CSML( "Chemical Style Markup Language", "chemical/x-csml"),

  /**
   * XYZ File Format
   */
  CHEMICAL_X_XYZ( "XYZ File Format", "chemical/x-xyz"),

  /**
   * collection
   */
  FONT_COLLECTION( "collection", "font/collection"),

  /**
   * otf
   */
  FONT_OTF( "otf", "font/otf"),

  /**
   * sfnt
   */
  FONT_SFNT( "sfnt", "font/sfnt"),

  /**
   * ttf
   */
  FONT_TTF( "ttf", "font/ttf"),

  /**
   * woff
   */
  FONT_WOFF( "woff", "font/woff"),

  /**
   * woff2
   */
  FONT_WOFF2( "woff2", "font/woff2"),

  /**
   * aces
   */
  IMAGE_ACES( "aces", "image/aces"),

  /**
   * avci
   */
  IMAGE_AVCI( "avci", "image/avci"),

  /**
   * avcs
   */
  IMAGE_AVCS( "avcs", "image/avcs"),

  /**
   * Bitmap Image File
   */
  IMAGE_BMP( "Bitmap Image File", "image/bmp"),

  /**
   * Computer Graphics Metafile
   */
  IMAGE_CGM( "Computer Graphics Metafile", "image/cgm"),

  /**
   * dicom-rle
   */
  IMAGE_DICOM_RLE( "dicom-rle", "image/dicom-rle"),

  /**
   * emf
   */
  IMAGE_EMF( "emf", "image/emf"),

  /**
   * example
   */
  IMAGE_EXAMPLE( "example", "image/example"),

  /**
   * fits
   */
  IMAGE_FITS( "fits", "image/fits"),

  /**
   * G3 Fax Image
   */
  IMAGE_G3FAX( "G3 Fax Image", "image/g3fax"),

  /**
   * Graphics Interchange Format
   */
  IMAGE_GIF( "Graphics Interchange Format", "image/gif"),

  /**
   * heic
   */
  IMAGE_HEIC( "heic", "image/heic"),

  /**
   * heic-sequence
   */
  IMAGE_HEIC_SEQUENCE( "heic-sequence", "image/heic-sequence"),

  /**
   * heif
   */
  IMAGE_HEIF( "heif", "image/heif"),

  /**
   * heif-sequence
   */
  IMAGE_HEIF_SEQUENCE( "heif-sequence", "image/heif-sequence"),

  /**
   * hej2k
   */
  IMAGE_HEJ2K( "hej2k", "image/hej2k"),

  /**
   * hsj2
   */
  IMAGE_HSJ2( "hsj2", "image/hsj2"),

  /**
   * Image Exchange Format
   */
  IMAGE_IEF( "Image Exchange Format", "image/ief"),

  /**
   * jls
   */
  IMAGE_JLS( "jls", "image/jls"),

  /**
   * jp2
   */
  IMAGE_JP2( "jp2", "image/jp2"),

  /**
   * JPEG Image
   */
  IMAGE_JPEG( "JPEG Image", "image/jpeg"),

  /**
   * jph
   */
  IMAGE_JPH( "jph", "image/jph"),

  /**
   * jphc
   */
  IMAGE_JPHC( "jphc", "image/jphc"),

  /**
   * jpm
   */
  IMAGE_JPM( "jpm", "image/jpm"),

  /**
   * jpx
   */
  IMAGE_JPX( "jpx", "image/jpx"),

  /**
   * jxr
   */
  IMAGE_JXR( "jxr", "image/jxr"),

  /**
   * jxrA
   */
  IMAGE_JXRA( "jxrA", "image/jxrA"),

  /**
   * jxrS
   */
  IMAGE_JXRS( "jxrS", "image/jxrS"),

  /**
   * jxs
   */
  IMAGE_JXS( "jxs", "image/jxs"),

  /**
   * jxsc
   */
  IMAGE_JXSC( "jxsc", "image/jxsc"),

  /**
   * jxsi
   */
  IMAGE_JXSI( "jxsi", "image/jxsi"),

  /**
   * jxss
   */
  IMAGE_JXSS( "jxss", "image/jxss"),

  /**
   * OpenGL Textures (KTX)
   */
  IMAGE_KTX( "OpenGL Textures (KTX)", "image/ktx"),

  /**
   * ktx2
   */
  IMAGE_KTX2( "ktx2", "image/ktx2"),

  /**
   * naplps
   */
  IMAGE_NAPLPS( "naplps", "image/naplps"),

  /**
   * JPEG Image (Progressive)
   */
  IMAGE_PJPEG( "JPEG Image (Progressive)", "image/pjpeg"),

  /**
   * Portable Network Graphics (PNG)
   */
  IMAGE_PNG( "Portable Network Graphics (PNG)", "image/png"),

  /**
   * BTIF
   */
  IMAGE_PRS_BTIF( "BTIF", "image/prs.btif"),

  /**
   * prs.pti
   */
  IMAGE_PRS_PTI( "prs.pti", "image/prs.pti"),

  /**
   * pwg-raster
   */
  IMAGE_PWG_RASTER( "pwg-raster", "image/pwg-raster"),

  /**
   * Scalable Vector Graphics (SVG)
   */
  IMAGE_SVG_XML( "Scalable Vector Graphics (SVG)", "image/svg+xml"),

  /**
   * t38
   */
  IMAGE_T38( "t38", "image/t38"),

  /**
   * Tagged Image File Format
   */
  IMAGE_TIFF( "Tagged Image File Format", "image/tiff"),

  /**
   * tiff-fx
   */
  IMAGE_TIFF_FX( "tiff-fx", "image/tiff-fx"),

  /**
   * Photoshop Document
   */
  IMAGE_VND_ADOBE_PHOTOSHOP( "Photoshop Document", "image/vnd.adobe.photoshop"),

  /**
   * vnd.airzip.accelerator.azv
   */
  IMAGE_VND_AIRZIP_ACCELERATOR_AZV( "vnd.airzip.accelerator.azv", "image/vnd.airzip.accelerator.azv"),

  /**
   * vnd.cns.inf2
   */
  IMAGE_VND_CNS_INF2( "vnd.cns.inf2", "image/vnd.cns.inf2"),

  /**
   * DECE Graphic
   */
  IMAGE_VND_DECE_GRAPHIC( "DECE Graphic", "image/vnd.dece.graphic"),

  /**
   * DjVu
   */
  IMAGE_VND_DJVU( "DjVu", "image/vnd.djvu"),

  /**
   * Close Captioning - Subtitle
   */
  IMAGE_VND_DVB_SUBTITLE( "Close Captioning - Subtitle", "image/vnd.dvb.subtitle"),

  /**
   * DWG Drawing
   */
  IMAGE_VND_DWG( "DWG Drawing", "image/vnd.dwg"),

  /**
   * AutoCAD DXF
   */
  IMAGE_VND_DXF( "AutoCAD DXF", "image/vnd.dxf"),

  /**
   * FastBid Sheet
   */
  IMAGE_VND_FASTBIDSHEET( "FastBid Sheet", "image/vnd.fastbidsheet"),

  /**
   * FlashPix
   */
  IMAGE_VND_FPX( "FlashPix", "image/vnd.fpx"),

  /**
   * FAST Search &amp; Transfer ASA
   */
  IMAGE_VND_FST( "FAST Search &amp; Transfer ASA", "image/vnd.fst"),

  /**
   * EDMICS 2000
   */
  IMAGE_VND_FUJIXEROX_EDMICS_MMR( "EDMICS 2000", "image/vnd.fujixerox.edmics-mmr"),

  /**
   * EDMICS 2000
   */
  IMAGE_VND_FUJIXEROX_EDMICS_RLC( "EDMICS 2000", "image/vnd.fujixerox.edmics-rlc"),

  /**
   * vnd.globalgraphics.pgb
   */
  IMAGE_VND_GLOBALGRAPHICS_PGB( "vnd.globalgraphics.pgb", "image/vnd.globalgraphics.pgb"),

  /**
   * vnd.microsoft.icon
   */
  IMAGE_VND_MICROSOFT_ICON( "vnd.microsoft.icon", "image/vnd.microsoft.icon"),

  /**
   * vnd.mix
   */
  IMAGE_VND_MIX( "vnd.mix", "image/vnd.mix"),

  /**
   * vnd.mozilla.apng
   */
  IMAGE_VND_MOZILLA_APNG( "vnd.mozilla.apng", "image/vnd.mozilla.apng"),

  /**
   * Microsoft Document Imaging Format
   */
  IMAGE_VND_MS_MODI( "Microsoft Document Imaging Format", "image/vnd.ms-modi"),

  /**
   * FlashPix
   */
  IMAGE_VND_NET_FPX( "FlashPix", "image/vnd.net-fpx"),

  /**
   * vnd.pco.b16
   */
  IMAGE_VND_PCO_B16( "vnd.pco.b16", "image/vnd.pco.b16"),

  /**
   * vnd.radiance
   */
  IMAGE_VND_RADIANCE( "vnd.radiance", "image/vnd.radiance"),

  /**
   * vnd.sealed.png
   */
  IMAGE_VND_SEALED_PNG( "vnd.sealed.png", "image/vnd.sealed.png"),

  /**
   * vnd.sealedmedia.softseal.gif
   */
  IMAGE_VND_SEALEDMEDIA_SOFTSEAL_GIF( "vnd.sealedmedia.softseal.gif", "image/vnd.sealedmedia.softseal.gif"),

  /**
   * vnd.sealedmedia.softseal.jpg
   */
  IMAGE_VND_SEALEDMEDIA_SOFTSEAL_JPG( "vnd.sealedmedia.softseal.jpg", "image/vnd.sealedmedia.softseal.jpg"),

  /**
   * vnd.svf
   */
  IMAGE_VND_SVF( "vnd.svf", "image/vnd.svf"),

  /**
   * vnd.tencent.tap
   */
  IMAGE_VND_TENCENT_TAP( "vnd.tencent.tap", "image/vnd.tencent.tap"),

  /**
   * vnd.valve.source.texture
   */
  IMAGE_VND_VALVE_SOURCE_TEXTURE( "vnd.valve.source.texture", "image/vnd.valve.source.texture"),

  /**
   * WAP Bitamp (WBMP)
   */
  IMAGE_VND_WAP_WBMP( "WAP Bitamp (WBMP)", "image/vnd.wap.wbmp"),

  /**
   * eXtended Image File Format (XIFF)
   */
  IMAGE_VND_XIFF( "eXtended Image File Format (XIFF)", "image/vnd.xiff"),

  /**
   * vnd.zbrush.pcx
   */
  IMAGE_VND_ZBRUSH_PCX( "vnd.zbrush.pcx", "image/vnd.zbrush.pcx"),

  /**
   * WebP Image
   */
  IMAGE_WEBP( "WebP Image", "image/webp"),

  /**
   * wmf
   */
  IMAGE_WMF( "wmf", "image/wmf"),

  /**
   * JPEG Image (Citrix client)
   */
  IMAGE_X_CITRIX_JPEG( "JPEG Image (Citrix client)", "image/x-citrix-jpeg"),

  /**
   * Portable Network Graphics (PNG) (Citrix client)
   */
  IMAGE_X_CITRIX_PNG( "Portable Network Graphics (PNG) (Citrix client)", "image/x-citrix-png"),

  /**
   * CMU Image
   */
  IMAGE_X_CMU_RASTER( "CMU Image", "image/x-cmu-raster"),

  /**
   * Corel Metafile Exchange (CMX)
   */
  IMAGE_X_CMX( "Corel Metafile Exchange (CMX)", "image/x-cmx"),

  /**
   * FreeHand MX
   */
  IMAGE_X_FREEHAND( "FreeHand MX", "image/x-freehand"),

  /**
   * Icon Image
   */
  IMAGE_X_ICON( "Icon Image", "image/x-icon"),

  /**
   * PCX Image
   */
  IMAGE_X_PCX( "PCX Image", "image/x-pcx"),

  /**
   * PICT Image
   */
  IMAGE_X_PICT( "PICT Image", "image/x-pict"),

  /**
   * Portable Network Graphics (PNG) (x-token)
   */
  IMAGE_X_PNG( "Portable Network Graphics (PNG) (x-token)", "image/x-png"),

  /**
   * Portable Anymap Image
   */
  IMAGE_X_PORTABLE_ANYMAP( "Portable Anymap Image", "image/x-portable-anymap"),

  /**
   * Portable Bitmap Format
   */
  IMAGE_X_PORTABLE_BITMAP( "Portable Bitmap Format", "image/x-portable-bitmap"),

  /**
   * Portable Graymap Format
   */
  IMAGE_X_PORTABLE_GRAYMAP( "Portable Graymap Format", "image/x-portable-graymap"),

  /**
   * Portable Pixmap Format
   */
  IMAGE_X_PORTABLE_PIXMAP( "Portable Pixmap Format", "image/x-portable-pixmap"),

  /**
   * Silicon Graphics RGB Bitmap
   */
  IMAGE_X_RGB( "Silicon Graphics RGB Bitmap", "image/x-rgb"),

  /**
   * X BitMap
   */
  IMAGE_X_XBITMAP( "X BitMap", "image/x-xbitmap"),

  /**
   * X PixMap
   */
  IMAGE_X_XPIXMAP( "X PixMap", "image/x-xpixmap"),

  /**
   * X Window Dump
   */
  IMAGE_X_XWINDOWDUMP( "X Window Dump", "image/x-xwindowdump"),

  /**
   * CPIM
   */
  MESSAGE_CPIM( "CPIM", "message/CPIM"),

  /**
   * delivery-status
   */
  MESSAGE_DELIVERY_STATUS( "delivery-status", "message/delivery-status"),

  /**
   * disposition-notification
   */
  MESSAGE_DISPOSITION_NOTIFICATION( "disposition-notification", "message/disposition-notification"),

  /**
   * example
   */
  MESSAGE_EXAMPLE( "example", "message/example"),

  /**
   * external-body
   */
  MESSAGE_EXTERNAL_BODY( "external-body", "message/external-body"),

  /**
   * feedback-report
   */
  MESSAGE_FEEDBACK_REPORT( "feedback-report", "message/feedback-report"),

  /**
   * global
   */
  MESSAGE_GLOBAL( "global", "message/global"),

  /**
   * global-delivery-status
   */
  MESSAGE_GLOBAL_DELIVERY_STATUS( "global-delivery-status", "message/global-delivery-status"),

  /**
   * global-disposition-notification
   */
  MESSAGE_GLOBAL_DISPOSITION_NOTIFICATION( "global-disposition-notification", "message/global-disposition-notification"),

  /**
   * global-headers
   */
  MESSAGE_GLOBAL_HEADERS( "global-headers", "message/global-headers"),

  /**
   * http
   */
  MESSAGE_HTTP( "http", "message/http"),

  /**
   * imdn+xml
   */
  MESSAGE_IMDN_XML( "imdn+xml", "message/imdn+xml"),

  /**
   * partial
   */
  MESSAGE_PARTIAL( "partial", "message/partial"),

  /**
   * Email Message
   */
  MESSAGE_RFC822( "Email Message", "message/rfc822"),

  /**
   * s-http
   */
  MESSAGE_S_HTTP( "s-http", "message/s-http"),

  /**
   * sip
   */
  MESSAGE_SIP( "sip", "message/sip"),

  /**
   * sipfrag
   */
  MESSAGE_SIPFRAG( "sipfrag", "message/sipfrag"),

  /**
   * tracking-status
   */
  MESSAGE_TRACKING_STATUS( "tracking-status", "message/tracking-status"),

  /**
   * vnd.wfa.wsc
   */
  MESSAGE_VND_WFA_WSC( "vnd.wfa.wsc", "message/vnd.wfa.wsc"),

  /**
   * 3mf
   */
  MODEL_3MF( "3mf", "model/3mf"),

  /**
   * e57
   */
  MODEL_E57( "e57", "model/e57"),

  /**
   * example
   */
  MODEL_EXAMPLE( "example", "model/example"),

  /**
   * gltf+json
   */
  MODEL_GLTF_JSON( "gltf+json", "model/gltf+json"),

  /**
   * gltf-binary
   */
  MODEL_GLTF_BINARY( "gltf-binary", "model/gltf-binary"),

  /**
   * Initial Graphics Exchange Specification (IGES)
   */
  MODEL_IGES( "Initial Graphics Exchange Specification (IGES)", "model/iges"),

  /**
   * Mesh Data Type
   */
  MODEL_MESH( "Mesh Data Type", "model/mesh"),

  /**
   * mtl
   */
  MODEL_MTL( "mtl", "model/mtl"),

  /**
   * obj
   */
  MODEL_OBJ( "obj", "model/obj"),

  /**
   * stl
   */
  MODEL_STL( "stl", "model/stl"),

  /**
   * COLLADA
   */
  MODEL_VND_COLLADA_XML( "COLLADA", "model/vnd.collada+xml"),

  /**
   * Autodesk Design Web Format (DWF)
   */
  MODEL_VND_DWF( "Autodesk Design Web Format (DWF)", "model/vnd.dwf"),

  /**
   * vnd.flatland.3dml
   */
  MODEL_VND_FLATLAND_3DML( "vnd.flatland.3dml", "model/vnd.flatland.3dml"),

  /**
   * Geometric Description Language (GDL)
   */
  MODEL_VND_GDL( "Geometric Description Language (GDL)", "model/vnd.gdl"),

  /**
   * vnd.gs-gdl
   */
  MODEL_VND_GS_GDL( "vnd.gs-gdl", "model/vnd.gs-gdl"),

  /**
   * Gen-Trix Studio
   */
  MODEL_VND_GTW( "Gen-Trix Studio", "model/vnd.gtw"),

  /**
   * vnd.moml+xml
   */
  MODEL_VND_MOML_XML( "vnd.moml+xml", "model/vnd.moml+xml"),

  /**
   * Virtue MTS
   */
  MODEL_VND_MTS( "Virtue MTS", "model/vnd.mts"),

  /**
   * vnd.opengex
   */
  MODEL_VND_OPENGEX( "vnd.opengex", "model/vnd.opengex"),

  /**
   * vnd.parasolid.transmit.binary
   */
  MODEL_VND_PARASOLID_TRANSMIT_BINARY( "vnd.parasolid.transmit.binary", "model/vnd.parasolid.transmit.binary"),

  /**
   * vnd.parasolid.transmit.text
   */
  MODEL_VND_PARASOLID_TRANSMIT_TEXT( "vnd.parasolid.transmit.text", "model/vnd.parasolid.transmit.text"),

  /**
   * vnd.rosette.annotated-data-model
   */
  MODEL_VND_ROSETTE_ANNOTATED_DATA_MODEL( "vnd.rosette.annotated-data-model", "model/vnd.rosette.annotated-data-model"),

  /**
   * vnd.usdz+zip
   */
  MODEL_VND_USDZ_ZIP( "vnd.usdz+zip", "model/vnd.usdz+zip"),

  /**
   * vnd.valve.source.compiled-map
   */
  MODEL_VND_VALVE_SOURCE_COMPILED_MAP( "vnd.valve.source.compiled-map", "model/vnd.valve.source.compiled-map"),

  /**
   * Virtue VTU
   */
  MODEL_VND_VTU( "Virtue VTU", "model/vnd.vtu"),

  /**
   * Virtual Reality Modeling Language
   */
  MODEL_VRML( "Virtual Reality Modeling Language", "model/vrml"),

  /**
   * x3d+fastinfoset
   */
  MODEL_X3D_FASTINFOSET( "x3d+fastinfoset", "model/x3d+fastinfoset"),

  /**
   * x3d+xml
   */
  MODEL_X3D_XML( "x3d+xml", "model/x3d+xml"),

  /**
   * x3d-vrml
   */
  MODEL_X3D_VRML( "x3d-vrml", "model/x3d-vrml"),

  /**
   * alternative
   */
  MULTIPART_ALTERNATIVE( "alternative", "multipart/alternative"),

  /**
   * appledouble
   */
  MULTIPART_APPLEDOUBLE( "appledouble", "multipart/appledouble"),

  /**
   * byteranges
   */
  MULTIPART_BYTERANGES( "byteranges", "multipart/byteranges"),

  /**
   * digest
   */
  MULTIPART_DIGEST( "digest", "multipart/digest"),

  /**
   * encrypted
   */
  MULTIPART_ENCRYPTED( "encrypted", "multipart/encrypted"),

  /**
   * example
   */
  MULTIPART_EXAMPLE( "example", "multipart/example"),

  /**
   * form-data
   */
  MULTIPART_FORM_DATA( "form-data", "multipart/form-data"),

  /**
   * header-set
   */
  MULTIPART_HEADER_SET( "header-set", "multipart/header-set"),

  /**
   * mixed
   */
  MULTIPART_MIXED( "mixed", "multipart/mixed"),

  /**
   * multilingual
   */
  MULTIPART_MULTILINGUAL( "multilingual", "multipart/multilingual"),

  /**
   * parallel
   */
  MULTIPART_PARALLEL( "parallel", "multipart/parallel"),

  /**
   * related
   */
  MULTIPART_RELATED( "related", "multipart/related"),

  /**
   * report
   */
  MULTIPART_REPORT( "report", "multipart/report"),

  /**
   * signed
   */
  MULTIPART_SIGNED( "signed", "multipart/signed"),

  /**
   * vnd.bint.med-plus
   */
  MULTIPART_VND_BINT_MED_PLUS( "vnd.bint.med-plus", "multipart/vnd.bint.med-plus"),

  /**
   * voice-message
   */
  MULTIPART_VOICE_MESSAGE( "voice-message", "multipart/voice-message"),

  /**
   * x-mixed-replace
   */
  MULTIPART_X_MIXED_REPLACE( "x-mixed-replace", "multipart/x-mixed-replace"),

  /**
   * 1d-interleaved-parityfec
   */
  TEXT_1D_INTERLEAVED_PARITYFEC( "1d-interleaved-parityfec", "text/1d-interleaved-parityfec"),

  /**
   * RED
   */
  TEXT_RED( "RED", "text/RED"),

  /**
   * cache-manifest
   */
  TEXT_CACHE_MANIFEST( "cache-manifest", "text/cache-manifest"),

  /**
   * iCalendar
   */
  TEXT_CALENDAR( "iCalendar", "text/calendar"),

  /**
   * cql
   */
  TEXT_CQL( "cql", "text/cql"),

  /**
   * cql-expression
   */
  TEXT_CQL_EXPRESSION( "cql-expression", "text/cql-expression"),

  /**
   * cql-identifier
   */
  TEXT_CQL_IDENTIFIER( "cql-identifier", "text/cql-identifier"),

  /**
   * Cascading Style Sheets (CSS)
   */
  TEXT_CSS( "Cascading Style Sheets (CSS)", "text/css"),

  /**
   * Comma-Seperated Values
   */
  TEXT_CSV( "Comma-Seperated Values", "text/csv"),

  /**
   * csv-schema
   */
  TEXT_CSV_SCHEMA( "csv-schema", "text/csv-schema"),

  /**
   * dns
   */
  TEXT_DNS( "dns", "text/dns"),

  /**
   * encaprtp
   */
  TEXT_ENCAPRTP( "encaprtp", "text/encaprtp"),

  /**
   * enriched
   */
  TEXT_ENRICHED( "enriched", "text/enriched"),

  /**
   * example
   */
  TEXT_EXAMPLE( "example", "text/example"),

  /**
   * fhirpath
   */
  TEXT_FHIRPATH( "fhirpath", "text/fhirpath"),

  /**
   * flexfec
   */
  TEXT_FLEXFEC( "flexfec", "text/flexfec"),

  /**
   * fwdred
   */
  TEXT_FWDRED( "fwdred", "text/fwdred"),

  /**
   * gff3
   */
  TEXT_GFF3( "gff3", "text/gff3"),

  /**
   * grammar-ref-list
   */
  TEXT_GRAMMAR_REF_LIST( "grammar-ref-list", "text/grammar-ref-list"),

  /**
   * HyperText Markup Language (HTML)
   */
  TEXT_HTML( "HyperText Markup Language (HTML)", "text/html"),

  /**
   * jcr-cnd
   */
  TEXT_JCR_CND( "jcr-cnd", "text/jcr-cnd"),

  /**
   * markdown
   */
  TEXT_MARKDOWN( "markdown", "text/markdown"),

  /**
   * mizar
   */
  TEXT_MIZAR( "mizar", "text/mizar"),

  /**
   * Notation3
   */
  TEXT_N3( "Notation3", "text/n3"),

  /**
   * parameters
   */
  TEXT_PARAMETERS( "parameters", "text/parameters"),

  /**
   * parityfec
   */
  TEXT_PARITYFEC( "parityfec", "text/parityfec"),

  /**
   * Text File
   */
  TEXT_PLAIN( "Text File", "text/plain"),

  /**
   * BAS Partitur Format
   */
  TEXT_PLAIN_BAS( "BAS Partitur Format", "text/plain-bas"),

  /**
   * provenance-notation
   */
  TEXT_PROVENANCE_NOTATION( "provenance-notation", "text/provenance-notation"),

  /**
   * prs.fallenstein.rst
   */
  TEXT_PRS_FALLENSTEIN_RST( "prs.fallenstein.rst", "text/prs.fallenstein.rst"),

  /**
   * PRS Lines Tag
   */
  TEXT_PRS_LINES_TAG( "PRS Lines Tag", "text/prs.lines.tag"),

  /**
   * prs.prop.logic
   */
  TEXT_PRS_PROP_LOGIC( "prs.prop.logic", "text/prs.prop.logic"),

  /**
   * raptorfec
   */
  TEXT_RAPTORFEC( "raptorfec", "text/raptorfec"),

  /**
   * rfc822-headers
   */
  TEXT_RFC822_HEADERS( "rfc822-headers", "text/rfc822-headers"),

  /**
   * Rich Text Format (RTF)
   */
  TEXT_RICHTEXT( "Rich Text Format (RTF)", "text/richtext"),

  /**
   * rtf
   */
  TEXT_RTF( "rtf", "text/rtf"),

  /**
   * rtp-enc-aescm128
   */
  TEXT_RTP_ENC_AESCM128( "rtp-enc-aescm128", "text/rtp-enc-aescm128"),

  /**
   * rtploopback
   */
  TEXT_RTPLOOPBACK( "rtploopback", "text/rtploopback"),

  /**
   * rtx
   */
  TEXT_RTX( "rtx", "text/rtx"),

  /**
   * Standard Generalized Markup Language (SGML)
   */
  TEXT_SGML( "Standard Generalized Markup Language (SGML)", "text/sgml"),

  /**
   * shaclc
   */
  TEXT_SHACLC( "shaclc", "text/shaclc"),

  /**
   * spdx
   */
  TEXT_SPDX( "spdx", "text/spdx"),

  /**
   * strings
   */
  TEXT_STRINGS( "strings", "text/strings"),

  /**
   * t140
   */
  TEXT_T140( "t140", "text/t140"),

  /**
   * Tab Seperated Values
   */
  TEXT_TAB_SEPARATED_VALUES( "Tab Seperated Values", "text/tab-separated-values"),

  /**
   * troff
   */
  TEXT_TROFF( "troff", "text/troff"),

  /**
   * Turtle (Terse RDF Triple Language)
   */
  TEXT_TURTLE( "Turtle (Terse RDF Triple Language)", "text/turtle"),

  /**
   * ulpfec
   */
  TEXT_ULPFEC( "ulpfec", "text/ulpfec"),

  /**
   * URI Resolution Services
   */
  TEXT_URI_LIST( "URI Resolution Services", "text/uri-list"),

  /**
   * vcard
   */
  TEXT_VCARD( "vcard", "text/vcard"),

  /**
   * vnd.DMClientScript
   */
  TEXT_VND_DMCLIENTSCRIPT( "vnd.DMClientScript", "text/vnd.DMClientScript"),

  /**
   * vnd.IPTC.NITF
   */
  TEXT_VND_IPTC_NITF( "vnd.IPTC.NITF", "text/vnd.IPTC.NITF"),

  /**
   * vnd.IPTC.NewsML
   */
  TEXT_VND_IPTC_NEWSML( "vnd.IPTC.NewsML", "text/vnd.IPTC.NewsML"),

  /**
   * vnd.a
   */
  TEXT_VND_A( "vnd.a", "text/vnd.a"),

  /**
   * vnd.abc
   */
  TEXT_VND_ABC( "vnd.abc", "text/vnd.abc"),

  /**
   * vnd.ascii-art
   */
  TEXT_VND_ASCII_ART( "vnd.ascii-art", "text/vnd.ascii-art"),

  /**
   * Curl - Applet
   */
  TEXT_VND_CURL( "Curl - Applet", "text/vnd.curl"),

  /**
   * Curl - Detached Applet
   */
  TEXT_VND_CURL_DCURL( "Curl - Detached Applet", "text/vnd.curl.dcurl"),

  /**
   * Curl - Manifest File
   */
  TEXT_VND_CURL_MCURL( "Curl - Manifest File", "text/vnd.curl.mcurl"),

  /**
   * Curl - Source Code
   */
  TEXT_VND_CURL_SCURL( "Curl - Source Code", "text/vnd.curl.scurl"),

  /**
   * vnd.debian.copyright
   */
  TEXT_VND_DEBIAN_COPYRIGHT( "vnd.debian.copyright", "text/vnd.debian.copyright"),

  /**
   * vnd.dvb.subtitle
   */
  TEXT_VND_DVB_SUBTITLE( "vnd.dvb.subtitle", "text/vnd.dvb.subtitle"),

  /**
   * vnd.esmertec.theme-descriptor
   */
  TEXT_VND_ESMERTEC_THEME_DESCRIPTOR( "vnd.esmertec.theme-descriptor", "text/vnd.esmertec.theme-descriptor"),

  /**
   * vnd.ficlab.flt
   */
  TEXT_VND_FICLAB_FLT( "vnd.ficlab.flt", "text/vnd.ficlab.flt"),

  /**
   * mod_fly / fly.cgi
   */
  TEXT_VND_FLY( "mod_fly / fly.cgi", "text/vnd.fly"),

  /**
   * FLEXSTOR
   */
  TEXT_VND_FMI_FLEXSTOR( "FLEXSTOR", "text/vnd.fmi.flexstor"),

  /**
   * vnd.gml
   */
  TEXT_VND_GML( "vnd.gml", "text/vnd.gml"),

  /**
   * Graphviz
   */
  TEXT_VND_GRAPHVIZ( "Graphviz", "text/vnd.graphviz"),

  /**
   * vnd.hans
   */
  TEXT_VND_HANS( "vnd.hans", "text/vnd.hans"),

  /**
   * vnd.hgl
   */
  TEXT_VND_HGL( "vnd.hgl", "text/vnd.hgl"),

  /**
   * In3D - 3DML
   */
  TEXT_VND_IN3D_3DML( "In3D - 3DML", "text/vnd.in3d.3dml"),

  /**
   * In3D - 3DML
   */
  TEXT_VND_IN3D_SPOT( "In3D - 3DML", "text/vnd.in3d.spot"),

  /**
   * vnd.latex-z
   */
  TEXT_VND_LATEX_Z( "vnd.latex-z", "text/vnd.latex-z"),

  /**
   * vnd.motorola.reflex
   */
  TEXT_VND_MOTOROLA_REFLEX( "vnd.motorola.reflex", "text/vnd.motorola.reflex"),

  /**
   * vnd.ms-mediapackage
   */
  TEXT_VND_MS_MEDIAPACKAGE( "vnd.ms-mediapackage", "text/vnd.ms-mediapackage"),

  /**
   * vnd.net2phone.commcenter.command
   */
  TEXT_VND_NET2PHONE_COMMCENTER_COMMAND( "vnd.net2phone.commcenter.command", "text/vnd.net2phone.commcenter.command"),

  /**
   * vnd.radisys.msml-basic-layout
   */
  TEXT_VND_RADISYS_MSML_BASIC_LAYOUT( "vnd.radisys.msml-basic-layout", "text/vnd.radisys.msml-basic-layout"),

  /**
   * vnd.senx.warpscript
   */
  TEXT_VND_SENX_WARPSCRIPT( "vnd.senx.warpscript", "text/vnd.senx.warpscript"),

  /**
   * vnd.sosi
   */
  TEXT_VND_SOSI( "vnd.sosi", "text/vnd.sosi"),

  /**
   * J2ME App Descriptor
   */
  TEXT_VND_SUN_J2ME_APP_DESCRIPTOR( "J2ME App Descriptor", "text/vnd.sun.j2me.app-descriptor"),

  /**
   * vnd.trolltech.linguist
   */
  TEXT_VND_TROLLTECH_LINGUIST( "vnd.trolltech.linguist", "text/vnd.trolltech.linguist"),

  /**
   * vnd.wap.si
   */
  TEXT_VND_WAP_SI( "vnd.wap.si", "text/vnd.wap.si"),

  /**
   * vnd.wap.sl
   */
  TEXT_VND_WAP_SL( "vnd.wap.sl", "text/vnd.wap.sl"),

  /**
   * Wireless Markup Language (WML)
   */
  TEXT_VND_WAP_WML( "Wireless Markup Language (WML)", "text/vnd.wap.wml"),

  /**
   * Wireless Markup Language Script (WMLScript)
   */
  TEXT_VND_WAP_WMLSCRIPT( "Wireless Markup Language Script (WMLScript)", "text/vnd.wap.wmlscript"),

  /**
   * vtt
   */
  TEXT_VTT( "vtt", "text/vtt"),

  /**
   * Assembler Source File
   */
  TEXT_X_ASM( "Assembler Source File", "text/x-asm"),

  /**
   * C Source File
   */
  TEXT_X_C( "C Source File", "text/x-c"),

  /**
   * Fortran Source File
   */
  TEXT_X_FORTRAN( "Fortran Source File", "text/x-fortran"),

  /**
   * Java Source File
   */
  TEXT_X_JAVA_SOURCE( "Java Source File", "text/x-java-source"),

  /**
   * Pascal Source File
   */
  TEXT_X_PASCAL( "Pascal Source File", "text/x-pascal"),

  /**
   * Setext
   */
  TEXT_X_SETEXT( "Setext", "text/x-setext"),

  /**
   * UUEncode
   */
  TEXT_X_UUENCODE( "UUEncode", "text/x-uuencode"),

  /**
   * vCalendar
   */
  TEXT_X_VCALENDAR( "vCalendar", "text/x-vcalendar"),

  /**
   * vCard
   */
  TEXT_X_VCARD( "vCard", "text/x-vcard"),

  /**
   * xml
   */
  TEXT_XML( "xml", "text/xml"),

  /**
   * xml-external-parsed-entity
   */
  TEXT_XML_EXTERNAL_PARSED_ENTITY( "xml-external-parsed-entity", "text/xml-external-parsed-entity"),

  /**
   * Yet Another Markup Language
   */
  TEXT_YAML( "Yet Another Markup Language", "text/yaml"),

  /**
   * Java properties
   */
  TEXT_X_JAVA_PROPERTIES( "Java properties", "text/x-java-properties" ),

  /**
   * 1d-interleaved-parityfec
   */
  VIDEO_1D_INTERLEAVED_PARITYFEC( "1d-interleaved-parityfec", "video/1d-interleaved-parityfec"),

  /**
   * 3GP
   */
  VIDEO_3GPP( "3GP", "video/3gpp"),

  /**
   * 3gpp-tt
   */
  VIDEO_3GPP_TT( "3gpp-tt", "video/3gpp-tt"),

  /**
   * 3GP2
   */
  VIDEO_3GPP2( "3GP2", "video/3gpp2"),

  /**
   * BMPEG
   */
  VIDEO_BMPEG( "BMPEG", "video/BMPEG"),

  /**
   * BT656
   */
  VIDEO_BT656( "BT656", "video/BT656"),

  /**
   * CelB
   */
  VIDEO_CELB( "CelB", "video/CelB"),

  /**
   * DV
   */
  VIDEO_DV( "DV", "video/DV"),

  /**
   * H261
   */
  VIDEO_H261( "H261", "video/H261"),

  /**
   * H263
   */
  VIDEO_H263( "H263", "video/H263"),

  /**
   * H263-1998
   */
  VIDEO_H263_1998( "H263-1998", "video/H263-1998"),

  /**
   * H263-2000
   */
  VIDEO_H263_2000( "H263-2000", "video/H263-2000"),

  /**
   * H264
   */
  VIDEO_H264( "H264", "video/H264"),

  /**
   * H264-RCDO
   */
  VIDEO_H264_RCDO( "H264-RCDO", "video/H264-RCDO"),

  /**
   * H264-SVC
   */
  VIDEO_H264_SVC( "H264-SVC", "video/H264-SVC"),

  /**
   * H265
   */
  VIDEO_H265( "H265", "video/H265"),

  /**
   * JPEG
   */
  VIDEO_JPEG( "JPEG", "video/JPEG"),

  /**
   * MP1S
   */
  VIDEO_MP1S( "MP1S", "video/MP1S"),

  /**
   * MP2P
   */
  VIDEO_MP2P( "MP2P", "video/MP2P"),

  /**
   * MP2T
   */
  VIDEO_MP2T( "MP2T", "video/MP2T"),

  /**
   * MP4V-ES
   */
  VIDEO_MP4V_ES( "MP4V-ES", "video/MP4V-ES"),

  /**
   * MPV
   */
  VIDEO_MPV( "MPV", "video/MPV"),

  /**
   * SMPTE292M
   */
  VIDEO_SMPTE292M( "SMPTE292M", "video/SMPTE292M"),

  /**
   * VP8
   */
  VIDEO_VP8( "VP8", "video/VP8"),

  /**
   * encaprtp
   */
  VIDEO_ENCAPRTP( "encaprtp", "video/encaprtp"),

  /**
   * example
   */
  VIDEO_EXAMPLE( "example", "video/example"),

  /**
   * flexfec
   */
  VIDEO_FLEXFEC( "flexfec", "video/flexfec"),

  /**
   * iso.segment
   */
  VIDEO_ISO_SEGMENT( "iso.segment", "video/iso.segment"),

  /**
   * jpeg2000
   */
  VIDEO_JPEG2000( "jpeg2000", "video/jpeg2000"),

  /**
   * JPEG 2000 Compound Image File Format
   */
  VIDEO_JPM( "JPEG 2000 Compound Image File Format", "video/jpm"),

  /**
   * Motion JPEG 2000
   */
  VIDEO_MJ2( "Motion JPEG 2000", "video/mj2"),

  /**
   * MPEG-4 Video
   */
  VIDEO_MP4( "MPEG-4 Video", "video/mp4"),

  /**
   * MPEG Video
   */
  VIDEO_MPEG( "MPEG Video", "video/mpeg"),

  /**
   * mpeg4-generic
   */
  VIDEO_MPEG4_GENERIC( "mpeg4-generic", "video/mpeg4-generic"),

  /**
   * nv
   */
  VIDEO_NV( "nv", "video/nv"),

  /**
   * Ogg Video
   */
  VIDEO_OGG( "Ogg Video", "video/ogg"),

  /**
   * parityfec
   */
  VIDEO_PARITYFEC( "parityfec", "video/parityfec"),

  /**
   * pointer
   */
  VIDEO_POINTER( "pointer", "video/pointer"),

  /**
   * Quicktime Video
   */
  VIDEO_QUICKTIME( "Quicktime Video", "video/quicktime"),

  /**
   * raptorfec
   */
  VIDEO_RAPTORFEC( "raptorfec", "video/raptorfec"),

  /**
   * raw
   */
  VIDEO_RAW( "raw", "video/raw"),

  /**
   * rtp-enc-aescm128
   */
  VIDEO_RTP_ENC_AESCM128( "rtp-enc-aescm128", "video/rtp-enc-aescm128"),

  /**
   * rtploopback
   */
  VIDEO_RTPLOOPBACK( "rtploopback", "video/rtploopback"),

  /**
   * rtx
   */
  VIDEO_RTX( "rtx", "video/rtx"),

  /**
   * smpte291
   */
  VIDEO_SMPTE291( "smpte291", "video/smpte291"),

  /**
   * ulpfec
   */
  VIDEO_ULPFEC( "ulpfec", "video/ulpfec"),

  /**
   * vc1
   */
  VIDEO_VC1( "vc1", "video/vc1"),

  /**
   * vc2
   */
  VIDEO_VC2( "vc2", "video/vc2"),

  /**
   * vnd.CCTV
   */
  VIDEO_VND_CCTV( "vnd.CCTV", "video/vnd.CCTV"),

  /**
   * DECE High Definition Video
   */
  VIDEO_VND_DECE_HD( "DECE High Definition Video", "video/vnd.dece.hd"),

  /**
   * DECE Mobile Video
   */
  VIDEO_VND_DECE_MOBILE( "DECE Mobile Video", "video/vnd.dece.mobile"),

  /**
   * vnd.dece.mp4
   */
  VIDEO_VND_DECE_MP4( "vnd.dece.mp4", "video/vnd.dece.mp4"),

  /**
   * DECE PD Video
   */
  VIDEO_VND_DECE_PD( "DECE PD Video", "video/vnd.dece.pd"),

  /**
   * DECE SD Video
   */
  VIDEO_VND_DECE_SD( "DECE SD Video", "video/vnd.dece.sd"),

  /**
   * DECE Video
   */
  VIDEO_VND_DECE_VIDEO( "DECE Video", "video/vnd.dece.video"),

  /**
   * vnd.directv.mpeg
   */
  VIDEO_VND_DIRECTV_MPEG( "vnd.directv.mpeg", "video/vnd.directv.mpeg"),

  /**
   * vnd.directv.mpeg-tts
   */
  VIDEO_VND_DIRECTV_MPEG_TTS( "vnd.directv.mpeg-tts", "video/vnd.directv.mpeg-tts"),

  /**
   * vnd.dlna.mpeg-tts
   */
  VIDEO_VND_DLNA_MPEG_TTS( "vnd.dlna.mpeg-tts", "video/vnd.dlna.mpeg-tts"),

  /**
   * vnd.dvb.file
   */
  VIDEO_VND_DVB_FILE( "vnd.dvb.file", "video/vnd.dvb.file"),

  /**
   * FAST Search &amp; Transfer ASA
   */
  VIDEO_VND_FVT( "FAST Search &amp; Transfer ASA", "video/vnd.fvt"),

  /**
   * vnd.hns.video
   */
  VIDEO_VND_HNS_VIDEO( "vnd.hns.video", "video/vnd.hns.video"),

  /**
   * vnd.iptvforum.1dparityfec-1010
   */
  VIDEO_VND_IPTVFORUM_1DPARITYFEC_1010( "vnd.iptvforum.1dparityfec-1010", "video/vnd.iptvforum.1dparityfec-1010"),

  /**
   * vnd.iptvforum.1dparityfec-2005
   */
  VIDEO_VND_IPTVFORUM_1DPARITYFEC_2005( "vnd.iptvforum.1dparityfec-2005", "video/vnd.iptvforum.1dparityfec-2005"),

  /**
   * vnd.iptvforum.2dparityfec-1010
   */
  VIDEO_VND_IPTVFORUM_2DPARITYFEC_1010( "vnd.iptvforum.2dparityfec-1010", "video/vnd.iptvforum.2dparityfec-1010"),

  /**
   * vnd.iptvforum.2dparityfec-2005
   */
  VIDEO_VND_IPTVFORUM_2DPARITYFEC_2005( "vnd.iptvforum.2dparityfec-2005", "video/vnd.iptvforum.2dparityfec-2005"),

  /**
   * vnd.iptvforum.ttsavc
   */
  VIDEO_VND_IPTVFORUM_TTSAVC( "vnd.iptvforum.ttsavc", "video/vnd.iptvforum.ttsavc"),

  /**
   * vnd.iptvforum.ttsmpeg2
   */
  VIDEO_VND_IPTVFORUM_TTSMPEG2( "vnd.iptvforum.ttsmpeg2", "video/vnd.iptvforum.ttsmpeg2"),

  /**
   * vnd.motorola.video
   */
  VIDEO_VND_MOTOROLA_VIDEO( "vnd.motorola.video", "video/vnd.motorola.video"),

  /**
   * vnd.motorola.videop
   */
  VIDEO_VND_MOTOROLA_VIDEOP( "vnd.motorola.videop", "video/vnd.motorola.videop"),

  /**
   * MPEG Url
   */
  VIDEO_VND_MPEGURL( "MPEG Url", "video/vnd.mpegurl"),

  /**
   * Microsoft PlayReady Ecosystem Video
   */
  VIDEO_VND_MS_PLAYREADY_MEDIA_PYV( "Microsoft PlayReady Ecosystem Video", "video/vnd.ms-playready.media.pyv"),

  /**
   * vnd.nokia.interleaved-multimedia
   */
  VIDEO_VND_NOKIA_INTERLEAVED_MULTIMEDIA( "vnd.nokia.interleaved-multimedia", "video/vnd.nokia.interleaved-multimedia"),

  /**
   * vnd.nokia.mp4vr
   */
  VIDEO_VND_NOKIA_MP4VR( "vnd.nokia.mp4vr", "video/vnd.nokia.mp4vr"),

  /**
   * vnd.nokia.videovoip
   */
  VIDEO_VND_NOKIA_VIDEOVOIP( "vnd.nokia.videovoip", "video/vnd.nokia.videovoip"),

  /**
   * vnd.objectvideo
   */
  VIDEO_VND_OBJECTVIDEO( "vnd.objectvideo", "video/vnd.objectvideo"),

  /**
   * vnd.radgamettools.bink
   */
  VIDEO_VND_RADGAMETTOOLS_BINK( "vnd.radgamettools.bink", "video/vnd.radgamettools.bink"),

  /**
   * vnd.radgamettools.smacker
   */
  VIDEO_VND_RADGAMETTOOLS_SMACKER( "vnd.radgamettools.smacker", "video/vnd.radgamettools.smacker"),

  /**
   * vnd.sealed.mpeg1
   */
  VIDEO_VND_SEALED_MPEG1( "vnd.sealed.mpeg1", "video/vnd.sealed.mpeg1"),

  /**
   * vnd.sealed.mpeg4
   */
  VIDEO_VND_SEALED_MPEG4( "vnd.sealed.mpeg4", "video/vnd.sealed.mpeg4"),

  /**
   * vnd.sealed.swf
   */
  VIDEO_VND_SEALED_SWF( "vnd.sealed.swf", "video/vnd.sealed.swf"),

  /**
   * vnd.sealedmedia.softseal.mov
   */
  VIDEO_VND_SEALEDMEDIA_SOFTSEAL_MOV( "vnd.sealedmedia.softseal.mov", "video/vnd.sealedmedia.softseal.mov"),

  /**
   * DECE MP4
   */
  VIDEO_VND_UVVU_MP4( "DECE MP4", "video/vnd.uvvu.mp4"),

  /**
   * Vivo
   */
  VIDEO_VND_VIVO( "Vivo", "video/vnd.vivo"),

  /**
   * vnd.youtube.yt
   */
  VIDEO_VND_YOUTUBE_YT( "vnd.youtube.yt", "video/vnd.youtube.yt"),

  /**
   * Open Web Media Project - Video
   */
  VIDEO_WEBM( "Open Web Media Project - Video", "video/webm"),

  /**
   * Flash Video
   */
  VIDEO_X_F4V( "Flash Video", "video/x-f4v"),

  /**
   * FLI/FLC Animation Format
   */
  VIDEO_X_FLI( "FLI/FLC Animation Format", "video/x-fli"),

  /**
   * Flash Video
   */
  VIDEO_X_FLV( "Flash Video", "video/x-flv"),

  /**
   * M4v
   */
  VIDEO_X_M4V( "M4v", "video/x-m4v"),

  /**
   * Microsoft Advanced Systems Format (ASF)
   */
  VIDEO_X_MS_ASF( "Microsoft Advanced Systems Format (ASF)", "video/x-ms-asf"),

  /**
   * Microsoft Windows Media
   */
  VIDEO_X_MS_WM( "Microsoft Windows Media", "video/x-ms-wm"),

  /**
   * Microsoft Windows Media Video
   */
  VIDEO_X_MS_WMV( "Microsoft Windows Media Video", "video/x-ms-wmv"),

  /**
   * Microsoft Windows Media Audio/Video Playlist
   */
  VIDEO_X_MS_WMX( "Microsoft Windows Media Audio/Video Playlist", "video/x-ms-wmx"),

  /**
   * Microsoft Windows Media Video Playlist
   */
  VIDEO_X_MS_WVX( "Microsoft Windows Media Video Playlist", "video/x-ms-wvx"),

  /**
   * Audio Video Interleave (AVI)
   */
  VIDEO_X_MSVIDEO( "Audio Video Interleave (AVI)", "video/x-msvideo"),

  /**
   * SGI Movie
   */
  VIDEO_X_SGI_MOVIE( "SGI Movie", "video/x-sgi-movie"),

  /**
   * CoolTalk
   */
  X_CONFERENCE_X_COOLTALK( "CoolTalk", "x-conference/x-cooltalk"),

  /**
   * Ion format
   */
  APPLICATION_ION("Ion format", "application/ion"),

  /**
   * Smile format
   */
  APPLICATION_SMILE("Smile format", "application/smile");

}
