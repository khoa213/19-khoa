const validate = (req,res,next) => {
    const {username,password} = req.body;
    console.log('type of: ', typeof req.body)
    console.log("data: " ,req.body);
    if (username.length > 20 || password.length > 8) {
        next("username or password too long");
    }
    next();
}
module.exports = validate;