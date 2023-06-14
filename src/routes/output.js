const express = require('express');
const router = express.Router();
const outputController = require('../controller/output');
router.post('/datas',outputController.sendData);
module.exports = router;