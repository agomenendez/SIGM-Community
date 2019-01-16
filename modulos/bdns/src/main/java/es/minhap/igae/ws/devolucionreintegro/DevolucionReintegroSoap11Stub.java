/**
 * DevolucionReintegroSoap11Stub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package es.minhap.igae.ws.devolucionreintegro;

import es.dipucr.sigem.ws.common.firma.SSLUtilities;

public class DevolucionReintegroSoap11Stub extends org.apache.axis.client.Stub implements es.minhap.igae.ws.devolucionreintegro.DevolucionReintegro {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[3];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("peticion");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://intermediacion.redsara.es/scsp/esquemas/V3/peticion", "Peticion"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://intermediacion.redsara.es/scsp/esquemas/V3/peticion", ">Peticion"), devolucion.es.redsara.intermediacion.scsp.esquemas.V3.peticion.Peticion.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://intermediacion.redsara.es/scsp/esquemas/V3/respuesta", ">Respuesta"));
        oper.setReturnClass(devolucion.es.redsara.intermediacion.scsp.esquemas.V3.respuesta.Respuesta.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://intermediacion.redsara.es/scsp/esquemas/V3/respuesta", "Respuesta"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("peticionAsincrona");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://intermediacion.redsara.es/scsp/esquemas/V3/peticion", "PeticionAsincrona"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://intermediacion.redsara.es/scsp/esquemas/V3/peticion", ">PeticionAsincrona"), devolucion.es.redsara.intermediacion.scsp.esquemas.V3.peticion.PeticionAsincrona.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://intermediacion.redsara.es/scsp/esquemas/V3/confirmacionPeticion", ">ConfirmacionPeticion"));
        oper.setReturnClass(devolucion.es.redsara.intermediacion.scsp.esquemas.V3.confirmacionPeticion.ConfirmacionPeticion.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://intermediacion.redsara.es/scsp/esquemas/V3/confirmacionPeticion", "ConfirmacionPeticion"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("solicitudRespuesta");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://intermediacion.redsara.es/scsp/esquemas/V3/solicitudRespuesta", "SolicitudRespuesta"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://intermediacion.redsara.es/scsp/esquemas/V3/solicitudRespuesta", ">SolicitudRespuesta"), devolucion.es.redsara.intermediacion.scsp.esquemas.V3.solicitudRespuesta.SolicitudRespuesta.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://intermediacion.redsara.es/scsp/esquemas/V3/respuesta", ">Respuesta"));
        oper.setReturnClass(devolucion.es.redsara.intermediacion.scsp.esquemas.V3.respuesta.Respuesta.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://intermediacion.redsara.es/scsp/esquemas/V3/respuesta", "Respuesta"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

    }

    public DevolucionReintegroSoap11Stub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public DevolucionReintegroSoap11Stub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public DevolucionReintegroSoap11Stub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://intermediacion.redsara.es/scsp/esquemas/V3/confirmacionPeticion", ">Atributos");
            cachedSerQNames.add(qName);
            cls = devolucion.es.redsara.intermediacion.scsp.esquemas.V3.confirmacionPeticion.Atributos.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://intermediacion.redsara.es/scsp/esquemas/V3/confirmacionPeticion", ">CodigoCertificado");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://intermediacion.redsara.es/scsp/esquemas/V3/confirmacionPeticion", ">CodigoEstado");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://intermediacion.redsara.es/scsp/esquemas/V3/confirmacionPeticion", ">CodigoEstadoSecundario");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://intermediacion.redsara.es/scsp/esquemas/V3/confirmacionPeticion", ">ConfirmacionPeticion");
            cachedSerQNames.add(qName);
            cls = devolucion.es.redsara.intermediacion.scsp.esquemas.V3.confirmacionPeticion.ConfirmacionPeticion.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://intermediacion.redsara.es/scsp/esquemas/V3/confirmacionPeticion", ">Estado");
            cachedSerQNames.add(qName);
            cls = devolucion.es.redsara.intermediacion.scsp.esquemas.V3.confirmacionPeticion.Estado.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://intermediacion.redsara.es/scsp/esquemas/V3/confirmacionPeticion", ">IdPeticion");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://intermediacion.redsara.es/scsp/esquemas/V3/confirmacionPeticion", ">LiteralError");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://intermediacion.redsara.es/scsp/esquemas/V3/confirmacionPeticion", ">NumElementos");
            cachedSerQNames.add(qName);
            cls = int.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://intermediacion.redsara.es/scsp/esquemas/V3/confirmacionPeticion", ">TiempoEstimadoRespuesta");
            cachedSerQNames.add(qName);
            cls = int.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://intermediacion.redsara.es/scsp/esquemas/V3/confirmacionPeticion", ">TimeStamp");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://intermediacion.redsara.es/scsp/esquemas/V3/datosEspecificos", ">>>>>DatosEspecificos>DatosEspecificosPeticion>Envio>Reintegro>CausasReint>Causas");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://intermediacion.redsara.es/scsp/esquemas/V3/datosEspecificos", ">>>>DatosEspecificos>DatosEspecificosPeticion>Envio>Reintegro>CausasReint");
            cachedSerQNames.add(qName);
            cls = devolucion.es.redsara.intermediacion.scsp.esquemas.V3.datosEspecificos.DatosEspecificosDatosEspecificosPeticionEnvioReintegroCausasReint.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://intermediacion.redsara.es/scsp/esquemas/V3/datosEspecificos", ">>>DatosEspecificos>DatosEspecificosPeticion>Envio>Devolucion");
            cachedSerQNames.add(qName);
            cls = devolucion.es.redsara.intermediacion.scsp.esquemas.V3.datosEspecificos.DatosEspecificosDatosEspecificosPeticionEnvioDevolucion.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://intermediacion.redsara.es/scsp/esquemas/V3/datosEspecificos", ">>>DatosEspecificos>DatosEspecificosPeticion>Envio>Reintegro");
            cachedSerQNames.add(qName);
            cls = devolucion.es.redsara.intermediacion.scsp.esquemas.V3.datosEspecificos.DatosEspecificosDatosEspecificosPeticionEnvioReintegro.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://intermediacion.redsara.es/scsp/esquemas/V3/datosEspecificos", ">>DatosEspecificos>DatosEspecificosPeticion>DatosGenerales");
            cachedSerQNames.add(qName);
            cls = devolucion.es.redsara.intermediacion.scsp.esquemas.V3.datosEspecificos.DatosEspecificosDatosEspecificosPeticionDatosGenerales.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://intermediacion.redsara.es/scsp/esquemas/V3/datosEspecificos", ">>DatosEspecificos>DatosEspecificosPeticion>Envio");
            cachedSerQNames.add(qName);
            cls = devolucion.es.redsara.intermediacion.scsp.esquemas.V3.datosEspecificos.DatosEspecificosDatosEspecificosPeticionEnvio.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://intermediacion.redsara.es/scsp/esquemas/V3/datosEspecificos", ">>DatosEspecificos>DatosEspecificosRespuesta>CodigoEstadoSecundarioSo");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://intermediacion.redsara.es/scsp/esquemas/V3/datosEspecificos", ">>DatosEspecificos>DatosEspecificosRespuesta>CodigoEstadoSo");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://intermediacion.redsara.es/scsp/esquemas/V3/datosEspecificos", ">>DatosEspecificos>DatosEspecificosRespuesta>DatosIdentificacion");
            cachedSerQNames.add(qName);
            cls = devolucion.es.redsara.intermediacion.scsp.esquemas.V3.datosEspecificos.DatosEspecificosDatosEspecificosRespuestaDatosIdentificacion.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://intermediacion.redsara.es/scsp/esquemas/V3/datosEspecificos", ">>DatosEspecificos>DatosEspecificosRespuesta>LiteralErrorSo");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://intermediacion.redsara.es/scsp/esquemas/V3/datosEspecificos", ">>IdConcesion>DiscriminadorConcesion");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://intermediacion.redsara.es/scsp/esquemas/V3/datosEspecificos", ">>IdConcesion>IdBeneficiario");
            cachedSerQNames.add(qName);
            cls = devolucion.es.redsara.intermediacion.scsp.esquemas.V3.datosEspecificos.IdConcesionIdBeneficiario.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://intermediacion.redsara.es/scsp/esquemas/V3/datosEspecificos", ">>IdDevolucion>DiscriminadorDev");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://intermediacion.redsara.es/scsp/esquemas/V3/datosEspecificos", ">>IdReintegro>DiscriminadorReint");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://intermediacion.redsara.es/scsp/esquemas/V3/datosEspecificos", ">DatosEspecificos>DatosEspecificosPeticion");
            cachedSerQNames.add(qName);
            cls = devolucion.es.redsara.intermediacion.scsp.esquemas.V3.datosEspecificos.DatosEspecificosDatosEspecificosPeticion.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://intermediacion.redsara.es/scsp/esquemas/V3/datosEspecificos", ">DatosEspecificos>DatosEspecificosRespuesta");
            cachedSerQNames.add(qName);
            cls = devolucion.es.redsara.intermediacion.scsp.esquemas.V3.datosEspecificos.DatosEspecificosDatosEspecificosRespuesta.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://intermediacion.redsara.es/scsp/esquemas/V3/datosEspecificos", ">IdConcesion");
            cachedSerQNames.add(qName);
            cls = devolucion.es.redsara.intermediacion.scsp.esquemas.V3.datosEspecificos.IdConcesion.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://intermediacion.redsara.es/scsp/esquemas/V3/datosEspecificos", ">IdConvocatoria");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://intermediacion.redsara.es/scsp/esquemas/V3/datosEspecificos", ">IdDevolucion");
            cachedSerQNames.add(qName);
            cls = devolucion.es.redsara.intermediacion.scsp.esquemas.V3.datosEspecificos.IdDevolucion.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://intermediacion.redsara.es/scsp/esquemas/V3/datosEspecificos", ">IdPersonaBen");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://intermediacion.redsara.es/scsp/esquemas/V3/datosEspecificos", ">IdReintegro");
            cachedSerQNames.add(qName);
            cls = devolucion.es.redsara.intermediacion.scsp.esquemas.V3.datosEspecificos.IdReintegro.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://intermediacion.redsara.es/scsp/esquemas/V3/datosEspecificos", ">OrganoGestor");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://intermediacion.redsara.es/scsp/esquemas/V3/datosEspecificos", ">PaisBen");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://intermediacion.redsara.es/scsp/esquemas/V3/datosEspecificos", ">TipoMovimiento");
            cachedSerQNames.add(qName);
            cls = devolucion.es.redsara.intermediacion.scsp.esquemas.V3.datosEspecificos.TipoMovimiento.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://intermediacion.redsara.es/scsp/esquemas/V3/datosEspecificos", "DatosEspecificos");
            cachedSerQNames.add(qName);
            cls = devolucion.es.redsara.intermediacion.scsp.esquemas.V3.datosEspecificos.DatosEspecificos.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://intermediacion.redsara.es/scsp/esquemas/V3/peticion", ">>SolicitudTransmision>DatosGenericos");
            cachedSerQNames.add(qName);
            cls = devolucion.es.redsara.intermediacion.scsp.esquemas.V3.peticion.SolicitudTransmisionDatosGenericos.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://intermediacion.redsara.es/scsp/esquemas/V3/peticion", ">Atributos");
            cachedSerQNames.add(qName);
            cls = devolucion.es.redsara.intermediacion.scsp.esquemas.V3.peticion.Atributos.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://intermediacion.redsara.es/scsp/esquemas/V3/peticion", ">CodigoCertificado");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://intermediacion.redsara.es/scsp/esquemas/V3/peticion", ">CodigoEstado");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://intermediacion.redsara.es/scsp/esquemas/V3/peticion", ">CodigoEstadoSecundario");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://intermediacion.redsara.es/scsp/esquemas/V3/peticion", ">Emisor");
            cachedSerQNames.add(qName);
            cls = devolucion.es.redsara.intermediacion.scsp.esquemas.V3.peticion.Emisor.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://intermediacion.redsara.es/scsp/esquemas/V3/peticion", ">Estado");
            cachedSerQNames.add(qName);
            cls = devolucion.es.redsara.intermediacion.scsp.esquemas.V3.peticion.Estado.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://intermediacion.redsara.es/scsp/esquemas/V3/peticion", ">FechaGeneracion");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://intermediacion.redsara.es/scsp/esquemas/V3/peticion", ">IdentificadorSolicitante");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://intermediacion.redsara.es/scsp/esquemas/V3/peticion", ">IdPeticion");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://intermediacion.redsara.es/scsp/esquemas/V3/peticion", ">IdSolicitud");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://intermediacion.redsara.es/scsp/esquemas/V3/peticion", ">IdTransmision");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://intermediacion.redsara.es/scsp/esquemas/V3/peticion", ">LiteralError");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://intermediacion.redsara.es/scsp/esquemas/V3/peticion", ">NifEmisor");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://intermediacion.redsara.es/scsp/esquemas/V3/peticion", ">NombreEmisor");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://intermediacion.redsara.es/scsp/esquemas/V3/peticion", ">NombreSolicitante");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://intermediacion.redsara.es/scsp/esquemas/V3/peticion", ">NumElementos");
            cachedSerQNames.add(qName);
            cls = int.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://intermediacion.redsara.es/scsp/esquemas/V3/peticion", ">Peticion");
            cachedSerQNames.add(qName);
            cls = devolucion.es.redsara.intermediacion.scsp.esquemas.V3.peticion.Peticion.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://intermediacion.redsara.es/scsp/esquemas/V3/peticion", ">PeticionAsincrona");
            cachedSerQNames.add(qName);
            cls = devolucion.es.redsara.intermediacion.scsp.esquemas.V3.peticion.PeticionAsincrona.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://intermediacion.redsara.es/scsp/esquemas/V3/peticion", ">Solicitante");
            cachedSerQNames.add(qName);
            cls = devolucion.es.redsara.intermediacion.scsp.esquemas.V3.peticion.Solicitante.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://intermediacion.redsara.es/scsp/esquemas/V3/peticion", ">Solicitudes");
            cachedSerQNames.add(qName);
            cls = devolucion.es.redsara.intermediacion.scsp.esquemas.V3.peticion.Solicitudes.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://intermediacion.redsara.es/scsp/esquemas/V3/peticion", ">SolicitudTransmision");
            cachedSerQNames.add(qName);
            cls = devolucion.es.redsara.intermediacion.scsp.esquemas.V3.peticion.SolicitudTransmision.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://intermediacion.redsara.es/scsp/esquemas/V3/peticion", ">TiempoEstimadoRespuesta");
            cachedSerQNames.add(qName);
            cls = int.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://intermediacion.redsara.es/scsp/esquemas/V3/peticion", ">TimeStamp");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://intermediacion.redsara.es/scsp/esquemas/V3/peticion", ">Titular");
            cachedSerQNames.add(qName);
            cls = devolucion.es.redsara.intermediacion.scsp.esquemas.V3.peticion.Titular.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://intermediacion.redsara.es/scsp/esquemas/V3/peticion", ">Transmision");
            cachedSerQNames.add(qName);
            cls = devolucion.es.redsara.intermediacion.scsp.esquemas.V3.peticion.Transmision.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://intermediacion.redsara.es/scsp/esquemas/V3/respuesta", ">Atributos");
            cachedSerQNames.add(qName);
            cls = devolucion.es.redsara.intermediacion.scsp.esquemas.V3.respuesta.Atributos.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://intermediacion.redsara.es/scsp/esquemas/V3/respuesta", ">CodigoCertificado");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://intermediacion.redsara.es/scsp/esquemas/V3/respuesta", ">CodigoEstado");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://intermediacion.redsara.es/scsp/esquemas/V3/respuesta", ">CodigoEstadoSecundario");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://intermediacion.redsara.es/scsp/esquemas/V3/respuesta", ">DatosGenericos");
            cachedSerQNames.add(qName);
            cls = devolucion.es.redsara.intermediacion.scsp.esquemas.V3.respuesta.DatosGenericos.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://intermediacion.redsara.es/scsp/esquemas/V3/respuesta", ">Emisor");
            cachedSerQNames.add(qName);
            cls = devolucion.es.redsara.intermediacion.scsp.esquemas.V3.respuesta.Emisor.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://intermediacion.redsara.es/scsp/esquemas/V3/respuesta", ">Estado");
            cachedSerQNames.add(qName);
            cls = devolucion.es.redsara.intermediacion.scsp.esquemas.V3.respuesta.Estado.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://intermediacion.redsara.es/scsp/esquemas/V3/respuesta", ">FechaGeneracion");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://intermediacion.redsara.es/scsp/esquemas/V3/respuesta", ">IdentificadorSolicitante");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://intermediacion.redsara.es/scsp/esquemas/V3/respuesta", ">IdPeticion");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://intermediacion.redsara.es/scsp/esquemas/V3/respuesta", ">IdSolicitud");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://intermediacion.redsara.es/scsp/esquemas/V3/respuesta", ">IdTransmision");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://intermediacion.redsara.es/scsp/esquemas/V3/respuesta", ">LiteralError");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://intermediacion.redsara.es/scsp/esquemas/V3/respuesta", ">NifEmisor");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://intermediacion.redsara.es/scsp/esquemas/V3/respuesta", ">NombreEmisor");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://intermediacion.redsara.es/scsp/esquemas/V3/respuesta", ">NombreSolicitante");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://intermediacion.redsara.es/scsp/esquemas/V3/respuesta", ">NumElementos");
            cachedSerQNames.add(qName);
            cls = int.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://intermediacion.redsara.es/scsp/esquemas/V3/respuesta", ">Respuesta");
            cachedSerQNames.add(qName);
            cls = devolucion.es.redsara.intermediacion.scsp.esquemas.V3.respuesta.Respuesta.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://intermediacion.redsara.es/scsp/esquemas/V3/respuesta", ">Solicitante");
            cachedSerQNames.add(qName);
            cls = devolucion.es.redsara.intermediacion.scsp.esquemas.V3.respuesta.Solicitante.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://intermediacion.redsara.es/scsp/esquemas/V3/respuesta", ">TiempoEstimadoRespuesta");
            cachedSerQNames.add(qName);
            cls = int.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://intermediacion.redsara.es/scsp/esquemas/V3/respuesta", ">TimeStamp");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://intermediacion.redsara.es/scsp/esquemas/V3/respuesta", ">Titular");
            cachedSerQNames.add(qName);
            cls = devolucion.es.redsara.intermediacion.scsp.esquemas.V3.respuesta.Titular.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://intermediacion.redsara.es/scsp/esquemas/V3/respuesta", ">Transmision");
            cachedSerQNames.add(qName);
            cls = devolucion.es.redsara.intermediacion.scsp.esquemas.V3.respuesta.Transmision.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://intermediacion.redsara.es/scsp/esquemas/V3/respuesta", ">TransmisionDatos");
            cachedSerQNames.add(qName);
            cls = devolucion.es.redsara.intermediacion.scsp.esquemas.V3.respuesta.TransmisionDatos.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://intermediacion.redsara.es/scsp/esquemas/V3/respuesta", ">Transmisiones");
            cachedSerQNames.add(qName);
            cls = devolucion.es.redsara.intermediacion.scsp.esquemas.V3.respuesta.Transmisiones.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://intermediacion.redsara.es/scsp/esquemas/V3/solicitudRespuesta", ">Atributos");
            cachedSerQNames.add(qName);
            cls = devolucion.es.redsara.intermediacion.scsp.esquemas.V3.solicitudRespuesta.Atributos.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://intermediacion.redsara.es/scsp/esquemas/V3/solicitudRespuesta", ">CodigoCertificado");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://intermediacion.redsara.es/scsp/esquemas/V3/solicitudRespuesta", ">CodigoEstado");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://intermediacion.redsara.es/scsp/esquemas/V3/solicitudRespuesta", ">CodigoEstadoSecundario");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://intermediacion.redsara.es/scsp/esquemas/V3/solicitudRespuesta", ">Estado");
            cachedSerQNames.add(qName);
            cls = devolucion.es.redsara.intermediacion.scsp.esquemas.V3.solicitudRespuesta.Estado.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://intermediacion.redsara.es/scsp/esquemas/V3/solicitudRespuesta", ">IdPeticion");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://intermediacion.redsara.es/scsp/esquemas/V3/solicitudRespuesta", ">LiteralError");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://intermediacion.redsara.es/scsp/esquemas/V3/solicitudRespuesta", ">NumElementos");
            cachedSerQNames.add(qName);
            cls = int.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://intermediacion.redsara.es/scsp/esquemas/V3/solicitudRespuesta", ">SolicitudRespuesta");
            cachedSerQNames.add(qName);
            cls = devolucion.es.redsara.intermediacion.scsp.esquemas.V3.solicitudRespuesta.SolicitudRespuesta.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://intermediacion.redsara.es/scsp/esquemas/V3/solicitudRespuesta", ">TiempoEstimadoRespuesta");
            cachedSerQNames.add(qName);
            cls = int.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://intermediacion.redsara.es/scsp/esquemas/V3/solicitudRespuesta", ">TimeStamp");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public devolucion.es.redsara.intermediacion.scsp.esquemas.V3.respuesta.Respuesta peticion(devolucion.es.redsara.intermediacion.scsp.esquemas.V3.peticion.Peticion peticion) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("peticion");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "peticion"));

        setRequestHeaders(_call);
        setAttachments(_call);
        
        try {
        	SSLUtilities.firmarPeticion(_call);
        	java.lang.Object _resp = _call.invoke(new java.lang.Object[] {peticion});

	        if (_resp instanceof java.rmi.RemoteException) {
	            throw (java.rmi.RemoteException)_resp;
	        }
	        else {
	            extractAttachments(_call);
	            try {
	                return (devolucion.es.redsara.intermediacion.scsp.esquemas.V3.respuesta.Respuesta) _resp;
	            } catch (java.lang.Exception _exception) {
	                return (devolucion.es.redsara.intermediacion.scsp.esquemas.V3.respuesta.Respuesta) org.apache.axis.utils.JavaUtils.convert(_resp, devolucion.es.redsara.intermediacion.scsp.esquemas.V3.respuesta.Respuesta.class);
	            }
	        }
        } catch (org.apache.axis.AxisFault axisFaultException) {
        	SSLUtilities.imprimirErrorEnvio(_call);
        	throw axisFaultException;
        }
    }

    public devolucion.es.redsara.intermediacion.scsp.esquemas.V3.confirmacionPeticion.ConfirmacionPeticion peticionAsincrona(devolucion.es.redsara.intermediacion.scsp.esquemas.V3.peticion.PeticionAsincrona peticion) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("peticionAsincrona");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "peticionAsincrona"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {peticion});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (devolucion.es.redsara.intermediacion.scsp.esquemas.V3.confirmacionPeticion.ConfirmacionPeticion) _resp;
            } catch (java.lang.Exception _exception) {
                return (devolucion.es.redsara.intermediacion.scsp.esquemas.V3.confirmacionPeticion.ConfirmacionPeticion) org.apache.axis.utils.JavaUtils.convert(_resp, devolucion.es.redsara.intermediacion.scsp.esquemas.V3.confirmacionPeticion.ConfirmacionPeticion.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public devolucion.es.redsara.intermediacion.scsp.esquemas.V3.respuesta.Respuesta solicitudRespuesta(devolucion.es.redsara.intermediacion.scsp.esquemas.V3.solicitudRespuesta.SolicitudRespuesta solicitudRespuesta) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("solicitudRespuesta");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "solicitudRespuesta"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {solicitudRespuesta});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (devolucion.es.redsara.intermediacion.scsp.esquemas.V3.respuesta.Respuesta) _resp;
            } catch (java.lang.Exception _exception) {
                return (devolucion.es.redsara.intermediacion.scsp.esquemas.V3.respuesta.Respuesta) org.apache.axis.utils.JavaUtils.convert(_resp, devolucion.es.redsara.intermediacion.scsp.esquemas.V3.respuesta.Respuesta.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}