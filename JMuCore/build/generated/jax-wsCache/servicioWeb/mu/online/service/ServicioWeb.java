
package mu.online.service;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebService(name = "servicioWeb", targetNamespace = "http://service.online.mu/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ServicioWeb {


    /**
     * 
     * @return
     *     returns java.util.List<mu.online.service.RankChar>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getRankCharacters", targetNamespace = "http://service.online.mu/", className = "mu.online.service.GetRankCharacters")
    @ResponseWrapper(localName = "getRankCharactersResponse", targetNamespace = "http://service.online.mu/", className = "mu.online.service.GetRankCharactersResponse")
    @Action(input = "http://service.online.mu/servicioWeb/getRankCharactersRequest", output = "http://service.online.mu/servicioWeb/getRankCharactersResponse")
    public List<RankChar> getRankCharacters();

    /**
     * 
     * @param login
     * @return
     *     returns java.util.List<mu.online.service.CharacterbyID>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getCharacterAccount", targetNamespace = "http://service.online.mu/", className = "mu.online.service.GetCharacterAccount")
    @ResponseWrapper(localName = "getCharacterAccountResponse", targetNamespace = "http://service.online.mu/", className = "mu.online.service.GetCharacterAccountResponse")
    @Action(input = "http://service.online.mu/servicioWeb/getCharacterAccountRequest", output = "http://service.online.mu/servicioWeb/getCharacterAccountResponse")
    public List<CharacterbyID> getCharacterAccount(
        @WebParam(name = "login", targetNamespace = "")
        String login);

    /**
     * 
     * @return
     *     returns mu.online.service.Statistics
     * @throws Exception_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "estadisticas", targetNamespace = "http://service.online.mu/", className = "mu.online.service.Estadisticas")
    @ResponseWrapper(localName = "estadisticasResponse", targetNamespace = "http://service.online.mu/", className = "mu.online.service.EstadisticasResponse")
    @Action(input = "http://service.online.mu/servicioWeb/estadisticasRequest", output = "http://service.online.mu/servicioWeb/estadisticasResponse", fault = {
        @FaultAction(className = Exception_Exception.class, value = "http://service.online.mu/servicioWeb/estadisticas/Fault/Exception")
    })
    public Statistics estadisticas()
        throws Exception_Exception
    ;

    /**
     * 
     * @param pwd
     * @param user
     * @return
     *     returns mu.online.service.Login
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "loginUser", targetNamespace = "http://service.online.mu/", className = "mu.online.service.LoginUser")
    @ResponseWrapper(localName = "loginUserResponse", targetNamespace = "http://service.online.mu/", className = "mu.online.service.LoginUserResponse")
    @Action(input = "http://service.online.mu/servicioWeb/loginUserRequest", output = "http://service.online.mu/servicioWeb/loginUserResponse")
    public Login loginUser(
        @WebParam(name = "user", targetNamespace = "")
        String user,
        @WebParam(name = "pwd", targetNamespace = "")
        String pwd);

    /**
     * 
     * @param name
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "hello", targetNamespace = "http://service.online.mu/", className = "mu.online.service.Hello")
    @ResponseWrapper(localName = "helloResponse", targetNamespace = "http://service.online.mu/", className = "mu.online.service.HelloResponse")
    @Action(input = "http://service.online.mu/servicioWeb/helloRequest", output = "http://service.online.mu/servicioWeb/helloResponse")
    public String hello(
        @WebParam(name = "name", targetNamespace = "")
        String name);

    /**
     * 
     * @return
     *     returns java.util.List<mu.online.service.RankPK>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getRankPK", targetNamespace = "http://service.online.mu/", className = "mu.online.service.GetRankPK")
    @ResponseWrapper(localName = "getRankPKResponse", targetNamespace = "http://service.online.mu/", className = "mu.online.service.GetRankPKResponse")
    @Action(input = "http://service.online.mu/servicioWeb/getRankPKRequest", output = "http://service.online.mu/servicioWeb/getRankPKResponse")
    public List<RankPK> getRankPK();

    /**
     * 
     * @return
     *     returns java.util.List<mu.online.service.RankGuild>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getRankGuild", targetNamespace = "http://service.online.mu/", className = "mu.online.service.GetRankGuild")
    @ResponseWrapper(localName = "getRankGuildResponse", targetNamespace = "http://service.online.mu/", className = "mu.online.service.GetRankGuildResponse")
    @Action(input = "http://service.online.mu/servicioWeb/getRankGuildRequest", output = "http://service.online.mu/servicioWeb/getRankGuildResponse")
    public List<RankGuild> getRankGuild();

    /**
     * 
     * @return
     *     returns mu.online.service.RankCS
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getRankCS", targetNamespace = "http://service.online.mu/", className = "mu.online.service.GetRankCS")
    @ResponseWrapper(localName = "getRankCSResponse", targetNamespace = "http://service.online.mu/", className = "mu.online.service.GetRankCSResponse")
    @Action(input = "http://service.online.mu/servicioWeb/getRankCSRequest", output = "http://service.online.mu/servicioWeb/getRankCSResponse")
    public RankCS getRankCS();

    /**
     * 
     * @param like
     * @return
     *     returns java.lang.Boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "isFBLike", targetNamespace = "http://service.online.mu/", className = "mu.online.service.IsFBLike")
    @ResponseWrapper(localName = "isFBLikeResponse", targetNamespace = "http://service.online.mu/", className = "mu.online.service.IsFBLikeResponse")
    @Action(input = "http://service.online.mu/servicioWeb/isFBLikeRequest", output = "http://service.online.mu/servicioWeb/isFBLikeResponse")
    public Boolean isFBLike(
        @WebParam(name = "like", targetNamespace = "")
        String like);

    /**
     * 
     * @param like
     * @return
     *     returns java.lang.Boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "setFBLike", targetNamespace = "http://service.online.mu/", className = "mu.online.service.SetFBLike")
    @ResponseWrapper(localName = "setFBLikeResponse", targetNamespace = "http://service.online.mu/", className = "mu.online.service.SetFBLikeResponse")
    @Action(input = "http://service.online.mu/servicioWeb/setFBLikeRequest", output = "http://service.online.mu/servicioWeb/setFBLikeResponse")
    public Boolean setFBLike(
        @WebParam(name = "like", targetNamespace = "")
        FbLike like);

    /**
     * 
     * @param character
     * @return
     *     returns java.lang.Boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "setLevelChar", targetNamespace = "http://service.online.mu/", className = "mu.online.service.SetLevelChar")
    @ResponseWrapper(localName = "setLevelCharResponse", targetNamespace = "http://service.online.mu/", className = "mu.online.service.SetLevelCharResponse")
    @Action(input = "http://service.online.mu/servicioWeb/setLevelCharRequest", output = "http://service.online.mu/servicioWeb/setLevelCharResponse")
    public Boolean setLevelChar(
        @WebParam(name = "character", targetNamespace = "")
        CharacterbyID character);

    /**
     * 
     * @param credits
     * @return
     *     returns java.lang.Boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "addCredit", targetNamespace = "http://service.online.mu/", className = "mu.online.service.AddCredit")
    @ResponseWrapper(localName = "addCreditResponse", targetNamespace = "http://service.online.mu/", className = "mu.online.service.AddCreditResponse")
    @Action(input = "http://service.online.mu/servicioWeb/addCreditRequest", output = "http://service.online.mu/servicioWeb/addCreditResponse")
    public Boolean addCredit(
        @WebParam(name = "credits", targetNamespace = "")
        Credits credits);

}
