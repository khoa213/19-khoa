const validate = (req,res,next) => {
    const {username,password} = req.body;
    console.log('type of: ', typeof req.body)
    console.log("data: " ,req.body);
    if (username.length > 20 ) {
        // next("username or password too long");
        res.status(400).json({
            error: 'username too long'
        });
    }
    if ( password.length > 8) {
        // next("username or password too long");
        res.status(400).json({
            error: ' password too long'
        });
    }
    next();
}
module.exports = validate;