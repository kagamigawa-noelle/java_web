import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.auth0.jwt.interfaces.DecodedJWT;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
/**
 * @desc   使用token验证用户是否登录
 * @author zm
 **/
public class TokenUtils {
    //设置过期时间
    private static final long EXPIRE_DATE=30*60*100000;
    //token秘钥
    private static final String TOKEN_SECRET = "ZCfasfhuaUUHufguGuwu2020BQWE";

    public static String token (String username,String password){

        String token = "";
        try {
            //过期时间
            Date date = new Date(System.currentTimeMillis()+EXPIRE_DATE);
            //秘钥及加密算法
            Algorithm algorithm = Algorithm.HMAC256(TOKEN_SECRET);
            //设置头部信息
            Map<String,Object> header = new HashMap<>();
            header.put("typ","JWT");
            header.put("alg","HS256");
            //携带username，password信息，生成签名
            token = JWT.create()
                    .withHeader(header)
                    .withClaim("username",username)
                    .withClaim("password",password).withExpiresAt(date)
                    .sign(algorithm);
        }catch (Exception e){
            e.printStackTrace();
            return  null;
        }
        return token;
    }

    public static boolean verify(String token){
        /**
         * @desc   验证token，通过返回true
         * @params [token]需要校验的串
         **/
        try {
            Algorithm algorithm = Algorithm.HMAC256(TOKEN_SECRET);
            JWTVerifier verifier = JWT.require(algorithm).build();
            DecodedJWT jwt = verifier.verify(token);
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return  false;
        }
    }
    public static String getToken() {
        Calendar instance = Calendar.getInstance();
        instance.add(Calendar.SECOND, 5);
        String token = JWT.create()
                //头可以不指定一般用默认值
                .withClaim("username", "张三")//payLoad
                .withClaim("userId", 1)
                .withExpiresAt(instance.getTime()) //指定令牌的过期时间
                .sign(Algorithm.HMAC256("00oo19981115")); // Singnature
        //Algorithm.ECDSA256()使用哪种加密算法  括号中写自己指定的密钥
//        System.out.println(token);
        return token;
    }
    public static boolean verfifyToken(String token) {
        //require  解密    传入加密的签名
        //创建验证对象
        try {
            JWTVerifier jwtVerifier = JWT.require(Algorithm.HMAC256("00oo19981115")).build();
            //使用验证对象中的验证方法  传入生成的JWT串  会返回一个解码的JWT
            DecodedJWT decodedJWT = jwtVerifier.verify(token);
            return true;
        } catch (IllegalArgumentException e) {
            return false;
        } catch (JWTVerificationException e) {
            return false;
        }
        //获取解码之后的数据信息
//        System.out.println(decodedJWT.getPayload());
//        System.out.println("userId为 ： "+decodedJWT.getClaim("userId").asInt());
//        System.out.println("userName为 ： "+decodedJWT.getClaim("username").asString());
//        System.out.println(decodedJWT.getClaims());
        //获取过期时间
//        System.out.println("过期时间为 ： "+decodedJWT.getExpiresAt());
    }

    public static void main(String[] args) {

        String token= getToken();
        boolean rs= verfifyToken(token);
        System.out.println(rs);
    }
}
